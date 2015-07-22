/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DataBase;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Argenis
 */
public class Perfil extends javax.swing.JFrame {

    public static String alias="";
    public static DataBase db;
    /**
     * Creates new form Administracion
     */
    public Perfil() {
        initComponents();
        txtAlias.setText(alias);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        txtAlias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        verificar1 = new javax.swing.JButton();
        verificar3 = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();
        verificar5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAlias.setEditable(false);
        txtAlias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAlias.setText("Usuario");
        txtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ALIAS:");

        verificar1.setText("INFORME DE PARTIDAS");
        verificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar1ActionPerformed(evt);
            }
        });

        verificar3.setText("PARTIDAS GUARDADAS");
        verificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar3ActionPerformed(evt);
            }
        });

        btnCambiarContraseña.setText("CAMBIAR CONTRASEÑA");
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });

        verificar5.setText("NUEVA PARTIDA");
        verificar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar5ActionPerformed(evt);
            }
        });

        jButton1.setText("UNIRSE A PARTIDA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.logo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Perfil");
        jLabel7.setToolTipText("");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(verificar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verificar3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarContraseña)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificar5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSalir)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliasActionPerformed

    private void verificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificar1ActionPerformed

    private void verificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar3ActionPerformed
        PartidasGuardadas.alias=alias;
        PartidasGuardadas.db = db;
        PartidasGuardadas.main(null);
        this.dispose();
    }//GEN-LAST:event_verificar3ActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        cambiarContraseña();
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

    private void verificar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar5ActionPerformed
        // TODO add your handling code here:
        NuevaPartida.main(null);
        NuevaPartida.alias=alias;
        this.dispose();
        
    }//GEN-LAST:event_verificar5ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel title;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JButton verificar1;
    private javax.swing.JButton verificar3;
    private javax.swing.JButton verificar5;
    // End of variables declaration//GEN-END:variables

    private void cambiarContraseña() {
        
        JPasswordField txtPass = new JPasswordField();
        
        int opcion = JOptionPane.showConfirmDialog(null, txtPass, "Ingresa tu contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            String clave = new String(txtPass.getPassword());
            String clave2;
            if(db.autenticarUsuario(alias, clave)){
                txtPass.setText("");
                opcion=JOptionPane.showConfirmDialog(null, txtPass, "Ingresa la nueva contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if(opcion==JOptionPane.OK_OPTION){
                    clave=txtPass.getText();
                    if(!verificarPass(clave))
                        return;
                    txtPass.setText("");
                    opcion=JOptionPane.showConfirmDialog(null, txtPass, "Repita la nueva contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if(opcion==JOptionPane.OK_OPTION){
                        clave2=txtPass.getText();
                        if(clave.equals(clave2)){
                            if(db.setCambiarContraseña(alias,clave))
                                JOptionPane.showMessageDialog(this, "La contraseña ha sido cambiada.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                        }else
                            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else
                JOptionPane.showMessageDialog(this, "La contraseña introducida es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean verificarPass(String contraseña){
        
        if(contraseña.length()<8){
            JOptionPane.showMessageDialog(this, "La contraseña no puede terner menos de 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        for(int i = 0; i < contraseña.length(); ++i){
            
            char caracter = contraseña.charAt(i);
            
            if(!Character.isLetterOrDigit(caracter)){
                JOptionPane.showMessageDialog(this, "La Contraseña sólo debe contener letras y/o números", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
}
