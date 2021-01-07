/*
 * Created by JFormDesigner on Thu Mar 30 16:07:18 CEST 2017
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author yok en
 */
public class ListesEtudiants extends JFrame {
    public ListesEtudiants() {
        initComponents();
    }

    private void comboBox1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yok en
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
        vSpacer1 = new JPanel(null);
        comboBox1 = new JComboBox();
        scrollPane1 = new JScrollPane();
        TabEtudiant = new JTable();

        //======== this ========
        setTitle("LISTES ETUDIANTS - KORNOEIL");
        Container contentPane = getContentPane();

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
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setText("SESSION :");

        //---- comboBox1 ----
        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comboBox1ActionPerformed(e);
            }
        });

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(TabEtudiant);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(48, 48, 48)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(147, 147, 147)
                            .add(vSpacer1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(label1)
                            .add(27, 27, 27)
                            .add(comboBox1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE))
                        .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 973, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(47, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(65, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label1)
                        .add(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(3, 3, 3)
                    .add(vSpacer1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .add(31, 31, 31)
                    .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)
                    .add(44, 44, 44))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yok en
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
    private JPanel vSpacer1;
    private JComboBox comboBox1;
    private JScrollPane scrollPane1;
    private JTable TabEtudiant;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
