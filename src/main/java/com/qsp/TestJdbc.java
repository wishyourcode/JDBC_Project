package com.qsp;

public class TestJdbc {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Connected");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver Not Connected");
		}
	}
}
