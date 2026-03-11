package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("1st step Implemented");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school", "postgres",
					"root");
			System.out.println("2nd Step Implemented");
			Statement statement = connection.createStatement();
			System.out.println("3rd step implemented");
			String sql = "UPDATE student SET age = 22 WHERE id = 1";
			statement.executeUpdate(sql);
			System.out.println("4th step implemented");
			connection.close();
			System.out.println("5th step implemented");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
