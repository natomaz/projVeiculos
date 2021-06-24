/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.classes.Fabricante;
import br.ulbra.classes.FabricanteDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrCadFabricante extends javax.swing.JFrame {

    public FrCadFabricante() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        showTable();
    }
    
     public void showTable() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel)tbFabricante.getModel();
        modelo.setNumRows(0);
        FabricanteDao fdao = new FabricanteDao();
        for (Fabricante p : fdao.read()){
            modelo.addRow(new Object[]{
            p.getId(),
            p.getMarca(),
            p.getTelefone(),
            p.getSite(),
            p.getEmail(),
            });
        }
    }
     
    public void showTableForID(int id) throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel)tbFabricante.getModel();
        modelo.setNumRows(0);
        FabricanteDao fdao = new FabricanteDao();
        for (Fabricante p : fdao.readPesq(id)){
            modelo.addRow(new Object[]{
            p.getId(),
            p.getMarca(),
            p.getTelefone(),
            p.getSite(),
            p.getEmail(),
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtSite = new javax.swing.JTextField();
        txtTele = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFabricante = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Carlito", 1, 48)); // NOI18N
        jLabel1.setText("CADASTRO DE FABRICANTES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 754, 95));

        jLabel2.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel3.setText("MARCA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 125, -1, -1));

        jLabel4.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel4.setText("TELEFONE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 184, -1, -1));

        jLabel5.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel5.setText("SITE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 184, -1, -1));

        jLabel6.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel6.setText("EMAIL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtID.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 226, 40));

        txtSite.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 226, 40));

        txtTele.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 226, 40));

        txtMarca.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 226, 40));

        txtEmail.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 610, 40));

        tbFabricante.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        tbFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "MARCA", "SITE", "TELEFONE", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(tbFabricante);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 610, 90));

        btnNovo.setBackground(new java.awt.Color(51, 255, 255));
        btnNovo.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(102, 255, 102));
        btnSalvar.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        btnAlterar.setBackground(new java.awt.Color(255, 102, 0));
        btnAlterar.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 125, -1, -1));

        txtPesquisar.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 330, 40));

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa.png"))); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Fabricante f = new Fabricante();
        f.setId(Integer.parseInt(txtID.getText()));
        f.setMarca(txtMarca.getText());
        f.setTelefone(txtTele.getText());
        f.setSite(txtSite.getText());
        f.setEmail(txtEmail.getText());
       
        try {
            FabricanteDao fdao = new FabricanteDao();
            fdao.create(f);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Fabricante f = new Fabricante();
        f.setId(Integer.parseInt(txtID.getText()));
        f.setMarca(txtMarca.getText());
        f.setTelefone(txtTele.getText());
        f.setSite(txtSite.getText());
        f.setEmail(txtEmail.getText());
        
        FabricanteDao fdao;
        try {
            fdao = new FabricanteDao();
            fdao.update(f);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadFabricante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    Fabricante f = new Fabricante();
        f.setId(Integer.parseInt(txtID.getText()));
        FabricanteDao fdao;
        try {
            fdao = new FabricanteDao();
            fdao.delete(f);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadFabricante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
 try {
            showTableForID(Integer.parseInt(txtPesquisar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(FrCadFabricante.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrCadFabricante().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrCadFabricante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFabricante;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
