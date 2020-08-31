/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antrianadministrasi;

import com.sun.glass.events.KeyEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author FAKHRUZZAINI
 */
public class ambilnomor extends javax.swing.JFrame {
    Queue<Integer> q = new LinkedList<>();
    int i=0;
  
    public ambilnomor() {
        initComponents();

        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
    }
    Informasiantrian objectTampil;   
    public void setFrame2(Informasiantrian objectFrame1DariKonstraktor){
        this.objectTampil = objectFrame1DariKonstraktor;
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomor = new javax.swing.JTextField();
        bPanggilNomor = new javax.swing.JButton();
        txtNomor2 = new javax.swing.JTextField();
        bPanggil2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bPanggil3 = new javax.swing.JButton();
        txtNomor3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bAmbilNomor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAntri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSekarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtNomor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bPanggilNomor.setBackground(new java.awt.Color(51, 255, 102));
        bPanggilNomor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bPanggilNomor.setForeground(new java.awt.Color(255, 255, 255));
        bPanggilNomor.setText("Panggil Nomor");
        bPanggilNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPanggilNomorActionPerformed(evt);
            }
        });

        txtNomor2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtNomor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bPanggil2.setBackground(new java.awt.Color(102, 255, 102));
        bPanggil2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bPanggil2.setForeground(new java.awt.Color(255, 255, 255));
        bPanggil2.setText("Panggil Nomor");
        bPanggil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPanggil2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pelayanan 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pelayanan 2");

        bPanggil3.setBackground(new java.awt.Color(51, 255, 102));
        bPanggil3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bPanggil3.setForeground(new java.awt.Color(255, 255, 255));
        bPanggil3.setText("Panggil Nomor");
        bPanggil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPanggil3ActionPerformed(evt);
            }
        });

        txtNomor3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtNomor3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pelayanan 3");

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        bAmbilNomor.setText("Ambil Nomor");
        bAmbilNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAmbilNomorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AMBIL");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMOR");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ANTRIAN");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DISINI!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAmbilNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAmbilNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sisa Antrian");

        txtAntri.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtAntri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAntri.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sekarang Nomor");

        txtSekarang.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtSekarang.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAntri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAntri, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSekarang, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bReset)
                    .addComponent(bPanggil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomor2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPanggilNomor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtNomor)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bPanggil3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(txtNomor3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(bReset)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(bPanggilNomor))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomor2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtNomor3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPanggil2)
                    .addComponent(bPanggil3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAmbilNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAmbilNomorActionPerformed
        // TODO add your handling code here:
            i+=1;
            q.add(i);
            int nomor = i;
            JOptionPane.showMessageDialog(this, "Nomer antrian Anda adalah "+nomor+"\nSilahkan diINGAT atau diFOTO !!!");
            int antri = q.size();
            txtAntri.setText(""+antri);
          
            String dataTerpilih = Integer.toString(antri);
       
            this.objectTampil.SisaAntrian(dataTerpilih);
    }//GEN-LAST:event_bAmbilNomorActionPerformed

    private void bPanggilNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPanggilNomorActionPerformed
        
        int antrian = q.size();
        if (antrian == 0){
           JOptionPane.showMessageDialog(this, "Antrian telah Habis"); 
        }else{
            Integer removedele = q.remove();
            txtNomor.setText(""+removedele);
            txtSekarang.setText(""+removedele);
            int antri = q.size();
            txtAntri.setText(""+antri);
            String dataNomorPanggil = Integer.toString(removedele);
            this.objectTampil.NomorSekarang(dataNomorPanggil);
            this.objectTampil.Layanan1(dataNomorPanggil);
            String dataNomorAntri = Integer.toString(antri);
            this.objectTampil.SisaAntrian(dataNomorAntri);
            
        }
    }//GEN-LAST:event_bPanggilNomorActionPerformed

    private void bPanggil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPanggil2ActionPerformed
     
        int antrian = q.size();
        if (antrian == 0){
           JOptionPane.showMessageDialog(this, "Antrian telah Habis"); 
        }else{        
            Integer removedele = q.remove();
            txtNomor2.setText(""+removedele);
            txtSekarang.setText(""+removedele);
            int antri = q.size();
            txtAntri.setText(""+antri);
            String dataNomorPanggil = Integer.toString(removedele);
            this.objectTampil.NomorSekarang(dataNomorPanggil);
            this.objectTampil.Layanan2(dataNomorPanggil);
            String dataNomorAntri = Integer.toString(antri);
            this.objectTampil.SisaAntrian(dataNomorAntri);
        }
    }//GEN-LAST:event_bPanggil2ActionPerformed

    private void bPanggil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPanggil3ActionPerformed
        // TODO add your handling code here:
        int antrian = q.size();
        if (antrian == 0){
           JOptionPane.showMessageDialog(this, "Antrian telah Habis"); 
        }else{
            Integer removedele = q.remove();
            txtNomor3.setText(""+removedele);
            txtSekarang.setText(""+removedele);
            int antri = q.size();
            txtAntri.setText(""+antri);
            String dataNomorPanggil = Integer.toString(removedele);
            this.objectTampil.NomorSekarang(dataNomorPanggil);
            this.objectTampil.Layanan3(dataNomorPanggil);
            String dataNomorAntri = Integer.toString(antri);
            this.objectTampil.SisaAntrian(dataNomorAntri);
        }
    }//GEN-LAST:event_bPanggil3ActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(this, "Anda Yakin Ingin Mereset Program?");
        int antrian = q.size();
        switch(jawab){
        case JOptionPane.YES_OPTION:
            for (int a = 0; a < antrian; antrian--){
                q.remove();
            }
            int antri = q.size();
            txtAntri.setText(""+antri);
            txtNomor.setText("");
            txtNomor2.setText("");
            txtNomor3.setText("");
            txtSekarang.setText("");
            JOptionPane.showMessageDialog(this, "Program Berhasil Direset");
            break;
        case JOptionPane.NO_OPTION:
            JOptionPane.showMessageDialog(this, "Program Batal Direset");
            break;
        case JOptionPane.CANCEL_OPTION:
            
        }
    }//GEN-LAST:event_bResetActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ambilnomor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAmbilNomor;
    private javax.swing.JButton bPanggil2;
    private javax.swing.JButton bPanggil3;
    private javax.swing.JButton bPanggilNomor;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAntri;
    private javax.swing.JTextField txtNomor;
    private javax.swing.JTextField txtNomor2;
    private javax.swing.JTextField txtNomor3;
    private javax.swing.JTextField txtSekarang;
    // End of variables declaration//GEN-END:variables
}
