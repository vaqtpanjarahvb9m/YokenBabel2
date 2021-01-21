/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anonybook
 */
public class Classe {
    
    private String Libelle;
    private String Session;

    public Classe(String Libelle, String Session) {
        this.Libelle = Libelle;
        this.Session = Session;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String Session) {
        this.Session = Session;
    }
    
   
    
}
