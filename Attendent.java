package com.flight.management.domain;

public class Attendent {
	private Integer id;
	private Integer flightId;
	private String name;
	private AttendentType type;
	private Double experience;

	@Override
	public String toString() {
		return id + ", " + name + ", " + type + ", " + experience;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AttendentType getType() {
		return type;
	}

	public void setType(AttendentType type) {
		this.type = type;
	}

	public Double getExperience() {
		return experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

	public enum AttendentType {
		Pilot, Hostress
	}
}
