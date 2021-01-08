package model;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import controller.Connexion;

public class SqlQuery {

	public SqlQuery() {
	}
	
	public String FindPasswordByUsername(String username){
		Connection connected = (Connection) Connexion.connect();
		String query = "SELECT password FROM users WHERE username = '"+username+"'";
		
		try{
			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			
			if(result.next() == true)
				return result.getString("password");
			
			JOptionPane.showMessageDialog(null, "Utilisateur introuvable");
			
			//connected.close();
			
			return null;
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error "+e);
			return null;
		}
		
		
	}
	
	public void InsertNewUsers(String username, String password){
		
		Connection connected = (Connection) Connexion.connect();
		String query = "INSERT INTO users (username, password) VALUES ('"+username+"', '"+password+"')";
		
		try{
			Statement statement = (Statement) connected.createStatement();
			int result = statement.executeUpdate(query);
			
			statement.close();
			connected.close();
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error "+e);
		}
		
	}
	

}
