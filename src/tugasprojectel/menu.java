package tugasprojectel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvila Furwaty
 */
public class menu extends javax.swing.JFrame {

    private Connection con;
    private Statement stat;
    private ResultSet res;

    public menu() {
        initComponents();
        koneksi();
        kosongkan();
        ClearTabel();
        tabel();
    }

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            stat = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void tabel() {
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("No. Buku");
        tb.addColumn("Judul Buku");
        tb.addColumn("Pengarang");
        tb.addColumn("Tahun");
        tb.addColumn("Penerbit");
        tabel.setModel(tb);

        try {
            res = stat.executeQuery("select * from perpus");

            while (res.next()) {
                tb.addRow(new Object[]{
                    res.getInt("no_buku"),
                    res.getString("judul_buku"),
                    res.getString("pengarang"),
                    res.getInt("tahun"),
                    res.getString("penerbit")
                });
            }
        } catch (Exception e) {

        }
    }

    private void kosongkan() {
        no.setText("");
        judul.setText("");
        pengarang.setText("");
        tahun.setText("");
        penerbit.setText("");
        no.requestFocus();
    }

    private void ClearTabel() {
        int cb = tabel.getRowCount();
        int cc = tabel.getColumnCount();
        for (int i = 0; i < cb; i++) {
            for (int j = 0; j < cc; j++) {
                tabel.setValueAt(null, i, j);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        pengarang = new javax.swing.JTextField();
        tahun = new javax.swing.JTextField();
        penerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perpustakaan Sederhana");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perpustakaan Sederhana");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 11, 280, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("No. Buku");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 57, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Judul");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 98, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Pengarang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 139, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tahun");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 179, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Penerbit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 217, -1, -1));
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 55, 76, -1));
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 96, 166, -1));
        getContentPane().add(pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 137, 166, -1));
        getContentPane().add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 177, 78, -1));
        getContentPane().add(penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 215, 166, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Buku", "Judul Buku", "Pengarang", "Tahun", "Penerbit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        tabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabelComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
            tabel.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 253, 464, 123));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 510, 20));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        hapus.setBackground(new java.awt.Color(255, 102, 102));
        hapus.setText("HAPUS DATA");
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 204, 153));
        edit.setText("UBAH DATA");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapus)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 190, 80));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        simpan.setBackground(new java.awt.Color(153, 153, 255));
        simpan.setText("SIMPAN");
        simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(153, 153, 255));
        reset.setText("RESET");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 190, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\My Backgrounds\\biru.png")); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        try {
            stat.executeUpdate("INSERT INTO perpus VALUES ("
                    + "'" + no.getText() + "',"
                    + "'" + judul.getText() + "',"
                    + "'" + pengarang.getText() + "',"
                    + "'" + tahun.getText() + "',"
                    + "'" + penerbit.getText() + "')"
            );
            kosongkan();
            tabel();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try {
            stat.executeUpdate("UPDATE perpus SET "
                    + "judul_buku='" + judul.getText() + "',"
                    + "pengarang='" + pengarang.getText() + "',"
                    + "tahun='" + tahun.getText() + "',"
                    + "penerbit='" + penerbit.getText() + "'"
                    + " where "
                    + "no_buku='" + no.getText() + "'"
            );
            kosongkan();
            tabel();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbarui!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try {
            stat.executeUpdate("DELETE FROM perpus WHERE "
                    + "no_buku='" + no.getText() + "'"
            );
            kosongkan();
            tabel();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tabelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabelComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelComponentShown

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.rowAtPoint(evt.getPoint());
        String s_nomor = tabel.getValueAt(baris, 0).toString();
        no.setText(s_nomor);

        String s_judul = tabel.getValueAt(baris, 1).toString();
        judul.setText(s_judul);

        String s_pengarang = tabel.getValueAt(baris, 2).toString();
        pengarang.setText(s_pengarang);

        String s_tahun = tabel.getValueAt(baris, 3).toString();
        tahun.setText(s_tahun);

        String s_penerbit = tabel.getValueAt(baris, 4).toString();
        penerbit.setText(s_penerbit);
    }//GEN-LAST:event_tabelMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        kosongkan();
    }//GEN-LAST:event_resetActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            res = stat.executeQuery("SELECT * FROM perpus WHERE " + "no_buku='" + no.getText() + "'");

            while (res.next()) {
                judul.setText(res.getString("judul_buku"));
                pengarang.setText(res.getString("pengarang"));
                tahun.setText(res.getString("tahun"));
                penerbit.setText(res.getString("penerbit"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul;
    private javax.swing.JTextField no;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField pengarang;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tahun;
    // End of variables declaration//GEN-END:variables
}
