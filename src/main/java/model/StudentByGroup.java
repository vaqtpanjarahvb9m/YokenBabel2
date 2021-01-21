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
public class StudentByGroup {
   
   private String Name; 
   private String FirstName;  
   private String TypeGr;   

    public StudentByGroup(String Name, String FirstName, String Categories, String TypeGr) {
        this.Name = Name;
        this.FirstName = FirstName;
        this.TypeGr = TypeGr;
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

    public String getTypeGr() {
        return TypeGr;
    }

    public void setTypeGr(String TypeGr) {
        this.TypeGr = TypeGr;
    }
    
   
   
   
}
