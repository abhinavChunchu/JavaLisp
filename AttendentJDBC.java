package com.flight.management.data;

import java.util.List;

import com.flight.management.domain.Attendent;

public interface AttendentJDBC {

	List<Attendent> getAttendents(Integer id);

}
