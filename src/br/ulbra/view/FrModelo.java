package br.ulbra.view;

import br.ulbra.classes.Modelo;
import br.ulbra.classes.ModeloDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrModelo extends javax.swing.JFrame {
    public FrModelo() throws SQLException{
        initComponents();
        setLocationRelativeTo(null);
        showTable();
    }
    public void showTable() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel)tbModelos.getModel();
        modelo.setNumRows(0);
        ModeloDao mdao = new ModeloDao();
        for (Modelo p : mdao.read()){
            modelo.addRow(new Object[]{
            p.getId(),
            p.getMarca(),
            p.getModelo(),
            p.getAno(),
        });
        }
    }
    
        public void showTableForID(int id) throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel)tbModelos.getModel();
        modelo.setNumRows(0);
        ModeloDao mdao = new ModeloDao();
        for (Modelo p : mdao.readPesq(id)){
            modelo.addRow(new Object[]{
            p.getId(),
            p.getMarca(),
            p.getModelo(),
            p.getAno(),
        });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbModelos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Carlito", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("CADASTRO DE MODELOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 119, -1, -1));

        jLabel3.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("MODELO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("MARCA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("ANO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtID.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        txtModelo.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, -1));

        txtAno.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, -1));

        txtMarca.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, -1));

        btnNovo.setBackground(new java.awt.Color(102, 102, 255));
        btnNovo.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 204));
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(102, 102, 255));
        btnSalvar.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 204));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        btnAlterar.setBackground(new java.awt.Color(102, 102, 255));
        btnAlterar.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 204));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 204));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        txtPesquisar.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 240, -1));

        btnPesquisar.setBackground(new java.awt.Color(102, 102, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        tbModelos.setBackground(new java.awt.Color(102, 102, 255));
        tbModelos.setFont(new java.awt.Font("Carlito", 0, 14)); // NOI18N
        tbModelos.setForeground(new java.awt.Color(255, 255, 204));
        tbModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MODELO", "MARCA", "ANO"
            }
        ));
        jScrollPane1.setViewportView(tbModelos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
 try {
            showTableForID(Integer.parseInt(txtPesquisar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(FrModelo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            Modelo m = new Modelo();
            m.setId(Integer.parseInt(txtID.getText()));
            m.setMarca(txtMarca.getText());
            m.setModelo(txtModelo.getText());
            m.setAno(Integer.parseInt(txtAno.getText()));       
        try {
            ModeloDao mdao = new ModeloDao();
            mdao.create(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Modelo m = new Modelo();
        m.setId(Integer.parseInt(txtID.getText()));
        m.setMarca(txtMarca.getText());
        m.setModelo(txtModelo.getText());
        m.setAno(Integer.parseInt(txtAno.getText())); 
        
                ModeloDao mdao;
        try {
            mdao = new ModeloDao();
            mdao.update(m);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(FRCADVEICULO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    Modelo m = new Modelo();
        m.setId(Integer.parseInt(txtID.getText()));
        ModeloDao mdao;
        try {
            mdao = new ModeloDao();
            mdao.delete(m);
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(FrModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
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
            java.util.logging.Logger.getLogger(FrModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrModelo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrModelo.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbModelos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
