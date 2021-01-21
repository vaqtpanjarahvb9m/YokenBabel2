/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author faulken
 */
public class StudentByClass {
   
   private String Name; 
   private String FirstName;
   private String Libelle;
   private String Session;

    public StudentByClass(String Name, String FirstName, String Libelle, String Session) {
        
        this.Name = Name;
        this.FirstName = FirstName;
        this.Libelle = Libelle;
        this.Session = Session;

    }
    
    //Constructeur recherche eleve
        public StudentByClass(String Name, String FirstName) {
        this.Name = Name;
        this.FirstName = FirstName;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    } 

    public String getLibelle() {
        return Libelle;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String Session) {
        this.Session = Session;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }
    
   
   
   
}
