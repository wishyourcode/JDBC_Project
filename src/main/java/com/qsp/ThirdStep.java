package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ThirdStep {
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
			String sql = "INSERT INTO student VALUES(4, 'Shivam Mishra',23), (5, 'Gautam Shukla',22),(6,'Vishu Mishra', 23)";
			statement.executeUpdate(sql);
			System.out.println("4th step implemented");
			connection.close();
			System.out.println("5th step implemented");
		} catch (SQLException e) {
			// TODO Auto-generated catch block0
			e.printStackTrace();
		}
	}

}
