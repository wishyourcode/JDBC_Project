package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HardCodedPreparedStt {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school", "postgres",
					"root");
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "Modi");
			preparedStatement.setInt(3, 75);
			preparedStatement.execute();
			System.out.println("Inserted");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
