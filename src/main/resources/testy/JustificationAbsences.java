/*
 * Created by JFormDesigner on Sun Apr 02 20:44:08 CEST 2017
 */

package view;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author yok en
 */
public class JustificationAbsences extends JFrame {
    public JustificationAbsences() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yok en
        textField1 = new JTextField();
        label2 = new JLabel();
        button1 = new JButton();
        label4 = new JLabel();
        comboBox2 = new JComboBox();
        label5 = new JLabel();
        comboBox3 = new JComboBox();
        comboBox4 = new JComboBox();
        label6 = new JLabel();

        //======== this ========
        setTitle("JUSTIFICATION D'ABSENCE - KORNOEIL");
        Container contentPane = getContentPane();

        //---- label2 ----
        label2.setText("JUSTIFICATION :");

        //---- button1 ----
        button1.setText("SAUVEGARDER");

        //---- label4 ----
        label4.setText("SESSION :");

        //---- label5 ----
        label5.setText("\u00c9L\u00c8VE :");

        //---- label6 ----
        label6.setText("ABSENCE :");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(57, 57, 57)
                            .add(contentPaneLayout.createParallelGroup()
                                .add(label4)
                                .add(label5)
                                .add(label6))
                            .add(68, 68, 68)
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING, false)
                                .add(GroupLayout.LEADING, comboBox4, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .add(GroupLayout.LEADING, comboBox3, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .add(comboBox2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(61, 61, 61)
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                                .add(button1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .add(contentPaneLayout.createParallelGroup()
                                    .add(label2)
                                    .add(textField1, GroupLayout.PREFERRED_SIZE, 693, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(49, 49, 49)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(label4))
                    .add(35, 35, 35)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label5)
                        .add(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .add(37, 37, 37)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(label6))
                    .addPreferredGap(LayoutStyle.RELATED, 71, Short.MAX_VALUE)
                    .add(label2)
                    .add(18, 18, 18)
                    .add(textField1, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
                    .add(18, 18, 18)
                    .add(button1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .add(23, 23, 23))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yok en
    private JTextField textField1;
    private JLabel label2;
    private JButton button1;
    private JLabel label4;
    private JComboBox comboBox2;
    private JLabel label5;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
