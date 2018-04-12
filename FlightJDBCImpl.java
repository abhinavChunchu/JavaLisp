package com.flight.management.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.flight.management.domain.Flight;
import com.flight.management.domain.Flight.FlightType;

public class FlightJDBCImpl extends JDBCComponent implements FlightJDBC {

	@Override
	public List<Flight> getAllFlights() {
		List<Flight> allFlights = new ArrayList<Flight>();
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from flight");
			Flight flight;
			while (rs.next()) {
				flight = new Flight();
				flight.setId(rs.getInt("flight_id"));
				flight.setCompany(rs.getString("company"));
				flight.setFlightType(FlightType.valueOf(rs.getString("flight_type")));
				flight.setCapacity(rs.getInt("capacity"));
				allFlights.add(flight);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allFlights;
	}

}
