/*
 * Created by JFormDesigner on Fri Mar 31 11:35:20 CEST 2017
 */

package view;


import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;

import controller.Config;
import controller.CryptePass;
import controller.Login;

//import com.alee.laf.WebLookAndFeel;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author yoken & timothée
 */
public class GraphLogin extends JFrame {
    
    
    
    public GraphLogin() {
        initComponents();
    }

    public JTextField getIdentifiant() {
        return identifiant;
    }

    public JPasswordField getPassword() {
        return password;
    }


//    public static void main(String[] args) {
//
//        //Accueil frame = new Accueil();
//        //frame.setVisible(true);
//
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                  //  WebLookAndFeel.install();
//                    GraphLogin frame = new GraphLogin();
//                    frame.setVisible(true);
//                    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                } catch (Exception e) {
//                   // e.printStackTrace();
//                }
//            }
//        });

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


    private void btnValiderActionPerformed(ActionEvent e) {

        Config conf = new Config();

        String id = identifiant.getText();
        String pass = password.getText();

        //Encryptage du mot de passe
        //CryptePass crypt = new CryptePass();
        //String pass = crypt.encrypt(password.getText(), conf.getKey());


        Login log = new Login(id, pass);

        log.loginQuery();

        if(log.loginQuery() == true){
            dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Accueil frame = new Accueil();
                        frame.setVisible(true);
                        frame.setSize(1024, 768);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        frame.setResizable(false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void btnValiderKeyPressed(KeyEvent e) {

    }

    private void clickValider(ActionEvent e) {
        // TODO add your code here
    }

    //Raccourci clavier valider via "ENTER"
    private void passwordKeyTyped(KeyEvent e) {
        Config conf = new Config();

        String id = identifiant.getText();
        String pass = password.getText();

        //Encryptage du mot de passe
        //CryptePass crypt = new CryptePass();
        //String pass = crypt.encrypt(password.getText(), conf.getKey());


        Login log = new Login(id, pass);

        log.loginQuery();

        if(log.loginQuery() == true){
            dispose();
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Accueil frame = new Accueil();
                        frame.setVisible(true);
                        frame.setSize(1024, 768);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        frame.setResizable(false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yoken Babel
        identifiant = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        btnAnnuler = new JButton();
        btnValider = new JButton();
        password = new JPasswordField();

        //======== this ========
        setFont(new Font("Tahoma", Font.PLAIN, 24));
        Container contentPane = getContentPane();

        //---- identifiant ----
        identifiant.setFont(new Font("Tahoma", Font.PLAIN, 18));

        //---- label1 ----
        label1.setText("Identifiant");
        label1.setFont(new Font("Tahoma", Font.PLAIN, 24));

        //---- label2 ----
        label2.setText("Mot de Passe");
        label2.setFont(new Font("Tahoma", Font.PLAIN, 24));

        //---- btnAnnuler ----
        btnAnnuler.setText("Annuler");
        btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 20));

        //---- btnValider ----
        btnValider.setText("Valider");
        btnValider.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnValider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnValiderActionPerformed(e);
                btnValiderActionPerformed(e);
                clickValider(e);
            }
        });
        btnValider.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                btnValiderKeyPressed(e);
            }
        });

        //---- password ----
        password.setFont(new Font("Tahoma", Font.PLAIN, 18));
        password.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                passwordKeyTyped(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(135, 135, 135)
                    .add(contentPaneLayout.createParallelGroup()
                        .add(label2)
                        .add(label1)
                        .add(btnValider, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
                    .add(51, 51, 51)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(49, 49, 49)
                            .add(btnAnnuler, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                        .add(identifiant, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .add(password, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addContainerGap(103, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .add(79, 79, 79)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label1)
                        .add(identifiant, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                    .add(86, 86, 86)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(label2)
                        .add(password, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.RELATED, 70, Short.MAX_VALUE)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                        .add(btnAnnuler, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                        .add(btnValider, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                    .add(88, 88, 88))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yoken Babel
    private JTextField identifiant;
    private JLabel label1;
    private JLabel label2;
    private JButton btnAnnuler;
    private JButton btnValider;
    private JPasswordField password;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}