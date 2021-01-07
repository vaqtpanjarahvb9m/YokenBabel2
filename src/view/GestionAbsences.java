/*
 * Created by JFormDesigner on Thu Apr 06 14:49:26 CEST 2017
 */

package view;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author yok en
 */
public class GestionAbsences extends JFrame {
    public GestionAbsences() {
        initComponents();
    }

    public void initComponents() {
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
        comboBox3 = new JComboBox();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        label4 = new JLabel();
        button1 = new JButton();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        button3 = new JButton();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        label3 = new JLabel();
        button4 = new JButton();
        spinner1 = new JSpinner();
        label5 = new JLabel();
        label6 = new JLabel();
        spinner2 = new JSpinner();
        label7 = new JLabel();
        comboBox2 = new JComboBox();

        //======== this ========
        setTitle("GESTION D'ABSENCES - KORNOEIL");
        setAutoRequestFocus(false);
        setMinimumSize(new Dimension(200, 200));
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Gestion des absences");

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
                menuItem12.setText("Absence \u00e9l\u00e8ve (par mois)");
                menu2.add(menuItem12);

                //---- menuItem1 ----
                menuItem1.setText("Absence \u00e9l\u00e8ve (par trimestre)");
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

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }

        //---- label4 ----
        label4.setText("\u00c9L\u00c8VES ABSENTS :");

        //---- button1 ----
        button1.setText("SAUVEGARDER");

        //---- label1 ----
        label1.setText("SESSION :");

        //---- button3 ----
        button3.setText("SUPPRIMER");

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(list2);
        }

        //---- label3 ----
        label3.setText("SELECTIONNEZ LES \u00c9L\u00c8VES :");

        //---- button4 ----
        button4.setText("AJOUTER");

        //---- label5 ----
        label5.setText("DE :");

        //---- label6 ----
        label6.setText("\u00c0 :");

        //---- label7 ----
        label7.setText("DATE :");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(59, 59, 59)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(70, 70, 70)
                            .add(label3)
                            .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(label4)
                            .add(82, 82, 82))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup()
                                .add(scrollPane2, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(91, 91, 91)
                                    .add(button4, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
                            .add(123, 123, 123)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(button1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .add(button3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.RELATED, 65, GroupLayout.PREFERRED_SIZE))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup()
                                .add(label1)
                                .add(label7))
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(18, 18, 18)
                                    .add(comboBox2))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(18, 18, 18)
                                    .add(comboBox1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(label5)
                                    .addPreferredGap(LayoutStyle.RELATED)
                                    .add(spinner1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                    .add(33, 33, 33)
                                    .add(label6)
                                    .addPreferredGap(LayoutStyle.RELATED)
                                    .add(spinner2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))))
                    .add(69, 69, 69))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(62, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label1)
                        .add(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(28, 28, 28)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label7)
                        .add(label5)
                        .add(label6)
                        .add(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(spinner2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(47, 47, 47)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label4)
                        .add(label3))
                    .add(18, 18, 18)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(scrollPane2, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                            .add(18, 18, 18)
                            .add(button3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
                    .add(18, 18, 18)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(button1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .add(button4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                    .add(51, 51, 51))
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
    private JComboBox comboBox3;
    private JScrollPane scrollPane1;
    private JList list1;
    private JLabel label4;
    private JButton button1;
    private JLabel label1;
    private JComboBox comboBox1;
    private JButton button3;
    private JScrollPane scrollPane2;
    private JList list2;
    private JLabel label3;
    private JButton button4;
    private JSpinner spinner1;
    private JLabel label5;
    private JLabel label6;
    private JSpinner spinner2;
    private JLabel label7;
    private JComboBox comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
