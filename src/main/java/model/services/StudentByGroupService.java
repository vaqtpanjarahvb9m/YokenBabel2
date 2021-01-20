package model.services;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import controller.Connexion;
import java.awt.HeadlessException;
import java.sql.SQLException;

import model.DTO.StudentByGroup;

public class StudentByGroupService {

    Logger logger = LoggerFactory.getLogger(StudentByGroupService.class);

    public StudentByGroupService() {
    }

    public String FindPasswordByUsername(String username) throws ClassNotFoundException, SQLException {

        Connection connected = (Connection) Connexion.connect();
        String query = "SELECT Password FROM tbUsers WHERE Username = '" + username + "'";

        String result = null;
        try {
            PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
            ResultSet results = ps.executeQuery();

            if (results.next() == true) {

                result = results.getString("password");

            }

            JOptionPane.showMessageDialog(null, "Utilisateur introuvable");

            connected.close();

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);

        }
        return result;

    }

    /**
     *
     * @param groupe
     * @return
     */
    public ArrayList findStudentByGroup(String groupe) {

        Connection connect;

        StringBuilder query = new StringBuilder("SELECT Name,Firstname,Category,Type_gr FROM tbStudents INNER JOIN tbGroups WHERE tbStudents.id = tbGroups.id_tbStudents AND tbGroups.Type_gr = '");
        query.append(groupe);
        query.append("'");
        ArrayList resultat = new ArrayList();

        try {

            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());

            ResultSet result = ps.executeQuery();

            while (result.next()) {

                String name = result.getString("Name");
                String category = result.getString("Category");
                String firstName = result.getString("firstname");
                String type = result.getString("Type_gr");

                StudentByGroup st = new StudentByGroup(name, firstName, category, type);
                resultat.add(st);

            }
            
            
            ps.close();
            connect.close();
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erreur : de connexion ");
            logger.error(e.getMessage(), e);

        } 

        return resultat;
    }

//    public void InsertNewUsers(String username, String password) {
//
//        Connection connected = (Connection) Connexion.connect();
//        String query = "INSERT INTO tbUsers (Username, Password) VALUES ('" + username + "', '" + password + "')";
//
//        try {
//            Statement statement = (Statement) connected.createStatement();
//            int result = statement.executeUpdate(query);
//
//            statement.close();
//            connected.close();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error " + e);
//        }
//
//    }
//	public ArrayList findStudentByGroup(String groupe) {
//		Connection connected = (Connection) Connexion.connect();
//		String query = "SELECT * FROM tbStudents INNER JOIN tbGroups WHERE tbStudents.id = tbGroups.id_tbStudents AND tbGroups.Type_gr = '" + groupe + "'";
//		ArrayList resultat = new ArrayList();
//
//		try {
//			PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query);
//			ResultSet result = ps.executeQuery();
//			ResultSetMetaData resultMeta = result.getMetaData();
//
//			while (result.next()) {
//				for (int i = 0; i < resultMeta.getColumnCount(); i++)
//					resultat.add(i, result.getObject(i).toString());
//			}
//
//			ps.close();
//			connected.close();
//
//			return resultat;
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "Error : " + e);
//			return resultat;
//		}
//	}
}
