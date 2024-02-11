package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbconnection {
	public static void main(String argd[]) throws ClassNotFoundException, SQLException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection(
					 "jdbc:mysql://localhost:3306/users","root","root");
			 if(con!=null) {
				 System.out.println("connected");
				 Statement stmt = con.createStatement();
				 ResultSet rs = stmt.executeQuery("Show tables");
			      System.out.println("Tables in the current database: ");
			      while(rs.next()) {
			         System.out.print(rs.getString(1));
			         System.out.println();
			      }
			 }else {
				 System.out.println("not connected");
			 }
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
