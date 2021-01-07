package view;

import java.awt.*;
import javax.swing.*;
import com.alee.laf.menu.*;
import net.miginfocom.swing.*;

/**
 * Created by anonybook on 23/03/2017.
 */
public class MenuApp extends JFrame {




    public MenuApp () {

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yoken Babel
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menu2 = new JMenu();
        menuItem12 = new JMenuItem();
        menuItem1 = new JMenuItem();
        menu3 = new JMenu();
        menuItem4 = new JMenuItem();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Absences");

                //---- menuItem2 ----
                menuItem2.setText("Gestion des absences");
                menu1.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("Justification d'absences");
                menu1.add(menuItem3);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Analyses");

                //---- menuItem12 ----
                menuItem12.setText("Absences \u00e9l\u00e8ve (par mois)");
                menu2.add(menuItem12);

                //---- menuItem1 ----
                menuItem1.setText("Absences \u00e9l\u00e8ve (par trimestre)");
                menu2.add(menuItem1);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("Liste des \u00e9tudiants");

                //---- menuItem4 ----
                menuItem4.setText("Liste des \u00e9tudiants par session");
                menu3.add(menuItem4);
            }
            menuBar1.add(menu3);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yoken Babel
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenu menu2;
    private JMenuItem menuItem12;
    private JMenuItem menuItem1;
    private JMenu menu3;
    private JMenuItem menuItem4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
