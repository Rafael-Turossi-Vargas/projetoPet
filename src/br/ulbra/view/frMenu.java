
package br.ulbra.view;

import br.ulbra.DAO.PetDAO;
import br.ulbra.DAO.UsuarioDAO;
import br.ulbra.entity.Pet;
import br.ulbra.entity.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frMenu extends javax.swing.JFrame {

    
    public frMenu() throws SQLException {
        initComponents();
        controlar(0);
        painelCadPet.setVisible(false);
        painelUsuario.setVisible(false);
    }

    public void controlar(int x) {
        switch (x) {
            case 0:
               painelCadPet.setVisible(false);
                break;
            case 1:
                painelCadPet.setVisible(true);
                break;
        }

    }

    public void readJTablePet() throws SQLException {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        painelCadPet = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCadPet = new javax.swing.JTable();
        painelUsuario = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCad = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Cadastrados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelCadPet.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout painelCadPetLayout = new javax.swing.GroupLayout(painelCadPet);
        painelCadPet.setLayout(painelCadPetLayout);
        painelCadPetLayout.setHorizontalGroup(
            painelCadPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        painelCadPetLayout.setVerticalGroup(
            painelCadPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(painelCadPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 510, 90));

        painelUsuario.setBackground(new java.awt.Color(204, 204, 204));

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
        jScrollPane3.setViewportView(tbCad);

        javax.swing.GroupLayout painelUsuarioLayout = new javax.swing.GroupLayout(painelUsuario);
        painelUsuario.setLayout(painelUsuarioLayout);
        painelUsuarioLayout.setHorizontalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(painelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 510, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Pets");
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jMenu1MenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem2.setText("Cadastrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        Cadastrados.setText("Cadastrados");
        Cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastradosMouseClicked(evt);
            }
        });
        Cadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastradosActionPerformed(evt);
            }
        });
        jMenu1.add(Cadastrados);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuários");

        jMenuItem5.setText("Cadastrados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastradosActionPerformed
    painelCadPet.setVisible(true);
    painelUsuario.setVisible(false);
        try {
            readJTablePet();
        } catch (SQLException ex) {
            Logger.getLogger(frMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CadastradosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            new FrPet().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastradosMouseClicked
       //JOptionPane.showMessageDialog(null, "a");
        controlar(1);
     
    }//GEN-LAST:event_CadastradosMouseClicked

    private void jMenu1MenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuCanceled
        
    }//GEN-LAST:event_jMenu1MenuCanceled

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

    }//GEN-LAST:event_jMenu1MouseClicked

    private void tbCadPetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadPetMouseClicked

    }//GEN-LAST:event_tbCadPetMouseClicked

    private void tbCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadMouseClicked

       
        

    }//GEN-LAST:event_tbCadMouseClicked

    private void tbCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCadKeyPressed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
painelUsuario.setVisible(true);
painelCadPet.setVisible(false);
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(frMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frMenu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastrados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel painelCadPet;
    private javax.swing.JPanel painelUsuario;
    private javax.swing.JTable tbCad;
    private javax.swing.JTable tbCadPet;
    // End of variables declaration//GEN-END:variables
}
