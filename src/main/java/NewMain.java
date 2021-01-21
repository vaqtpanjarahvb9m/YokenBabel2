
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.WindowConstants;
import model.StudentByGroup;
import model.AbsenceByEleve;
import model.services.AbsenceEleveService;
import model.services.StudentByGroupService;
import view.GraphLogin;
import view.NewGraphLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Babel Yoken
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        String groupe = "SLAM";
        int id = '0';
        
        // Instantiation du Singleton
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                  //  WebLookAndFeel.install();
                    NewGraphLogin frame = new NewGraphLogin();
                    frame.setVisible(true);
                    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                } catch (Exception e) {
                     e.printStackTrace();
                }
            }
        });
        
                
//                
//        AbsenceEleveService sqlQuery = new AbsenceEleveService();
//        
//        List<AbsenceEleve> findAbsenceEleve = sqlQuery.findAbsenceEleve(id);
//        
//        
//        for (AbsenceEleve absenceEleve : findAbsenceEleve) {
//            System.out.println( absenceEleve.getType());
//            System.out.println( absenceEleve.getDate());
//            System.out.println( absenceEleve.getNotes());
//           
//        }
        
        
//        StudentByGroupService sqlQuery = new StudentByGroupService();
//        
//        List<StudentByGroup> findStudentByGroup = sqlQuery.findStudentByGroup(groupe);
//        
//        
//        for (StudentByGroup studentByGroup : findStudentByGroup) {
//            System.out.println( studentByGroup.getName());
//           
//        }
        
    }
    
}
