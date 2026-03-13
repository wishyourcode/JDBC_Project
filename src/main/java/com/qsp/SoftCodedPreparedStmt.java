package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SoftCodedPreparedStmt {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school", "postgres",
					"root");
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student VALUES (?,?,?)");
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the ID ");
			int id = input.nextInt();
			input.nextLine();
			System.out.println("Enter the Name ");
			String name = input.nextLine();
			System.out.println("Enter the Age");
			int age = input.nextInt();
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.execute();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
