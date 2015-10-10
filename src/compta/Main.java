/*
 * Copyright Yacine Mayou
 * Software created by Yacine Mayou
 */
package compta;

import javax.swing.JFrame;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.Infos;

/**
 *
 * @author Tfk
 */
public class Main extends javax.swing.JFrame {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public JFrame top = this;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPan = new javax.swing.JPanel();
        lblYear = new javax.swing.JLabel();
        btBar = new javax.swing.JToolBar();
        btInfos = new javax.swing.JButton();
        btData = new javax.swing.JButton();
        btMonths = new javax.swing.JButton();
        btPatri = new javax.swing.JButton();
        btTaxes = new javax.swing.JButton();
        btAmor = new javax.swing.JButton();
        btStats = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        btOptions = new javax.swing.JButton();
        txtSeach = new javax.swing.JTextField();
        pan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compta_test");
        setName("mainFrame"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        btBar.setFloatable(false);
        btBar.setRollover(true);
        btBar.setName("btBar"); // NOI18N

        btInfos.setText("Infos");
        btInfos.setFocusable(false);
        btInfos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInfos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfosActionPerformed(evt);
            }
        });
        btBar.add(btInfos);

        btData.setText("Data");
        btData.setFocusable(false);
        btData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDataActionPerformed(evt);
            }
        });
        btBar.add(btData);

        btMonths.setText("Months");
        btMonths.setFocusable(false);
        btMonths.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMonths.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btMonths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMonthsActionPerformed(evt);
            }
        });
        btBar.add(btMonths);

        btPatri.setText("Patri");
        btPatri.setFocusable(false);
        btPatri.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPatri.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPatriActionPerformed(evt);
            }
        });
        btBar.add(btPatri);

        btTaxes.setText("Taxes");
        btTaxes.setFocusable(false);
        btTaxes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTaxes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTaxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTaxesActionPerformed(evt);
            }
        });
        btBar.add(btTaxes);

        btAmor.setText("Amor");
        btAmor.setFocusable(false);
        btAmor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAmor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAmor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAmorActionPerformed(evt);
            }
        });
        btBar.add(btAmor);

        btStats.setText("Stats");
        btStats.setFocusable(false);
        btStats.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btStats.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStatsActionPerformed(evt);
            }
        });
        btBar.add(btStats);

        btSearch.setText("Search");
        btSearch.setFocusable(false);
        btSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        btBar.add(btSearch);

        btOptions.setText("Options");
        btOptions.setFocusable(false);
        btOptions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOptions.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOptionsActionPerformed(evt);
            }
        });
        btBar.add(btOptions);

        txtSeach.setText("jTextField1");

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanLayout = new javax.swing.GroupLayout(mainPan);
        mainPan.setLayout(mainPanLayout);
        mainPanLayout.setHorizontalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanLayout.createSequentialGroup()
                .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanLayout.createSequentialGroup()
                        .addComponent(btBar, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanLayout.createSequentialGroup()
                        .addComponent(lblYear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanLayout.setVerticalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanLayout.createSequentialGroup()
                .addComponent(lblYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pan.getAccessibleContext().setAccessibleName("");
        pan.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 608, 465);
    }// </editor-fold>//GEN-END:initComponents

    private void btInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfosActionPerformed
        pan.removeAll();
        Infos infosPan = new Infos();
        infosPan.setSize(pan.getSize());
        pan.add(infosPan);
        this.revalidate();
        this.repaint();
        CategorieController catControl = new CategorieController();
        catControl.displayInfos(infosPan);
    }//GEN-LAST:event_btInfosActionPerformed

    private void btDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDataActionPerformed

    private void btMonthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMonthsActionPerformed
        //tabs.removeAll();
    }//GEN-LAST:event_btMonthsActionPerformed

    private void btPatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPatriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPatriActionPerformed

    private void btTaxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTaxesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTaxesActionPerformed

    private void btAmorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAmorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAmorActionPerformed

    private void btStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btStatsActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    private void btOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btOptionsActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        if(pan.getComponentCount()>0)
        {
            pan.getComponent(0).setSize(pan.getSize());
            pan.revalidate();
        }
    }//GEN-LAST:event_formComponentResized

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    /*private static boolean isMaximized(int state) {
        return (state & this.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAmor;
    private javax.swing.JToolBar btBar;
    private javax.swing.JButton btData;
    private javax.swing.JButton btInfos;
    private javax.swing.JButton btMonths;
    private javax.swing.JButton btOptions;
    private javax.swing.JButton btPatri;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btStats;
    private javax.swing.JButton btTaxes;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel mainPan;
    public javax.swing.JPanel pan;
    private javax.swing.JTextField txtSeach;
    // End of variables declaration//GEN-END:variables

    public void setYear()
    {
        lblYear.setText("Working on " + Compta.YEAR);
    }
    
}
