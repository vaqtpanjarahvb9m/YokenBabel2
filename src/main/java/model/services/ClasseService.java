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

import model.Classe;


public class ClasseService {

    Logger logger = LoggerFactory.getLogger(ClasseService.class);

    public ClasseService() {
    }
    /**
     *
     * @param groupe
     * @return
     */
    public ArrayList findAllClass() {

        Connection connect;

        String query = "SELECT Libelle,Session FROM tbClass";

        ArrayList resultat = new ArrayList();

        try {

            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query);

            ResultSet result = ps.executeQuery();

            while (result.next()) {

                String libelle = result.getString("Name");
                String session = result.getString("FirstName");
                    

                Classe c = new Classe(libelle, session);
                resultat.add(c);

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
