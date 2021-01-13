package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import controller.Connexion;

public class SqlQuery {

	public SqlQuery() {
	}

	public String FindPasswordByUsername(String username) {
		Connection connected = (Connection) Connexion.connect();
		String query = "SELECT Password FROM tbUsers WHERE Username = '" + username + "'";

		try {
			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
			ResultSet result = ps.executeQuery();

			if (result.next() == true)
				return result.getString("password");

			JOptionPane.showMessageDialog(null, "Utilisateur introuvable");

			connected.close();
			return null;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error " + e);
			return null;
		}


	}

	public ArrayList findStudentByGroup(String groupe) {
		Connection connected = (Connection) Connexion.connect();
		String query = "SELECT * FROM tbStudents INNER JOIN tbGroups WHERE tbStudents.id = tbGroups.id_tbStudents AND tbGroups.Type_gr = '" + groupe + "'";
		ArrayList resultat = new ArrayList();

		try {
			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			ResultSetMetaData resultMeta = result.getMetaData();


			while (result.next()) {
				for (int i = 0; i < resultMeta.getColumnCount(); i++)
					resultat.add(i, result.getObject(i).toString());
			}

			ps.close();
			connected.close();

			return resultat;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error : " + e);
			return resultat;
		}
	}


	public void InsertNewUsers(String username, String password) {

		Connection connected = (Connection) Connexion.connect();
		String query = "INSERT INTO tbUsers (Username, Password) VALUES ('" + username + "', '" + password + "')";

		try {
			Statement statement = (Statement) connected.createStatement();
			int result = statement.executeUpdate(query);

			statement.close();
			connected.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error " + e);
		}

	}

	public ArrayList findStudentByGroup(String groupe) {
		Connection connected = (Connection) Connexion.connect();
		String query = "SELECT * FROM tbStudents INNER JOIN tbGroups WHERE tbStudents.id = tbGroups.id_tbStudents AND tbGroups.Type_gr = '" + groupe + "'";
		ArrayList resultat = new ArrayList();

		try {
			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			ResultSetMetaData resultMeta = result.getMetaData();

			while (result.next()) {
				for (int i = 0; i < resultMeta.getColumnCount(); i++)
					resultat.add(i, result.getObject(i).toString());
			}

			ps.close();
			connected.close();

			return resultat;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error : " + e);
			return resultat;
		}
	}
}