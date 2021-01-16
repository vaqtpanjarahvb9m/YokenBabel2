package controller;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.*;


public class Login {
	
	String id;
	String password;
	String role;
	String error;
	private boolean next;

	public Login(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public boolean loginQuery(){
		Connection connected = (Connection) Connexion.connect();
		String query = "SELECT Username, Password FROM tbUsers WHERE Username = '"+this.id+"' AND Password = '"+this.password+"'";
		
		try{
			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			/*String next = result.getString(1);
			JOptionPane.showMessageDialog(null, next);*/
			connected.close();
			return true; //result.next();

		}
		catch(Exception e){
			this.error = "Error \n" + e;
			return false;
		}
	}

}