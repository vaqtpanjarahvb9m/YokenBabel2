package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  Connexion {
	
//	public Connexion() {
//
//		Config conf = new Config();
//		
//		String url = conf.getUrl();
//		
//		try{
//			Class.forName("com.mysql.jdbc.Driver");
//			DriverManager.getConnection(url, conf.getUsername(), conf.getPassword());
//		}
//		catch(Exception e){
//			System.err.println("Error : " + e);
//		} 
//		
//	}
	
	public static Connection connect() throws ClassNotFoundException, SQLException{
		
		Config conf = new Config();
		String url = conf.getUrl();
		Connection connection= null;		
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, conf.getUsername(), conf.getPassword());
			               
                return connection;
	}
	

}
