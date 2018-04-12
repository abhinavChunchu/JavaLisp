package com.flight.management.service;

import java.util.List;

import com.flight.management.data.AttendentJDBC;
import com.flight.management.data.AttendentJDBCImpl;
import com.flight.management.domain.Attendent;

public class AttendentServiceImpl implements AttendentService {

	AttendentJDBC attendentJDBC = new AttendentJDBCImpl();

	@Override
	public List<Attendent> getAttendents(Integer id) {
		return attendentJDBC.getAttendents(id);
	}

}
