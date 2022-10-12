/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.DAO.ConnectionFactory;
import br.ulbra.DAO.PetDAO;
import br.ulbra.DAO.UsuarioDAO;
import br.ulbra.entity.Pet;
import br.ulbra.entity.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrPet extends javax.swing.JFrame {

    /**
     * Creates new form FrPet
     */
    public FrPet() throws SQLException {
        initComponents();

        readJTable();

    }

    public void controlarBtn(int op) {
        switch (op) {
            case 1:
                pnCadPet.setVisible(false);
                btSalvar.setEnabled(true);
                break;
            case 2:
                pnCadPet.setVisible(true);
                btAlterar.setEnabled(false);
                btExcluir.setEnabled(false);
                break;
            case 3:
                pnCadPet.setVisible(true);
                btAlterar.setEnabled(true);
                btExcluir.setEnabled(true);
                btSalvar.setEnabled(false);
                break;
        }
        this.pack();
    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbCadPet.getModel();
        modelo.setNumRows(0);
        PetDAO pdao = new PetDAO();
        for (Pet p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getIdPet(),
                p.getRacaPet(),
                p.getPortePet(),
                p.getDescPet(),
                p.getPesoPet(),
                p.getVascPet()
            });
        }
    }

    public void readJTableForDesc(String nome) throws SQLException {
        DefaultTableModel modelo
                = (DefaultTableModel) tbCadPet.getModel();
        modelo.setNumRows(0);
        PetDAO pdao = new PetDAO();
        for (Pet p : pdao.readForDesc(nome)) {
            modelo.addRow(new Object[]{
                p.getIdPet(),
                p.getRacaPet(),
                p.getPortePet(),
                p.getDescPet(),
                p.getPesoPet(),
                p.getVascPet()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCadPet = new javax.swing.JPanel();
        ctRacaPet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ctPortePet = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ctDescricaoPet = new javax.swing.JTextField();
        ctPesoPet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ctIdpet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ctVascinaPet = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCadPet = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnCadPet.setForeground(new java.awt.Color(255, 255, 255));
        pnCadPet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnCadPet.add(ctRacaPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 138, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RAÇA DO PET");
        pnCadPet.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PORTE DO PET");
        pnCadPet.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        pnCadPet.add(ctPortePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 138, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESCRIÇÃO DO PET");
        pnCadPet.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        pnCadPet.add(ctDescricaoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 138, -1));
        pnCadPet.add(ctPesoPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 138, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IDPET");
        pnCadPet.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VASCINAS DO PET");
        pnCadPet.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));
        pnCadPet.add(ctIdpet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 138, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PESO DO PET");
        pnCadPet.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));
        pnCadPet.add(ctVascinaPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 140, -1));

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        pnCadPet.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        pnCadPet.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        pnCadPet.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        tbCadPet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cód", "Raça", "Porte", "Descição", "Peso", "Vacina"
            }
        ));
        tbCadPet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCadPetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCadPet);

        pnCadPet.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, 390, 88));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/91.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        pnCadPet.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        getContentPane().add(pnCadPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Pet p = new Pet();
        try {
            PetDAO pd = new PetDAO();
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que você deseja excluir este registro?", "Excluir Registro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                p.setIdPet(Integer.parseInt(ctIdpet.getText()));
                pd.delete(p);
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
        this.dispose();
        Pet p = new Pet();
        try {
            PetDAO pd = new PetDAO();

            p.setRacaPet(ctRacaPet.getText());
            p.setPortePet(ctPortePet.getText());
            p.setDescPet(ctDescricaoPet.getText());
            p.setPesoPet(Double.parseDouble(ctPesoPet.getText()));
            p.setVascPet(ctVascinaPet.getText());

            pd.create(p);
            readJTable();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        Pet p = new Pet();
        try {
            PetDAO pd = new PetDAO();
            p.setIdPet(Integer.parseInt(ctIdpet.getText()));

            p.setRacaPet(ctRacaPet.getText());
            p.setPortePet(ctPortePet.getText());
            p.setDescPet(ctDescricaoPet.getText());
            p.setPesoPet(Double.parseDouble(ctPesoPet.getText()));
            p.setVascPet(ctVascinaPet.getText());

            p.setIdPet(Integer.parseInt(ctIdpet.getText()));

            pd.update(p);
            readJTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage()
            );
        }


    }//GEN-LAST:event_btAlterarActionPerformed

    private void tbCadPetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadPetMouseClicked

        controlarBtn(3);
        if (tbCadPet.getSelectedRow() != -1) {
            ctIdpet.setText(tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 0).toString());
            ctRacaPet.setText(tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 1).toString());
            ctPortePet.setText(tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 2).toString());
            ctDescricaoPet.setText(tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 3).toString());
            ctPesoPet.setText(tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 4).toString());
            ctVascinaPet.setText(tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 5).toString());
            String s = (String) tbCadPet.getValueAt(tbCadPet.getSelectedRow(), 6);
            

        }
    }//GEN-LAST:event_tbCadPetMouseClicked

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
            java.util.logging.Logger.getLogger(FrPet.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPet.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPet.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPet.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrPet().setVisible(true);
                

} catch (SQLException ex) {
                    Logger.getLogger(FrPet.class
.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField ctDescricaoPet;
    private javax.swing.JTextField ctIdpet;
    private javax.swing.JTextField ctPesoPet;
    private javax.swing.JTextField ctPortePet;
    private javax.swing.JTextField ctRacaPet;
    private javax.swing.JTextField ctVascinaPet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnCadPet;
    private javax.swing.JTable tbCadPet;
    // End of variables declaration//GEN-END:variables

}
