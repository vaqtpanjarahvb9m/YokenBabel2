
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DTO.StudentByGroup;
import model.services.StudentByGroupService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faulken
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        String groupe = "SLAM";
        
        StudentByGroupService sqlQuery = new StudentByGroupService();
        
        List<StudentByGroup> findStudentByGroup = sqlQuery.findStudentByGroup(groupe);
        
        
        for (StudentByGroup studentByGroup : findStudentByGroup) {
            System.out.println( studentByGroup.getName());
           
        }
        
    }
    
}
