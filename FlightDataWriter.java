package com.flight.management.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.flight.management.domain.Attendent;
import com.flight.management.domain.Flight;

public class FlightDataWriter {

	private final String BASE_FOLDER = "c:\\flights\\";

	public void writeData(List<Flight> allFlights) {
		String filename = "flight_" + System.currentTimeMillis() + ".txt";
		try {
			FileWriter fw = new FileWriter(BASE_FOLDER + filename);
			for (Flight flight : allFlights) {
				fw.write(flight.toString());
				fw.write(System.lineSeparator());
				for (Attendent attendent : flight.getAttendents()) {
					fw.write(attendent.toString());
					fw.write(System.lineSeparator());
				}
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
