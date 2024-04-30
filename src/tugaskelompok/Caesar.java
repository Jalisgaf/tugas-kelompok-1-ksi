/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaskelompok;

/**
 *
 * @author jalisgaf
 */
public class Caesar extends javax.swing.JFrame {

    /**
     * Creates new form Caesar
     */
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    public Caesar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prosesEnkrip = new javax.swing.JButton();
        pkEnkrip = new javax.swing.JTextField();
        ptEnkrip = new javax.swing.JTextField();
        ctEnkrip = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prosesDekrip = new javax.swing.JButton();
        ctDekrip = new javax.swing.JTextField();
        pkDekrip = new javax.swing.JTextField();
        ptDekrip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enkripsi Teknik Subsitusi");

        jLabel2.setText("Plain Teks");

        jLabel3.setText("Pergeseran Kunci");

        jLabel4.setText("Chiper Teks");

        prosesEnkrip.setText("Proses");
        prosesEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesEnkripActionPerformed(evt);
            }
        });

        pkEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkEnkripActionPerformed(evt);
            }
        });

        ptEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptEnkripActionPerformed(evt);
            }
        });

        ctEnkrip.setEditable(false);
        ctEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEnkripActionPerformed(evt);
            }
        });

        jLabel5.setText("Deskripsi Teknik Subsitusi");

        jLabel6.setText("Chiper Teks");

        jLabel7.setText("Pergeseran Kunci");

        jLabel8.setText("Plain Teks");

        prosesDekrip.setText("Proses");
        prosesDekrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesDekripActionPerformed(evt);
            }
        });

        ptDekrip.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)
                                .addComponent(ctEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ptEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pkEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(prosesEnkrip))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pkDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(ptDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(prosesDekrip)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ptEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pkEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(prosesEnkrip)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ctEnkrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(pkDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(prosesDekrip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ptDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prosesEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesEnkripActionPerformed
        // TODO add your handling code here:
        String pt = this.ptEnkrip.getText().toLowerCase();
        int pk = Integer.parseInt(this.pkEnkrip.getText());
        
        String encryptStr = "";
        
        for (int i = 0; i < pt.length(); i++)   
        {   
            // get position of each character of inputStr in ALPHABET   
            int pos = ALPHABET.indexOf(pt.charAt(i));   
              
            // get encrypted char for each char of inputStr   
            int encryptPos = (pk + pos) % 26;   
            char encryptChar = ALPHABET.charAt(encryptPos);   
              
            // add encrypted char to encrypted string   
            encryptStr += encryptChar;   
        }   
        
        ctEnkrip.setText(encryptStr);
    }//GEN-LAST:event_prosesEnkripActionPerformed

    private void pkEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkEnkripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkEnkripActionPerformed

    private void ptEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptEnkripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptEnkripActionPerformed

    private void ctEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEnkripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEnkripActionPerformed

    private void prosesDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesDekripActionPerformed
        // TODO add your handling code here:
        String ct = this.ctDekrip.getText().toLowerCase();
        int pk = Integer.parseInt(this.pkDekrip.getText());
        
        String decryptStr = "";
        
        for (int i = 0; i < ct.length(); i++)   
        {   
              
            // get position of each character of inputStr in ALPHABET   
            int pos = ALPHABET.indexOf(ct.charAt(i));   
              
            // get decrypted char for each char of inputStr   
            int decryptPos = (pos - pk) % 26;   
              
            // if decryptPos is negative   
            if (decryptPos < 0){   
                decryptPos = ALPHABET.length() + decryptPos;   
            }   
            char decryptChar = ALPHABET.charAt(decryptPos);   
              
            // add decrypted char to decrypted string   
            decryptStr += decryptChar;   
        }      
        
        ptDekrip.setText(decryptStr);
    }//GEN-LAST:event_prosesDekripActionPerformed

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
            java.util.logging.Logger.getLogger(Caesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caesar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctDekrip;
    private javax.swing.JTextField ctEnkrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pkDekrip;
    private javax.swing.JTextField pkEnkrip;
    private javax.swing.JButton prosesDekrip;
    private javax.swing.JButton prosesEnkrip;
    private javax.swing.JTextField ptDekrip;
    private javax.swing.JTextField ptEnkrip;
    // End of variables declaration//GEN-END:variables
}
