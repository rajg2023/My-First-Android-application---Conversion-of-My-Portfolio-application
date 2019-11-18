package com.example.crewr.myandroidapplication.login;
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {
	
static Connection con=null;

public static Connection getCon(){
	try{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection(url, username, pwd);	
		
	}catch(Exception e){
		System.out.println(e);
	}
	
	return con;
	
}

}
