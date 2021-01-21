/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author anonybook
 */
public class AbsenceByEleve {
    
    private int id;
    private int Type;
    private Date Date;
    private String Notes;
    private int id_tbUsers;
    private int id_tbClass;
    
    
    //Constructeur pour Ajout/Modif
    public AbsenceByEleve(int Type, Date Date, String Notes, int id_tbUsers, int id_tbClass) {
        
        this.id = id;
        this.Type = Type;
        this.Date = Date;
        this.Notes = Notes;
        this.id_tbUsers = id_tbUsers;
        this.id_tbClass = id_tbClass;
        
    }
    
    
    //Constructeur pour Affichage
    public AbsenceByEleve(int Type, Date date, String Notes){

        this.Type = Type;        
        this.Date = Date;        
        this.Notes = Notes;
                
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getType() {
        return Type;
    }

    public int getId_tbUsers() {
        return id_tbUsers;
    }

    public void setId_tbUsers(int id_tbUsers) {
        this.id_tbUsers = id_tbUsers;
    }

    public int getId_tbClass() {
        return id_tbClass;
    }

    public void setId_tbClass(int id_tbClass) {
        this.id_tbClass = id_tbClass;
    }

    public Date getDate() {
        return Date;
    }

    public String getNotes() {
        return Notes;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    
    
}
