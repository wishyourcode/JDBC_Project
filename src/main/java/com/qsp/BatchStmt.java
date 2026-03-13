package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchStmt {
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
			preparedStatement.setInt(1, 20);
			preparedStatement.setString(2, "Hamid Raza");
			preparedStatement.setInt(3, 28);
			preparedStatement.addBatch();
			preparedStatement.setInt(1, 21);
			preparedStatement.setString(2, "Selvia");
			preparedStatement.setInt(3, 26);
			preparedStatement.addBatch();
			preparedStatement.executeBatch();
			System.out.println("Inserted");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
