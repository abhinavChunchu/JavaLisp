package com.flight.management.thread;

import java.util.List;

import com.flight.management.domain.Flight;
import com.flight.management.service.AttendentService;
import com.flight.management.service.AttendentServiceImpl;

public class FlightAttendentMapperThread implements Runnable {

	private List<Flight> flights;
	private boolean finished = false;

	public FlightAttendentMapperThread(List<Flight> subList) {
		this.flights = subList;
		new Thread(this).start();
	}

	@Override
	public void run() {
		AttendentService attendentService = new AttendentServiceImpl();
		for (Flight flight : flights) {
			flight.setAttendents(attendentService.getAttendents(flight.getId()));
		}
		finished = true;
	}

	public boolean isFinished() {
		return finished;
	}

}
