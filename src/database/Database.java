package database;

import java.sql.*;

public class Database {
	private static final String DATABASE_URL ="jdbc:mysql://localhost:3306/viagem";
	private static final String USER_NAME = "root";
	private static final String  PASSWORD = "F1 e melhor que INDY";
	
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD);
			System.out.println("CONECTOU");
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}	
			
	}
}