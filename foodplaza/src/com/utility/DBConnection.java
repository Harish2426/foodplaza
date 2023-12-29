package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
public static Connection con = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodplaza", "root", "Root");
		}catch(Exception e) {
			
		}
		
		return con;
	}

}