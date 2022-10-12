package br.ulbra.view;

import br.ulbra.DAO.UsuarioDAO;
import br.ulbra.entity.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrCadastro extends javax.swing.JFrame {

    public FrCadastro() throws SQLException {
        initComponents();
        readJTable();

    }

    public void controlarBtn(int op) {
        switch (op) {
            case 1:
                pnCad.setVisible(false);
                btSalvar.setEnabled(true);
                break;
            case 2:
                pnCad.setVisible(true);
                btAlterar.setEnabled(false);
                btExcluir.setEnabled(false);
                break;
            case 3:
                pnCad.setVisible(true);
                btAlterar.setEnabled(true);
                btExcluir.setEnabled(true);
                btSalvar.setEnabled(false);
                break;
        }
        this.pack();
    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbCad.getModel();
        modelo.setNumRows(0);
        UsuarioDAO udao = new UsuarioDAO();
        for (Usuario p : udao.read()) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getCpfUsu(),
                p.getSexoUsu()
            });
        }
    }

    public void readJTableForDesc(String nome) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbCad.getModel();
        modelo.setNumRows(0);
        UsuarioDAO pdao = new UsuarioDAO();
        for (Usuario p : pdao.readForDesc(nome)) {
            modelo.addRow(new Object[]{
                p.getIdUsu(),
                p.getNomeUsu(),
                p.getEmailUsu(),
                p.getSenhaUsu(),
                p.getFoneUsu(),
                p.getCpfUsu(),
                p.getSexoUsu()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnCad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ctSenha1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        ctFone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCad = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ctId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ctSenha2 = new javax.swing.JPasswordField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("E-MAIL");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCad.setBackground(new java.awt.Color(255, 193, 21));
        pnCad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("NOME");
        pnCad.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        ctNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNomeActionPerformed(evt);
            }
        });
        pnCad.add(ctNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 174, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("E-MAIL");
        pnCad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ctEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEmailActionPerformed(evt);
            }
        });
        pnCad.add(ctEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 174, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("SENHA");
        pnCad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        ctSenha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ctSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSenha1ActionPerformed(evt);
            }
        });
        pnCad.add(ctSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 174, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("TELEFONE");
        pnCad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        ctFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctFoneActionPerformed(evt);
            }
        });
        pnCad.add(ctFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 174, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("SEXO");
        pnCad.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        buttonGroup1.add(rbM);
        rbM.setSelected(true);
        rbM.setText("MASCULINO");
        rbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMActionPerformed(evt);
            }
        });
        pnCad.add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        buttonGroup1.add(rbF);
        rbF.setText("FEMININO");
        pnCad.add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        tbCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOME", "E-MAIL", "SENHA", "TELEFONE", "CPF", "SEXO"
            }
        ));
        tbCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCadMouseClicked(evt);
            }
        });
        tbCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbCadKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbCad);

        pnCad.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 94));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ID");
        pnCad.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        ctId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctIdActionPerformed(evt);
            }
        });
        pnCad.add(ctId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 172, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CPF");
        pnCad.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        ctCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCpfActionPerformed(evt);
            }
        });
        pnCad.add(ctCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 172, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("REPETIR SENHA");
        pnCad.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        ctSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSenha2ActionPerformed(evt);
            }
        });
        pnCad.add(ctSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 172, -1));

        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        pnCad.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        pnCad.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        pnCad.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        pnCad.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        getContentPane().add(pnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctIdActionPerformed

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNomeActionPerformed

    private void ctSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSenha1ActionPerformed

    private void ctSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSenha2ActionPerformed

    private void ctFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctFoneActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();
            u.setIdUsu(Integer.parseInt(ctId.getText()));
           
            u.setNomeUsu(ctNome.getText());
            u.setEmailUsu(ctEmail.getText());
            u.setSenhaUsu(ctSenha1.getText());
            u.setFoneUsu(ctFone.getText());
            u.setCpfUsu(ctCpf.getText());
            
            if(rbM.isSelected()){
                u.setSexoUsu("M");
            }else{
                u.setSexoUsu("F");
            }
             u.setIdUsu(Integer.parseInt(ctId.getText()));
             
            if (ctSenha1.getText().equals(ctSenha2.getText())) {
               // controlarBtn(2);
                ud.update(u);
                readJTable();
              //  controlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null, "Você inseriu senhas diferentes!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage()
            );
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void ctEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEmailActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que você deseja excluir este registro?", "Excluir Registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                u.setIdUsu(Integer.parseInt(ctId.getText()));
                ud.delete(u);
                readJTable();
              //  controlarBtn(1);
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão Cancelada com sucesso!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage()
            );
        }
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        Usuario u = new Usuario();
        try {
            UsuarioDAO ud = new UsuarioDAO();
            
          
            u.setNomeUsu(ctNome.getText());
            u.setEmailUsu(ctEmail.getText());
            u.setSenhaUsu(ctSenha1.getText());
            u.setFoneUsu(ctFone.getText());
            u.setCpfUsu(ctCpf.getText());
            if (rbF.isSelected()) {
                u.setSexoUsu("F");
            } else {
                u.setSexoUsu("M");
            }

            if (ctSenha1.getText().equals(ctSenha2.getText())) {
                ud.create(u);
                readJTable();
              //  controlarBtn(1);
              this.dispose();
              
             
              
            } else {
                JOptionPane.showMessageDialog(null, "Você inseriu senhas diferentes!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void rbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMActionPerformed

    private void tbCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCadKeyPressed

    private void tbCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadMouseClicked

        controlarBtn(3);
        if (tbCad.getSelectedRow() != -1) {
           ctId.setText(tbCad.getValueAt(tbCad.getSelectedRow(), 0).toString());
            ctNome.setText(tbCad.getValueAt(tbCad.getSelectedRow(), 1).toString());
            ctEmail.setText(tbCad.getValueAt(tbCad.getSelectedRow(), 2).toString());
            ctFone.setText(tbCad.getValueAt(tbCad.getSelectedRow(), 3).toString());
            ctCpf.setText(tbCad.getValueAt(tbCad.getSelectedRow(), 4).toString());
            String s =(String) tbCad.getValueAt(tbCad.getSelectedRow(), 5);
            ctSenha1.setText(tbCad.getValueAt(tbCad.getSelectedRow(), 6).toString());
            ctSenha2.setText(ctSenha1.getText());
           
            if (s.equals("m") || s.equals("M")) {
                rbM.setSelected(true);
            } else {
                rbF.setSelected(true);
            } 
        }
    
    }//GEN-LAST:event_tbCadMouseClicked

    private void ctCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCpfActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadastro.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrCadastro().setVisible(true);
                



} catch (SQLException ex) {
                    Logger.getLogger(FrCadastro.class

.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctFone;
    private javax.swing.JTextField ctId;
    private javax.swing.JTextField ctNome;
    private javax.swing.JPasswordField ctSenha1;
    private javax.swing.JPasswordField ctSenha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnCad;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTable tbCad;
    // End of variables declaration//GEN-END:variables
}
