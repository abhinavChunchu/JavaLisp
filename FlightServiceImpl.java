package com.flight.management.service;

import java.util.List;

import com.flight.management.data.FlightJDBC;
import com.flight.management.data.FlightJDBCImpl;
import com.flight.management.domain.Flight;

public class FlightServiceImpl implements FlightService {

	private FlightJDBC flightJDBC = new FlightJDBCImpl();

	@Override
	public List<Flight> getAllFlights() {
		return flightJDBC.getAllFlights();
	}

}
