package com.example.crewr.myandroidapplication.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {

	static Connection con;
	static PreparedStatement ps;
	public int insertCustomer(Customer c) {

		int status=0;
		try{
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into customer (username, password, firstname, lastname, phone, email) values(?,?,?,?,?,?)");
			ps.setString(1, c.getUserName());
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getFirstName());
			ps.setString(4, c.getLastName());
			ps.setString(5, c.getPhone());
			ps.setString(6, c.getEmail());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){
			System.out.println("You have exception error on insert customer" + e);
		}
		return status;
	}

	public Customer getCustomer(String username, String pass) {
		Customer c=new Customer();
try{
		con=MyConnectionProvider.getCon();
		ps=con.prepareStatement("select * from customer where username=? and password=?");
		ps.setString(1, username);
		ps.setString(2, pass);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			c.setUserName(rs.getString(1));
			c.setPassword(rs.getString(2));
			c.setFirstName(rs.getString(3));
			c.setLastName(rs.getString(4));
			c.setPhone(rs.getString(5));
			c.setEmail(rs.getString(6));
		}
		
		}catch(Exception e){
			System.out.println("You have exception error on select customer" + e);
		}
		return c;
	}

}
