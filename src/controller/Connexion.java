package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class  Connexion {
	
	public Connexion() {

		Config conf = new Config();
		
		String url = conf.getUrl();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection(url, conf.getUsername(), conf.getPassword());
		}
		catch(Exception e){
			System.err.println("Error : " + e);
		} 
		
	}
	
	public static Connection connect(){
		
		Config conf = new Config();
		
		String url = conf.getUrl();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url, conf.getUsername(), conf.getPassword());
			return connect;
		}
		catch(Exception e){
			System.err.println("Driver loading error : " + e);
			return null;
		}
	}
	

}
