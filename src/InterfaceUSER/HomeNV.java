package InterfaceUSER;

import Connect.ketNoi;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quang
 */
public class HomeNV extends javax.swing.JFrame {

    /**
     * Creates new form MenuQL
     */
    HomeQL ql = new HomeQL();
    ketNoi k = new ketNoi();
    DefaultTableModel model = new DefaultTableModel();

    public HomeNV() {
        initComponents();
        setLocationRelativeTo(null);
        k.connect();
        LoadUser();
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
        btnQuanLyKhachMoi = new javax.swing.JButton();
        btnQuanLyLuotKhach = new javax.swing.JButton();
        btnQuanLyHoiVien = new javax.swing.JButton();
        tbnDangXuat = new javax.swing.JButton();
        btnQuanLyVeSinh = new javax.swing.JButton();
        btnDV = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý hồ bơi(Nhân Viên)");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Phần mềm quản lý hồ bơi");

        btnQuanLyKhachMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnQuanLyKhachMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyKhachMoi.setIcon(new javax.swing.ImageIcon("D:\\Code\\DUAN1\\QLHOBOI\\img\\LogIn.jpg")); // NOI18N
        btnQuanLyKhachMoi.setText("Quản lý khách mới");
        btnQuanLyKhachMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyKhachMoiActionPerformed(evt);
            }
        });

        btnQuanLyLuotKhach.setBackground(new java.awt.Color(255, 153, 0));
        btnQuanLyLuotKhach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyLuotKhach.setIcon(new javax.swing.ImageIcon("D:\\Code\\DUAN1\\QLHOBOI\\img\\Lkhasch.png")); // NOI18N
        btnQuanLyLuotKhach.setText("Quản lý số lượt khách");
        btnQuanLyLuotKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyLuotKhachActionPerformed(evt);
            }
        });

        btnQuanLyHoiVien.setBackground(new java.awt.Color(0, 204, 255));
        btnQuanLyHoiVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyHoiVien.setIcon(new javax.swing.ImageIcon("D:\\Code\\DUAN1\\QLHOBOI\\img\\Account.png")); // NOI18N
        btnQuanLyHoiVien.setText("Quản lý hội viên");
        btnQuanLyHoiVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHoiVienActionPerformed(evt);
            }
        });

        tbnDangXuat.setBackground(new java.awt.Color(204, 204, 255));
        tbnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbnDangXuat.setIcon(new javax.swing.ImageIcon("D:\\Code\\DUAN1\\QLHOBOI\\img\\LogOut.png")); // NOI18N
        tbnDangXuat.setText("Đăng xuất");
        tbnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnDangXuatActionPerformed(evt);
            }
        });

        btnQuanLyVeSinh.setBackground(new java.awt.Color(102, 255, 204));
        btnQuanLyVeSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyVeSinh.setIcon(new javax.swing.ImageIcon("D:\\Code\\DUAN1\\QLHOBOI\\img\\VeSinh.jpg")); // NOI18N
        btnQuanLyVeSinh.setText("Quản lý vệ sinh");
        btnQuanLyVeSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyVeSinhActionPerformed(evt);
            }
        });

        btnDV.setBackground(new java.awt.Color(153, 255, 255));
        btnDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDV.setIcon(new javax.swing.ImageIcon("D:\\Code\\DUAN1\\QLHOBOI\\img\\Sale.png")); // NOI18N
        btnDV.setText("Dịch vụ");
        btnDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDVActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 0, 0));
        lblDongHo.setText("12 : 00 ");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 0, 0));
        lblDate.setText("12/12/2020");

        lblUser.setBackground(new java.awt.Color(0, 204, 255));
        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 0, 204));
        lblUser.setText("Tên Gói Bơi");

        lblUser1.setBackground(new java.awt.Color(0, 204, 255));
        lblUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(0, 0, 255));
        lblUser1.setText("Nhân viên :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblDongHo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDongHo)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblUser1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuanLyLuotKhach)
                    .addComponent(tbnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLyHoiVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnQuanLyVeSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDV, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnQuanLyKhachMoi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnQuanLyHoiVien, btnQuanLyKhachMoi, btnQuanLyLuotKhach, tbnDangXuat});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyHoiVien)
                    .addComponent(btnQuanLyKhachMoi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyVeSinh)
                    .addComponent(btnQuanLyLuotKhach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnDangXuat)
                    .addComponent(btnDV))
                .addGap(156, 156, 156))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnQuanLyHoiVien, btnQuanLyKhachMoi, btnQuanLyLuotKhach});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLyHoiVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHoiVienActionPerformed
        // TODO add your handling code here:
        QuanLyHoiVien qlhv = new QuanLyHoiVien();
        qlhv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuanLyHoiVienActionPerformed

    private void btnQuanLyKhachMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyKhachMoiActionPerformed
        // TODO add your handling code here:
        QuanLyKhachMoi qlkm = new QuanLyKhachMoi();
        qlkm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuanLyKhachMoiActionPerformed

    private void tbnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnDangXuatActionPerformed
        // TODO add your handling code here:
        LogIn li = new LogIn();
        LogOut();
        li.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbnDangXuatActionPerformed

    private void btnQuanLyLuotKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyLuotKhachActionPerformed
        // TODO add your handling code here:
        QuanLyLuotKhach qllk = new QuanLyLuotKhach();
        qllk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuanLyLuotKhachActionPerformed

    private void btnQuanLyVeSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyVeSinhActionPerformed
        // TODO add your handling code here:
        QuanLyVeSinh qlvs = new QuanLyVeSinh();
        qlvs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnQuanLyVeSinhActionPerformed

    private void btnDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDVActionPerformed
        // TODO add your handling code here:
        QuanLyDichVu dv = new QuanLyDichVu();
        dv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDVActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeNV().setVisible(true);
            }
        });
    }
    private void LogOut(){
        try {
            String sql = "delete from tkol where username = ?";
            PreparedStatement st = k.cn.prepareStatement(sql);
            st.setString(1, lblUser.getText());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void LoadUser(){
        try {
            String sql = "select * from tkol";
            Statement st = k.cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {                
                lblUser.setText(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDV;
    private javax.swing.JButton btnQuanLyHoiVien;
    private javax.swing.JButton btnQuanLyKhachMoi;
    private javax.swing.JButton btnQuanLyLuotKhach;
    private javax.swing.JButton btnQuanLyVeSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JButton tbnDangXuat;
    // End of variables declaration//GEN-END:variables
}
