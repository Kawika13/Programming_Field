/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
import javax.swing.*;

public class Remote extends javax.swing.JFrame {

    /* Distributore's declaration */
    TV tv;
    ImageIcon off = new ImageIcon(getClass().getResource("button-off.png"));
    ImageIcon on = new ImageIcon(getClass().getResource("button-on.png"));
    ImageIcon sv = new ImageIcon(getClass().getResource("saver.gif"));
    
    ImageIcon c1 = new ImageIcon(getClass().getResource("chan1.gif"));
    ImageIcon c2 = new ImageIcon(getClass().getResource("chan2.gif"));
    ImageIcon c3 = new ImageIcon(getClass().getResource("chan3.gif"));
    ImageIcon c4 = new ImageIcon(getClass().getResource("chan4.gif"));
    ImageIcon c5 = new ImageIcon(getClass().getResource("chan5.gif"));
    
    /**
     * Creates new form Remote
     */
    public Remote() {
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

        jPanel1 = new javax.swing.JPanel();
        plus = new javax.swing.JButton();
        btnOnOff = new javax.swing.JButton();
        upArrow = new javax.swing.JButton();
        downArrow = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        volume = new javax.swing.JLabel();
        currentC = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus.setEnabled(false);
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        btnOnOff.setBackground(new java.awt.Color(0, 0, 0));
        btnOnOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button-off.png"))); // NOI18N
        btnOnOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOnOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOnOffMouseClicked(evt);
            }
        });

        upArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/up-arrow.png"))); // NOI18N
        upArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upArrow.setEnabled(false);
        upArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upArrowActionPerformed(evt);
            }
        });

        downArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down-arrow.png"))); // NOI18N
        downArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downArrow.setEnabled(false);
        downArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downArrowActionPerformed(evt);
            }
        });

        minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minus.png"))); // NOI18N
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.setEnabled(false);
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnOnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(upArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(downArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        volume.setBackground(new java.awt.Color(192, 192, 192));
        volume.setOpaque(true);

        currentC.setBackground(new java.awt.Color(192, 192, 192));
        currentC.setOpaque(true);

        screen.setBackground(new java.awt.Color(10, 10, 10));
        screen.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tv = new TV("Samsung");
        volume.setText(String.valueOf(tv.getVolume()));
        currentC.setText(String.valueOf(tv.getCanale()));
        

    }//GEN-LAST:event_formWindowOpened

    private void btnOnOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOnOffMouseClicked
        // TODO add your handling code here:       
        if(tv.isAcceso()){
            tv.spegnimento();
            btnOnOff.setBackground(new java.awt.Color(255, 0, 0));
            screen.setIcon(null);
            btnOnOff.setIcon(off);
            
            plus.setEnabled(false);
            minus.setEnabled(false);
            upArrow.setEnabled(false);
            downArrow.setEnabled(false);
            
        }else{
            tv.accensione();
            btnOnOff.setBackground(new java.awt.Color(0, 255, 0));
            screen.setIcon(sv);
            btnOnOff.setIcon(on);
            
            plus.setEnabled(true);
            minus.setEnabled(true);
            upArrow.setEnabled(true);
            downArrow.setEnabled(true);
        }
    }//GEN-LAST:event_btnOnOffMouseClicked

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        tv.alzaVolume();
        volume.setText(String.valueOf(tv.getVolume()));
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        tv.dimVolume();
        volume.setText(String.valueOf(tv.getVolume()));
    }//GEN-LAST:event_minusActionPerformed

    private void upArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upArrowActionPerformed
        // TODO add your handling code here:
        tv.aumCanale();
        switch(tv.getCanale()){
            case 1:
                screen.setIcon(c1);
                break;
            case 2:
                screen.setIcon(c2);
                break;
            case 3:
                screen.setIcon(c3);
                break;
            case 4:
                screen.setIcon(c4);
                break;
            case 5:
                screen.setIcon(c5);
                break;
        }
        currentC.setText(String.valueOf(tv.getCanale()));
    }//GEN-LAST:event_upArrowActionPerformed

    private void downArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downArrowActionPerformed
        // TODO add your handling code here:
        tv.dimCanale();
        switch(tv.getCanale()){
            case 1:
                screen.setIcon(c1);
                break;
            case 2:
                screen.setIcon(c2);
                break;
            case 3:
                screen.setIcon(c3);
                break;
            case 4:
                screen.setIcon(c4);
                break;
            case 5:
                screen.setIcon(c5);
                break;
        }
        currentC.setText(String.valueOf(tv.getCanale()));
    }//GEN-LAST:event_downArrowActionPerformed

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
            java.util.logging.Logger.getLogger(Remote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remote().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOnOff;
    private javax.swing.JLabel currentC;
    private javax.swing.JButton downArrow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton plus;
    private javax.swing.JLabel screen;
    private javax.swing.JButton upArrow;
    private javax.swing.JLabel volume;
    // End of variables declaration//GEN-END:variables
}