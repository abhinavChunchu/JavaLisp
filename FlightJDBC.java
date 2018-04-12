package com.flight.management.data;

import java.util.List;

import com.flight.management.domain.Flight;

public interface FlightJDBC {
	public List<Flight> getAllFlights();
}
