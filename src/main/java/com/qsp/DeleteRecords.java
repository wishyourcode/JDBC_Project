package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
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
			System.out.println("3rd Step Implemented");
			String sql = "DELETE FROM student WHERE id = 2";
			statement.execute(sql);
			System.out.println("Deletation done");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
