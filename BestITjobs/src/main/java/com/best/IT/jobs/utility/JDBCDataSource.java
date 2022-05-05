package com.best.IT.jobs.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDataSource {
	private JDBCDataSource() {
	}

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bestitjobs", "root", "babaoana1619A");
	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}
}
