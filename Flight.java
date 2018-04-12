package com.flight.management.domain;

import java.util.List;

public class Flight {
	private Integer id;
	private String company;
	private Integer capacity;
	private FlightType flightType;
	private List<Attendent> attendents;

	@Override
	public String toString() {
		return id + ", " + company + ", " + capacity + ", " + flightType;
	}

	public List<Attendent> getAttendents() {
		return attendents;
	}

	public void setAttendents(List<Attendent> attendents) {
		this.attendents = attendents;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public FlightType getFlightType() {
		return flightType;
	}

	public void setFlightType(FlightType flightType) {
		this.flightType = flightType;
	}

	public enum FlightType {
		Domestic, International
	}
}
