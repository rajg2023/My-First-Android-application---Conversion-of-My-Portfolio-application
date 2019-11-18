package com.example.crewr.myandroidapplication.login;

public interface MyProvider {
	
	// set the postgres db url, username, and password
	String url = "jdbc:postgresql://ec2-54-227-237-223.compute-1.amazonaws.com:5432/dde5nv2s4avttf?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
	String username = "mdoxaevgiwnvmd";
	String pwd = "2a871683b1140322e3311f9367702629f7ec7646c0c4f5025698c71090825cff";
//	 Class.forName("org.postgresql.Driver");
	// get and return connection
	//connection = DriverManager.getConnection(url, username, password);
	// return connection;
}
