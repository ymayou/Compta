/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package view;

import compta.OptionsController;
import dao.Connect;
import java.util.Map;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author You
 */
public class Options extends javax.swing.JPanel {

    /**
     * Creates new form Options
     */
    public Options() {
        initComponents();
        setVisible(true);
    }
    
    public void setData(Map<String, String> data)
    {
        txtServer.setText(data.get("SERVER"));
        txtPort.setText(data.get("PORT"));
        txtTable.setText(data.get("TABLENAME"));       
        txtUser.setText(data.get("USER"));
        txtPwd.setText(data.get("PWD"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblServer = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        lblTable = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        txtTable = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        txtServer = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btTest = new javax.swing.JButton();

        lblServer.setText("Host");

        lblPort.setText("Port");

        lblTable.setText("Database");

        lblUser.setText("User");

        lblPwd.setText("Password");

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");

        btTest.setText("Test the connection");
        btTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPwd)
                            .addComponent(lblUser))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(btTest, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTable)
                            .addComponent(lblPort)
                            .addComponent(lblServer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtServer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServer)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPort)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTable)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btCancel)
                    .addComponent(btTest))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        Properties prop = new Properties();
        prop.setProperty("SERVER", txtServer.getText());
        prop.setProperty("PORT", txtPort.getText());
        prop.setProperty("TABLENAME", txtTable.getText());
        prop.setProperty("USER", txtUser.getText());
        prop.setProperty("PWD", new String(txtPwd.getPassword()));
        OptionsController optControl = new OptionsController();
        optControl.saveOptions(prop);
    }//GEN-LAST:event_btSaveActionPerformed

    private void btTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestActionPerformed
        if (Connect.testConnection(txtServer.getText(), txtPort.getText(), txtTable.getText(), txtUser.getText(), new String(txtPwd.getPassword())))
            JOptionPane.showMessageDialog(this.getParent(), "Test successfull.", "Database connection ok", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this.getParent(), "It is not possible to connect to the database server with these informations.\nPlease, fill the form with the good informations and start the database server.", "Database connection error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btTest;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblServer;
    private javax.swing.JLabel lblTable;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtPort;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtTable;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
