/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugaskelompok;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jalisgaf
 */
public class Polyalphabetical extends javax.swing.JFrame {

    /**
     * Creates new form Polyalphabetical
     */
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public Polyalphabetical() {
        initComponents();
    }

    public class ProsesEnkripsi {

        public String trimKunci(String inputEnkripVar, String kunciEnkripVar) {
            String kunciDiProses = new String();
            int tempIndex = 0;
            for (int i = 0; i < kunciEnkripVar.length(); i++) {
                if (i == 0) {
                    kunciDiProses = String.valueOf(kunciEnkripVar.charAt(i));
                } else if (kunciDiProses.contains(String.valueOf(kunciEnkripVar.charAt(i)))) {
                    var tempChar = kunciEnkripVar.charAt(i);
                    tempIndex = kunciDiProses.indexOf(tempChar);
                    StringBuilder sb = new StringBuilder(kunciDiProses);
                    sb.deleteCharAt(tempIndex);
                    kunciDiProses = sb.toString() + tempChar;
                } else if (kunciEnkripVar.charAt(i) != kunciEnkripVar.charAt(i - 1)) {
                    kunciDiProses = kunciDiProses.concat(String.valueOf(kunciEnkripVar.charAt(i)));
                }
            }
            return kunciDiProses;
        }

        public String susunModifiedAlphabet(String kunciDiProses) {
            String modifiedAlphabet = new String();
            StringBuilder tempVar = new StringBuilder(modifiedAlphabet);
            for (int i = 0; i < ALPHABET.length(); i++) {
                char currentChar = ALPHABET.charAt(i);

                // Check if the character is not already in modifiedAlphabet
                if (!kunciDiProses.contains(String.valueOf(currentChar))) {
                    // Append the character to modifiedAlphabet using StringBuilder
                    tempVar.append(currentChar).toString();
                }
            }
            modifiedAlphabet = kunciDiProses + tempVar;
            return modifiedAlphabet;
        }

        public String showResult(String modifiedAlphabet, String inputEnkripVar) {
            StringBuilder hasilEnkripsi = new StringBuilder();
            for (char c : inputEnkripVar.toCharArray()) {
                // Find the index of the character in the alphabet
                int index = ALPHABET.indexOf(c);
                // Use the same index to get the corresponding character from the 'enkripsi' string
                char encryptedChar = modifiedAlphabet.charAt(index);
                // Append the encrypted character to the result
                hasilEnkripsi.append(encryptedChar);
            }
            return hasilEnkripsi.toString();
        }

    }

    public class ProsesDekripsi {

        public String trimKunci(String inputDekripVar, String kunciDekripVar) {
            String kunciDiProses = new String();
            int tempIndex = 0;

            for (int i = 0; i < kunciDekripVar.length(); i++) {
                if (i == 0) {
                    kunciDiProses = String.valueOf(kunciDekripVar.charAt(i));
                } else if (kunciDiProses.contains(String.valueOf(kunciDekripVar.charAt(i)))) {
                    var tempChar = kunciDekripVar.charAt(i);
                    tempIndex = kunciDiProses.indexOf(tempChar);
                    StringBuilder sb = new StringBuilder(kunciDiProses);
                    sb.deleteCharAt(tempIndex);
                    kunciDiProses = sb.toString() + tempChar;
                } else if (kunciDekripVar.charAt(i) != kunciDekripVar.charAt(i - 1)) {
                    kunciDiProses = kunciDiProses.concat(String.valueOf(kunciDekripVar.charAt(i)));
                }
            }

            return kunciDiProses;
        }

        public String susunModifiedAlphabet(String kunciDiProses) {
            String modifiedAlphabet = new String();
            StringBuilder tempVar = new StringBuilder(modifiedAlphabet);

            for (int i = 0; i < ALPHABET.length(); i++) {
                char currentChar = ALPHABET.charAt(i);

                // Check if the character is not already in modifiedAlphabet
                if (!kunciDiProses.contains(String.valueOf(currentChar))) {
                    // Append the character to modifiedAlphabet using StringBuilder
                    tempVar.append(currentChar).toString();
                }
            }
            modifiedAlphabet = kunciDiProses + tempVar;
            return modifiedAlphabet;
        }

        public String showResult(String modifiedAlphabet, String inputDekripVar) {
            StringBuilder hasilDekripsi = new StringBuilder();

            // Iterate through each character in the encrypted input
            for (char encryptedChar : inputDekripVar.toCharArray()) {
                // Find the index of the character in the modified alphabet
                int index = modifiedAlphabet.indexOf(encryptedChar);
                // Use the same index to get the corresponding character from the original alphabet
                char decryptedChar = ALPHABET.charAt(index);
                // Append the decrypted character to the result
                hasilDekripsi.append(decryptedChar);
            }
            return hasilDekripsi.toString();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tblEnkripsi = new javax.swing.JButton();
        kunciEnkripsi = new javax.swing.JTextField();
        inputEnkripsi = new javax.swing.JTextField();
        outputEnkripsi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tblDekrip = new javax.swing.JButton();
        inputDekrip = new javax.swing.JTextField();
        kunciDekrip = new javax.swing.JTextField();
        outputDekripsi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Plain Teks");

        jLabel3.setText("Kunci 1");

        jLabel4.setText("Chiper Teks");

        tblEnkripsi.setText("Proses");
        tblEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblEnkripsiActionPerformed(evt);
            }
        });

        kunciEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunciEnkripsiActionPerformed(evt);
            }
        });

        inputEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnkripsiActionPerformed(evt);
            }
        });

        outputEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputEnkripsiActionPerformed(evt);
            }
        });

        jLabel1.setText("Enkripsi Teknik Polyalphabetical");

        tblDekrip.setText("Proses");
        tblDekrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblDekripActionPerformed(evt);
            }
        });

        jLabel5.setText("Deskripsi Teknik Polyalphabetical");

        jLabel6.setText("Chiper Teks");

        jLabel7.setText("Kunci 1");

        jLabel8.setText("Plain Teks");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kunciDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(114, 114, 114)
                                            .addComponent(outputDekripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(tblDekrip)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)
                                .addComponent(outputEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kunciEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(tblEnkripsi))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kunciEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(tblEnkripsi)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(outputEnkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(kunciDekrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tblDekrip)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(outputDekripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblEnkripsiActionPerformed
        String inputEnkripVar = inputEnkripsi.getText().toLowerCase();
        String kunciEnkripVar = kunciEnkripsi.getText().toLowerCase();

        ProsesEnkripsi prosesEnkripsi = new ProsesEnkripsi();
        String kunciDiProses = prosesEnkripsi.trimKunci(inputEnkripVar, kunciEnkripVar);
        String modifiedAlphabet = prosesEnkripsi.susunModifiedAlphabet(kunciDiProses);
        String hasilEnkripsi = prosesEnkripsi.showResult(modifiedAlphabet, inputEnkripVar);

        outputEnkripsi.setText(hasilEnkripsi);
    }//GEN-LAST:event_tblEnkripsiActionPerformed

    private void kunciEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunciEnkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kunciEnkripsiActionPerformed

    private void inputEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnkripsiActionPerformed

    private void outputEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputEnkripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputEnkripsiActionPerformed

    private void tblDekripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblDekripActionPerformed
        // TODO add your handling code here:
        String inputDekripVar = this.inputDekrip.getText().toLowerCase();
        String kunciDekripVar = this.kunciDekrip.getText().toLowerCase();
        
        ProsesDekripsi prosesDekripsi = new ProsesDekripsi();
        String kunciDiProses = prosesDekripsi.trimKunci(inputDekripVar, kunciDekripVar);
        String modifiedAlphabet = prosesDekripsi.susunModifiedAlphabet(kunciDiProses);
        String hasilDekripsi = prosesDekripsi.showResult(modifiedAlphabet, inputDekripVar);

        outputDekripsi.setText(hasilDekripsi);
    }//GEN-LAST:event_tblDekripActionPerformed

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
            java.util.logging.Logger.getLogger(Polyalphabetical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polyalphabetical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputDekrip;
    private javax.swing.JTextField inputEnkripsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kunciDekrip;
    private javax.swing.JTextField kunciEnkripsi;
    private javax.swing.JTextField outputDekripsi;
    private javax.swing.JTextField outputEnkripsi;
    private javax.swing.JButton tblDekrip;
    private javax.swing.JButton tblEnkripsi;
    // End of variables declaration//GEN-END:variables
}
