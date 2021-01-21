/*
 * Created by JFormDesigner on Fri Apr 14 11:07:07 CEST 2017
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.Config;
import controller.Login;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Yoken Babel & Timothée Montias
 */
public class Accueil extends JFrame {
    public Accueil() {
        initComponents();
    }
    //public GestionAbsences(){}

    // Modification du la vue
    private void changePanel(JPanel panel) {
        getContentPane().removeAll();
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().doLayout();
        update(getGraphics());
    }

    private void menuItem2MouseClicked(MouseEvent e) {

        try {
            GestionAbsences frame = new GestionAbsences();
            frame.setVisible(true);
            frame.setSize(1024, 768);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setResizable(false);
        } catch (Exception pe) {
            pe.printStackTrace();
        }
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
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        setTitle("ACCUEIL - KORNOEIL");
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Absences");

                //---- menuItem2 ----
                menuItem2.setText("Gestion des absences");
                menuItem2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        menuItem2MouseClicked(e);
                    }
                });
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
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setText("img");

        //---- label2 ----
        label2.setText("Outil p\u00e9dagogique tout \u00e7a");

        //---- label3 ----
        label3.setText("Application de gestion d'absences et d'\u00e9l\u00e8ves");

        //---- label4 ----
        label4.setText("Bienvenue dans votre espace");

        //---- label5 ----
        label5.setText("varProf");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(0, 433, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .add(label1)
                            .add(540, 540, 540))
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .add(label2)
                            .add(464, 464, 464))
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .add(label3)
                            .add(405, 405, 405))))
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(485, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .add(label4)
                            .add(458, 458, 458))
                        .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                            .add(label5)
                            .add(534, 534, 534))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(81, 81, 81)
                    .add(label1)
                    .addPreferredGap(LayoutStyle.RELATED, 141, Short.MAX_VALUE)
                    .add(label2)
                    .add(61, 61, 61)
                    .add(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .add(150, 150, 150)
                    .add(label4)
                    .add(39, 39, 39)
                    .add(label5)
                    .add(64, 64, 64))
        );
        pack();
        setLocationRelativeTo(getOwner());
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
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}