package com.example.crewr.myandroidapplication.login;

public interface CustomerDAO {

	public int insertCustomer(Customer c);
	public Customer getCustomer(String username, String pass);
	
	
}
