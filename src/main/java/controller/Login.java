package controller;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

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

    public boolean createUser() throws ClassNotFoundException, SQLException{


        StringBuilder query = new StringBuilder("INSERT INTO tbUsers (Username, Mail, Role, Password, Name, Surname) VALUES ('"); 
        query.append(this.id);
        query.append("','admin@Gloogle.fr','0','");
        query.append(this.password);
        query.append("','Ivan','Admin Syst')");


        try {

            Connection connected = (Connection) Connexion.connect();
            PreparedStatement ps = (PreparedStatement) connected.prepareStatement(query.toString());

            boolean good = false;
            int ajoutUser = ps.executeUpdate(); 
            if(ajoutUser < 0) {

                ps.close();
                connected.close();
                return true;
            }   
            else{
                ps.close();
                connected.close();                
                return false;
            }


            

        } catch (Exception e) {

            this.error = "Error \n" + e;
            return false;
        }
        
    }

    public boolean loginQuery() throws ClassNotFoundException, SQLException{



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