package com.flight.management.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flight.management.domain.Attendent;
import com.flight.management.domain.Attendent.AttendentType;

public class AttendentJDBCImpl extends JDBCComponent implements AttendentJDBC {

	@Override
	public List<Attendent> getAttendents(Integer id) {
		List<Attendent> allAttendents = new ArrayList<Attendent>();
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement("select * from attendent where flight_id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			Attendent attendent;
			while (rs.next()) {
				attendent = new Attendent();
				attendent.setId(rs.getInt("attendent_id"));
				attendent.setFlightId(id);
				attendent.setType(AttendentType.valueOf(rs.getString("type")));
				attendent.setExperience(rs.getDouble("experience"));
				allAttendents.add(attendent);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allAttendents;
	}

}
