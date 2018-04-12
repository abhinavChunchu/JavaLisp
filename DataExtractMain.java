package com.flight.management.main;

import java.util.ArrayList;
import java.util.List;

import com.flight.management.domain.Flight;
import com.flight.management.service.FlightService;
import com.flight.management.service.FlightServiceImpl;
import com.flight.management.thread.FlightAttendentMapperThread;
import com.flight.management.writer.FlightDataWriter;

public class DataExtractMain {
	public static void main(String[] args) {

		// 1. get all flights
		FlightService flightService = new FlightServiceImpl();
		List<Flight> allFlights = flightService.getAllFlights();

		// 2. create threads
		int threadCount = 3;
		int flightsPerThread = new Double(Math.floor(allFlights.size() / 3.0)).intValue();
		int start = 0;

		List<FlightAttendentMapperThread> allThreads = new ArrayList<FlightAttendentMapperThread>();
		for (int i = 0; i < threadCount; i++) {
			int end = start + flightsPerThread;
			List<Flight> subList;
			if (i + 1 != threadCount) {
				subList = allFlights.subList(start, end);
			} else {
				subList = allFlights.subList(start, allFlights.size());
			}
			FlightAttendentMapperThread famt = new FlightAttendentMapperThread(subList);
			allThreads.add(famt);
			start = end;
		}

		// wait till all threads complete
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			boolean isComplete = true;
			for (FlightAttendentMapperThread famt : allThreads) {
				if (!famt.isFinished()) {
					isComplete = false;
					break;
				}
			}
			if (isComplete) {
				break;
			}
		}

		// write to the file
		FlightDataWriter fdw = new FlightDataWriter();
		fdw.writeData(allFlights);

	}
}
