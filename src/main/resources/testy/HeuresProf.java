/*
 * Created by JFormDesigner on Sun Apr 02 21:31:38 CEST 2017
 */

package view;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author yok en
 */
public class HeuresProf extends JFrame {
    public HeuresProf() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - yok en
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setTitle("HEURES DES PROFESSEURS - KORNOEIL");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("FILTRE PAR DATE :");

        //---- label2 ----
        label2.setText("DU");

        //---- label3 ----
        label3.setText("AU");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(143, 143, 143)
                            .add(label1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                            .add(43, 43, 43)
                            .add(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .add(18, 18, 18)
                            .add(textField2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.UNRELATED)
                            .add(label3)
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(textField3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(125, 125, 125)
                            .add(scrollPane1, GroupLayout.PREFERRED_SIZE, 887, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(136, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(131, 131, 131)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label2)
                        .add(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(label3)
                        .add(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .add(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(76, 76, 76)
                    .add(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - yok en
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField2;
    private JTextField textField3;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
