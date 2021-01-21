/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.services;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Calendar;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controller.Connexion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdk.internal.org.objectweb.asm.Type;
import model.AbsenceByEleve;
import model.AbsenceByEleve;


/**
 *
 * @author anonybook
 */
public class AbsenceEleveService {
    
    Logger logger = LoggerFactory.getLogger(AbsenceEleveService.class);
    
    public AbsenceEleveService(){
    }    
    
    public ArrayList findAbsenceEleve(int id){
        
        Connection connect;
        StringBuilder query = new StringBuilder("SELECT Type,Date,Notes FROM tbEvents WHERE tbEvents.id_tbStudents = '");
        query.append(id);
        query.append("'");
        
        ArrayList resultat = new ArrayList();
   
        try{
    
            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());
            
            ResultSet result = ps.executeQuery();
            
            while (result.next()){
                
                int type = result.getInt("Type");
                Date date = result.getDate("Date");
                String notes = result.getString("Notes");
                
                AbsenceByEleve ae = new AbsenceByEleve(type, date, notes);
                resultat.add(ae);
            
            }
        
            ps.close();
            connect.close();
               
        }
        catch(SQLException | ClassNotFoundException e){
            
            JOptionPane.showMessageDialog(null, "Erreur : de connexion ");
            logger.error(e.getMessage(), e);
            
        }
        return resultat;
    }
    
    
    public ArrayList findAbsenceEleveMois(int id){
        
        Connection connect;
        StringBuilder query = new StringBuilder("SELECT Type,Date,Notes FROM tbEvents INNERJOIN id_tbStudents WHERE tbEvents.Date < SUBDATE(NOW(), INTERVAL DAY(NOW())- 30 DAY) AND tbEvents.id_tbStudents = tbStudents.id AND tbStudents.id = '");
        query.append(id);
        query.append("' ORDER BY tbEvents.Date DESC");
        
        //Date sqlDate = new Date(Calendar.getInstance().getTime().getTime());
        //query.append("' BETWEEN '");
        //query.append(sqlDate);
        //query.append("' AND '");
        //query.append(sqlDate);

        ArrayList resultat = new ArrayList();
   
        try{
    
            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());
            
            ResultSet result = ps.executeQuery();
            
            while (result.next()){
                
                int type = result.getInt("Type");
                Date date = result.getDate("Date");
                String notes = result.getString("Notes");
                
                AbsenceByEleve ae = new AbsenceByEleve(type, date, notes);
                resultat.add(ae);
            
            }
        
            ps.close();
            connect.close();
               
        }
        catch(SQLException | ClassNotFoundException e){
            
            JOptionPane.showMessageDialog(null, "Erreur : de connexion ");
            logger.error(e.getMessage(), e);
            
        }
        
        return resultat;
        
    }
    
    
    public ArrayList findAbsenceEleveTrimestre(int id){
        
        Connection connect;        
        StringBuilder query = new StringBuilder("SELECT Type,Date,Notes FROM tbEvents INNERJOIN id_tbStudents WHERE tbEvents.Date < SUBDATE(NOW(), INTERVAL DAY(NOW())- 91 DAY) AND tbEvents.id_tbStudents = tbStudents.id AND tbStudents.id = '");
        query.append(id);
        query.append("' ORDER BY tbEvents.Date DESC");

        ArrayList resultat = new ArrayList();
   
        try{
    
            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());
            
            ResultSet result = ps.executeQuery();
            
            while (result.next()){
                
                int type = result.getInt("Type");
                Date date = result.getDate("Date");
                String notes = result.getString("Notes");
                
                AbsenceByEleve ae = new AbsenceByEleve(type, date, notes);
                resultat.add(ae);
            
            }
        
            ps.close();
            connect.close();
               
        }
        catch(SQLException | ClassNotFoundException e){
            
            JOptionPane.showMessageDialog(null, "Erreur : de connexion ");
            logger.error(e.getMessage(), e);
            
        }        
        
        return resultat;
        
    }
    
    
    public void saveNewAbsence(AbsenceByEleve newAbsence){
        
        Connection connect;

        int Type = newAbsence.getType();
        Date Date = newAbsence.getDate();
        String Notes = newAbsence.getNotes();
        int id_tbUsers = newAbsence.getId_tbUsers();
        int id_tbClass = newAbsence.getId_tbClass();
      
        StringBuilder query = new StringBuilder("INSERT INTO tbEvents (Type, Date, Notes, id_tbClass, id_tbStudents) VALUES ('"); 
        query.append(Type);
        query.append("','");
        query.append(Date);
        query.append("','");
        query.append(Notes);
        query.append("',(SELECT id FROM tbClass WHERE tbClass.id = '");
        query.append(id_tbClass);
        query.append("'),(SELECT id FROM tbStudents WHERE tbStudents.id = '");
        query.append(id_tbUsers);
        query.append("')");

        try {
            
            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());
            
            int ajoutAbs = ps.executeUpdate();
            if(ajoutAbs < 0) {
                System.out.println("L'absence a bien été ajouté!");
            }
            
            ps.close();
            connect.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erreur: de connexion");
            logger.error(e.getMessage(), e);
            
        }
    }
    
    
     public void updateAbsence(AbsenceByEleve updatedAbsence){
        
        Connection connect;
        
        int id = updatedAbsence.getId();
        int Type = updatedAbsence.getType();
        Date Date = updatedAbsence.getDate();
        String Notes = updatedAbsence.getNotes();
        int id_tbUsers = updatedAbsence.getId_tbUsers();
        int id_tbClass = updatedAbsence.getId_tbClass();
      
        StringBuilder query = new StringBuilder("UPDATE tbEvents SET Type ='");
                //, Date =' , Notes =', id_tbClass=', id_tbStudents=' WHERE id = '"); 
        query.append(Type);
        query.append("', Date = '");
        query.append(Date);
        query.append("', Notes = '");
        query.append(Notes);
        query.append("', (SELECT id FROM tbClass WHERE tbClass.id = '");
        query.append(id_tbClass);
        query.append("'), (SELECT id FROM tbStudents WHERE tbStudents.id = '");
        query.append(id_tbUsers);
        query.append("') WHERE id = '");
        query.append(id);
        query.append("'");

        try {
            
            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());
            
            int ajoutAbs = ps.executeUpdate();
            if(ajoutAbs < 0) {
                System.out.println("L'absence a bien été ajouté!");
            }
            
            ps.close();
            connect.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erreur: de connexion");
            logger.error(e.getMessage(), e);
            
        }
    }
    
    
    public void deleteAbsence(AbsenceByEleve oldAbsence){
        
        Connection connect;

        int id = oldAbsence.getId();
      
        StringBuilder query = new StringBuilder("DELETE FROM tbEvents (Type, Date, Notes, id_tbClass, id_tbStudents) WHERE id = '"); 
        query.append(id);
        query.append("'");
        
        try {
            
            connect = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connect.prepareStatement(query.toString());
            
            int supprAbs = ps.executeUpdate();
            if(supprAbs < 0) {
                System.out.println("L'absence a bien été supprimée!");
            }
            
            ps.close();
            connect.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erreur: de connexion");
            logger.error(e.getMessage(), e);
            
        }        
    }
}
