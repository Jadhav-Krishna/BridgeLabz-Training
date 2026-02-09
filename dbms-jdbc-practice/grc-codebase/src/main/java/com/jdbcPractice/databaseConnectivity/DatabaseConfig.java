package com.jdbcPractice.databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//	Connection with Parameters 

public class DatabaseConfig {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc_training";
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "root");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		return DriverManager.getConnection(url, properties);
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		System.out.println(conn != null);
	}
}
