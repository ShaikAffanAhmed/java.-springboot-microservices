package com.app.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	private static final String URL = "jdbc:mysql://localhost:3306/jdbcconnect";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Shaik@7411";

	private static Connection connection;

	public static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		return connection;
	}
}