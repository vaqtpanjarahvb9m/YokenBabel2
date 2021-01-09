package controller;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class Login {
	
	String id;
	String password;
	String role;
	String error;

	public Login(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public boolean loginQuery(){
		Connection connected = (Connection) Connexion.connect();
		String query = "SELECT username, password FROM users WHERE username = '"+this.id+"' AND password = '"+this.password+"'";
		
		try{
			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			return result.next();

			
		}
		catch(Exception e){
			this.error = "Error \n" + e;
			return false;
		}
	}

}
