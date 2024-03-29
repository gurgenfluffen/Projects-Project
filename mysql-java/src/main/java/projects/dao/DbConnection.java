package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

public class DbConnection {

	private static final String HOST = "localhost";
	private static final String PASSWORD = "projects";
	private static final int PORT = 3306;
	private static final String SCHEMA = "projects";
	private static final String USER = "projects";

	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);

		try {
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection to " + SCHEMA + " is successful.");
			return con;
		} catch (SQLException e) {
			System.out.println("Unable to connect at " + url);
			throw new DbException("Unable to connect at " + url);
		}
	}
}
