/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_peminjamanalat;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author windows10
 */
public class utama extends javax.swing.JFrame {

    /**
     * Creates new form utama
     */
    public utama() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        facebook1 = new javax.swing.JLabel();
        twitter1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gmail1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPeminjaman = new javax.swing.JMenu();
        mnGuru = new javax.swing.JMenuItem();
        mnSiswa = new javax.swing.JMenuItem();
        mnPengembalian = new javax.swing.JMenu();
        mnGuru2 = new javax.swing.JMenuItem();
        mnSiswa2 = new javax.swing.JMenuItem();
        mnTentang = new javax.swing.JMenu();
        mnKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/utama_2.png"))); // NOI18N
        jLabel1.setText("   ");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        facebook1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        facebook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fb.png"))); // NOI18N
        facebook1.setText("Facebook");
        facebook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebook1MouseClicked(evt);
            }
        });

        twitter1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        twitter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/twitter.png"))); // NOI18N
        twitter1.setText("Twitter");
        twitter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitter1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/google.png"))); // NOI18N
        jLabel7.setText("Google +");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        gmail1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        gmail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N
        gmail1.setText("E-Mail");
        gmail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gmail1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(facebook1)
                .addGap(30, 30, 30)
                .addComponent(gmail1)
                .addGap(34, 34, 34)
                .addComponent(twitter1)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(facebook1)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(twitter1)
                        .addComponent(jLabel7)
                        .addComponent(gmail1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Interface.png"))); // NOI18N
        mnPeminjaman.setText("Peminjaman");
        mnPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnPeminjamanMousePressed(evt);
            }
        });

        mnGuru.setText("Guru");
        mnGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGuruActionPerformed(evt);
            }
        });
        mnPeminjaman.add(mnGuru);

        mnSiswa.setText("Siswa");
        mnSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSiswaActionPerformed(evt);
            }
        });
        mnPeminjaman.add(mnSiswa);

        jMenuBar1.add(mnPeminjaman);

        mnPengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pengembalian2.png"))); // NOI18N
        mnPengembalian.setText("Pengembalian");
        mnPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnPengembalianMousePressed(evt);
            }
        });

        mnGuru2.setText("Guru");
        mnGuru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGuru2ActionPerformed(evt);
            }
        });
        mnPengembalian.add(mnGuru2);

        mnSiswa2.setText("Siswa");
        mnSiswa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSiswa2ActionPerformed(evt);
            }
        });
        mnPengembalian.add(mnSiswa2);

        jMenuBar1.add(mnPengembalian);

        mnTentang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/about.png"))); // NOI18N
        mnTentang.setText("Tentang");
        mnTentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnTentangMousePressed(evt);
            }
        });
        jMenuBar1.add(mnTentang);

        mnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit-48.png"))); // NOI18N
        mnKeluar.setText("Keluar");
        mnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnKeluarMousePressed(evt);
            }
        });
        mnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnKeluarKeyPressed(evt);
            }
        });
        jMenuBar1.add(mnKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnKeluarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnKeluarKeyPressed

    private void mnKeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKeluarMousePressed
        // TODO add your handling code here:
        Object[] options = {"Ya", "Tidak, tetap di halaman"};
        int dialog = JOptionPane.showOptionDialog(this, "Apakah Anda yakin ingin Keluar?",
        "Konfirmasi Untuk Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (dialog == JOptionPane.YES_OPTION) {
        new fPageLogin().setVisible(true);;
        this.dispose();
        }
    }//GEN-LAST:event_mnKeluarMousePressed

    private void mnPeminjamanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPeminjamanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnPeminjamanMousePressed

    private void mnTentangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTentangMousePressed
        // TODO add your handling code here:
        new fTentang().setVisible(true);
    }//GEN-LAST:event_mnTentangMousePressed

    private void mnPengembalianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPengembalianMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnPengembalianMousePressed

    private void mnGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGuruActionPerformed
        // TODO add your handling code here:
         new fPeminjamanGuru().setVisible(true);
    }//GEN-LAST:event_mnGuruActionPerformed

    private void mnSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSiswaActionPerformed
        // TODO add your handling code here:
         new fPeminjamanAlat().setVisible(true);
    }//GEN-LAST:event_mnSiswaActionPerformed

    private void mnGuru2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGuru2ActionPerformed
        // TODO add your handling code here:
         new fPengembalianGuru().setVisible(true);
    }//GEN-LAST:event_mnGuru2ActionPerformed

    private void mnSiswa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSiswa2ActionPerformed
        // TODO add your handling code here:
         new fPengembalian().setVisible(true);
    }//GEN-LAST:event_mnSiswa2ActionPerformed

    private void facebook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebook1MouseClicked
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().browse(new URL("http://www.facebook.com").toURI());

        } catch(Exception ex){

            System.out.println(ex);

        }
    }//GEN-LAST:event_facebook1MouseClicked

    private void twitter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitter1MouseClicked
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().browse(new URL("http://www.twitter.com").toURI());

        } catch(Exception ex){

            System.out.println(ex);

        }
    }//GEN-LAST:event_twitter1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        try{
            Desktop.getDesktop().browse(new URL("http://www.plus.google.com").toURI());

        } catch(Exception ex){

            System.out.println(ex);

        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void gmail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmail1MouseClicked
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().browse(new URL("http://www.gmail.com").toURI());

        } catch(Exception ex){

            System.out.println(ex);

        }
    }//GEN-LAST:event_gmail1MouseClicked

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
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel facebook1;
    private javax.swing.JLabel gmail1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem mnGuru;
    private javax.swing.JMenuItem mnGuru2;
    private javax.swing.JMenu mnKeluar;
    private javax.swing.JMenu mnPeminjaman;
    private javax.swing.JMenu mnPengembalian;
    private javax.swing.JMenuItem mnSiswa;
    private javax.swing.JMenuItem mnSiswa2;
    private javax.swing.JMenu mnTentang;
    private javax.swing.JLabel twitter1;
    // End of variables declaration//GEN-END:variables
}
