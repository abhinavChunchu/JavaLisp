package com.flight.management.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCComponent {
	private final String DB_URL = "jdbc:postgresql:fmsdb";
	private final String DB_USER = "fmsuser";
	private final String DB_PASSWORD = "fms123";

	public JDBCComponent() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}

}
