package com.demo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.jdbc.Jdbconnection;
import com.demo.model.User;


public class Tweetdaoimpl implements Tweetdao {

	@Override
	public void TweetusrRedg(String fname,String mname,String lname,String email,String phnnum,String address,String pwd,String gender) {
		Jdbconnection jdbconnection=new Jdbconnection();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con = DriverManager.getConnection(
					 "jdbc:mysql://joshi:3306/Users","joshi","joshi");
			User user=new User();
			PreparedStatement stmt=con.prepareStatement("Insert into tweetusers "
					+ "(fname,mname,lname,phnnum,address,email,pwd,gender) values(?,?,?,?,?,?,?,?)");
			stmt.setString(1, fname);
			stmt.setString(2, mname);
			stmt.setString(3, lname);
			stmt.setString(4, phnnum);
			stmt.setString(5, address);
			stmt.setString(6, email);
			stmt.setString(7, pwd);
			stmt.setString(8, gender);
			stmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
