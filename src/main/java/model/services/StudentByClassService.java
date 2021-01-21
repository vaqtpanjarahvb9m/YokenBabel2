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

import model.StudentByClass;

public class StudentByClassService {

    Logger logger = LoggerFactory.getLogger(StudentByClassService.class);

    public StudentByClassService() {
    }
    /**
     *
     * @param groupe
     * @return
     */
    public ArrayList findStudentByClass(int id) {
        
        Connection connect;

        StringBuilder query = new StringBuilder("SELECT Name,Firstname,Libelle,Session FROM tbStudents INNER JOIN tbClass WHERE tbStudents.id = tbClass.id_tbStudents AND tbClass.id = '");
        query.append(id);
        query.append("'");
        ArrayList resultat = new ArrayList();

        try {

            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());

            ResultSet result = ps.executeQuery();

            while (result.next()) {

                String name = result.getString("Name");
                String firstName = result.getString("FirstName");
                String libelle = result.getString("Libelle");
                String session = result.getString("Session");

                StudentByClass sc = new StudentByClass(name, firstName);
                resultat.add(sc);

            }
            
            
            ps.close();
            connect.close();
        } catch (SQLException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Erreur : de connexion ");
            logger.error(e.getMessage(), e);

        } 

        return resultat;
    }

}