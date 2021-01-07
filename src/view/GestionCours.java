/*
 * Created by JFormDesigner on Fri Mar 24 18:20:19 CET 2017
 */

package view;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author yok en
 */
public class GestionCours extends JFrame {
    public GestionCours() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yok en
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox();
        label1 = new JLabel();
        comboBox4 = new JComboBox();
        label2 = new JLabel();
        label3 = new JLabel();
        comboBox5 = new JComboBox();
        comboBox6 = new JComboBox();
        label4 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        textArea1 = new JTextArea();
        textField1 = new JTextField();
        textField2 = new JTextField();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("AJOUT COURS - KORNOEIL");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("DE");

        //---- label2 ----
        label2.setText("\u00c0");

        //---- label3 ----
        label3.setText("DATE");

        //---- label4 ----
        label4.setText("text");

        //---- label6 ----
        label6.setText("SESSIONS");

        //---- label7 ----
        label7.setText("MATIERE");

        //---- label8 ----
        label8.setText("TH\u00c8ME DU COURS");

        //---- label9 ----
        label9.setText("CAHIER DE TEXTE");

        //---- checkBox1 ----
        checkBox1.setText("Cours");

        //---- checkBox2 ----
        checkBox2.setText("Travaux Dirig\u00e9s");

        //---- checkBox3 ----
        checkBox3.setText("Travaux Pratiques");

        //---- label10 ----
        label10.setText("img");

        //---- label11 ----
        label11.setText("img");

        //---- label12 ----
        label12.setText("img");

        //---- label13 ----
        label13.setText("img");

        //---- button1 ----
        button1.setText("SAUVEGARDER");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createParallelGroup()
                    .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addContainerGap(743, Short.MAX_VALUE)
                        .add(label4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(450, Short.MAX_VALUE)))
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(19, 19, 19)
                    .add(label13, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
                    .add(54, 54, 54)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(label10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(label3)
                            .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(comboBox5, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                            .add(59, 59, 59)
                            .add(label11, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .add(7, 7, 7)
                            .add(label1)
                            .add(18, 18, 18)
                            .add(comboBox2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .add(22, 22, 22)
                            .add(label2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.UNRELATED)
                            .add(comboBox1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(label12, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(label6)
                                    .addPreferredGap(LayoutStyle.UNRELATED)
                                    .add(comboBox4, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(label7)
                                    .add(18, 18, 18)
                                    .add(comboBox6, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)))))
                    .add(83, 83, 83))
                .add(contentPaneLayout.createSequentialGroup()
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(247, 247, 247)
                            .add(textArea1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(106, 106, 106)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(label9)
                                    .add(30, 30, 30)
                                    .add(textField2, GroupLayout.PREFERRED_SIZE, 759, GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(contentPaneLayout.createParallelGroup()
                                        .add(checkBox1)
                                        .add(checkBox2)
                                        .add(checkBox3)
                                        .add(button1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(label8)
                                    .add(30, 30, 30)
                                    .add(textField1, GroupLayout.PREFERRED_SIZE, 759, GroupLayout.PREFERRED_SIZE)))))
                    .add(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createParallelGroup()
                    .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addContainerGap(549, Short.MAX_VALUE)
                        .add(label4, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(216, Short.MAX_VALUE)))
                .add(contentPaneLayout.createSequentialGroup()
                    .add(54, 54, 54)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup()
                                .add(label10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .add(label11, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(34, 34, 34)
                                    .add(contentPaneLayout.createParallelGroup()
                                        .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
                                            .add(comboBox2)
                                            .add(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .add(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .add(label2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                        .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                            .add(comboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .add(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .add(contentPaneLayout.createParallelGroup()
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(64, 64, 64)
                                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                        .add(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .add(47, 47, 47)
                                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                        .add(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(comboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(76, 76, 76)
                                    .add(label12, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.RELATED, 9, GroupLayout.PREFERRED_SIZE)))
                            .add(150, 150, 150)
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(label8)
                                .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .add(29, 29, 29)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .add(checkBox1)
                                    .add(18, 18, 18)
                                    .add(checkBox2)
                                    .add(18, 18, 18)
                                    .add(checkBox3)
                                    .add(24, 24, 24)
                                    .add(button1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                    .add(72, 72, 72))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                        .add(label9)
                                        .add(textField2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
                                    .add(122, 122, 122))))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(label13, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
                            .add(334, 334, 334)))
                    .add(textArea1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yok en
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel label1;
    private JComboBox comboBox4;
    private JLabel label2;
    private JLabel label3;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JLabel label4;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextArea textArea1;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
