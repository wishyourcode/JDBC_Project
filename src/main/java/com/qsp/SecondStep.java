package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondStep {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Connected");
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school","postgres","root");
			System.out.println("Connection Established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection Failed");
		}

	}

}
