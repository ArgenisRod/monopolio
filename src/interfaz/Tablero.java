/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Banca;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author christian
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form tablero
     */
    
    private Banca banco = new Banca();
    
    private int turno = 0;
    private int jugarDado = 0;
    
    private int posicion_ficha1;
    private int posicion_ficha2;
    private int posicion_ficha3;
    private int posicion_ficha4;
    
    private int esquina = 1;
    private int esquina2 = 1;
    private int esquina3 = 1;
    private int esquina4 = 1;
    
    private int paso;
    private int paso2;
    private int paso3;
    private int paso4;
    
    private String cadena1 = "";
    private String cadena2 = "";
    private String cadena3 = "";
    private String cadena4 = "";
    private String cadenaDinero1;
    private String cadenaDinero2;
    private String cadenaDinero3;
    private String cadenaDinero4;
    
    private int avanzarCasillas;
    private int valorDado1;
    private int valorDado2;
        
    public Tablero() {
        
        initComponents();
        Banca(banco);
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
        jLabelAdorno = new javax.swing.JLabel();
        jLabelFicha1 = new javax.swing.JLabel();
        jLabelFicha3 = new javax.swing.JLabel();
        jLabelFicha2 = new javax.swing.JLabel();
        jLabelFicha4 = new javax.swing.JLabel();
        jLabelTablero = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnJugarDado = new javax.swing.JButton();
        txtDado1 = new javax.swing.JTextField();
        txtDado2 = new javax.swing.JTextField();
        txtAvanzarCasillas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDineroJugador1 = new javax.swing.JTextField();
        txtDineroJugador2 = new javax.swing.JTextField();
        txtDineroJugador3 = new javax.swing.JTextField();
        txtDineroJugador4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 0, -1, -1));

        jLabelAdorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.logo.png"))); // NOI18N
        getContentPane().add(jLabelAdorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 190, -1));

        jLabelFicha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_amarillo.png"))); // NOI18N
        jLabelFicha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        jLabelFicha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_azul.png"))); // NOI18N
        jLabelFicha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jLabelFicha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_naranja.png"))); // NOI18N
        jLabelFicha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, 30));

        jLabelFicha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_verde.png"))); // NOI18N
        jLabelFicha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));

        jLabelTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/8463965759_f04799072d_b.jpg"))); // NOI18N
        jLabelTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTableroMouseClicked(evt);
            }
        });
        jLabelTablero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelTableroKeyPressed(evt);
            }
        });
        getContentPane().add(jLabelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnVolver.setText("Salir");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 680, 120, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        btnJugarDado.setText("Jugar Dado");
        btnJugarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarDadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugarDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 100, -1));
        getContentPane().add(txtDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 40, 30));
        getContentPane().add(txtDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 40, 30));
        getContentPane().add(txtAvanzarCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 40, -1));

        jLabel1.setText("Avanzar Casillas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabel2.setText("Turno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));
        getContentPane().add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 50, -1));

        jLabel3.setText("Banco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, -1, -1));

        jLabel4.setText("jugador1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jLabel5.setText("jugador2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        jLabel6.setText("jugador3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        jLabel7.setText("jugador4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));
        getContentPane().add(txtDineroJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 60, -1));
        getContentPane().add(txtDineroJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 60, -1));
        getContentPane().add(txtDineroJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 60, -1));
        getContentPane().add(txtDineroJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 60, -1));

        jLabel8.setText("Dinero");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jLabelTableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelTableroKeyPressed

    }//GEN-LAST:event_jLabelTableroKeyPressed

    private void jLabelTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTableroMouseClicked

    }//GEN-LAST:event_jLabelTableroMouseClicked

    private void Banca(Banca banco){
        //banco = new Banca();
        
        cadenaDinero1 = String.valueOf(banco.getDineroJugador1()); 
        txtDineroJugador1.setText(cadenaDinero1);
        
        cadenaDinero2 = String.valueOf(banco.getDineroJugador2()); 
        txtDineroJugador2.setText(cadenaDinero2);
        
        cadenaDinero3 = String.valueOf(banco.getDineroJugador3()); 
        txtDineroJugador3.setText(cadenaDinero3);
        
        cadenaDinero4 = String.valueOf(banco.getDineroJugador4()); 
        txtDineroJugador4.setText(cadenaDinero4);
        
        
    }
    
    private void jLabelFicha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha1MouseClicked
        if (turno == 1 && jugarDado == 1){
            if (esquina == 1 || esquina == 5){
                if (paso == 4 || paso == 1){
                    posicion_ficha1 = posicion_ficha1 - 10;
                    paso = 10;
                }

                if (posicion_ficha1 > 10){
                    esquina = 2;
                    paso = 1;
                }else{
                    jLabelFicha1.setLocation(620-(posicion_ficha1*56),635);
                }
            }

            if (esquina == 2){
                if (paso == 1){
                    posicion_ficha1 = posicion_ficha1 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso = 2;
                }

                if (posicion_ficha1 > 10){
                    esquina = 3;
                }else{
                    jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina == 3){
                if (paso == 2){
                    posicion_ficha1 = posicion_ficha1 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso = 3;
                }

                if (posicion_ficha1 > 10){
                    esquina = 4;
                }else{
                    jLabelFicha1.setLocation(60+(55*posicion_ficha1),30);
                }
            }

            if(esquina == 4){
                if(paso == 3){
                    posicion_ficha1 = posicion_ficha1 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso = 4;
                }

                if(posicion_ficha1 > 10){
                    esquina = 5;
                }else{
                    jLabelFicha1.setLocation(635, 60+(55*posicion_ficha1));
                }         
            }
        }       
     
    }//GEN-LAST:event_jLabelFicha1MouseClicked

    private void btnJugarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDadoActionPerformed
        
        if (jugarDado >= 4){
            jugarDado = 1;           
        }else{
            jugarDado = jugarDado + 1;
        }
        
        if (turno >= 4){
            turno = 1;
        }else{
            turno = turno +1;
        }
        
        Random r1 = new Random();
        Random r2 = new Random();
        
        valorDado1 = r1.nextInt(6)+1;
        valorDado2 = r2.nextInt(6)+1;
        
        avanzarCasillas = valorDado1 + valorDado2;
        
        if (turno == 1){
            posicion_ficha1 = posicion_ficha1 + avanzarCasillas;
            System.out.println("turno: " + turno + " avanzar casillas: " + avanzarCasillas);
        }
        
        if (turno == 2){
            posicion_ficha2 = posicion_ficha2 + avanzarCasillas;       
            System.out.println("turno: " + turno + " avanzar casillas " + avanzarCasillas);
        }
        
        if (turno == 3){
            posicion_ficha3 = posicion_ficha3 + avanzarCasillas;   
            System.out.println("turno: " + turno + " avanzar casillas " + avanzarCasillas);
        } 
        
        if (turno == 4){
            posicion_ficha4 = posicion_ficha4 + avanzarCasillas;   
            System.out.println("turno: " + turno + " avanzar casillas " + avanzarCasillas);
        }
        
        cadena1 = String.valueOf(valorDado1);
        cadena2 = String.valueOf(valorDado2);
        cadena3 = String.valueOf(avanzarCasillas);
        cadena4 = String.valueOf(turno);
        
        txtDado1.setText(cadena1);
        txtDado2.setText(cadena2);
        txtAvanzarCasillas.setText(cadena3);
        txtTurno.setText(cadena4);
        
        
    }//GEN-LAST:event_btnJugarDadoActionPerformed

    private void jLabelFicha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha2MouseClicked
        if (turno == 2 && jugarDado == 2){
            if (esquina2 == 1 || esquina2 == 5){
                if (paso2 == 4 || paso2 == 1){
                    posicion_ficha2 = posicion_ficha2 - 10;
                    paso2 = 10;
                }

                if (posicion_ficha2 > 10){
                    esquina2 = 2;
                    paso2 = 1;
                }else{
                    jLabelFicha2.setLocation(620-(posicion_ficha2*56),635);
                }
            }

            if (esquina2 == 2){
                if (paso2 == 1){
                    posicion_ficha2 = posicion_ficha2 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso2 = 2;
                }

                if (posicion_ficha2 > 10){
                    esquina2 = 3;
                }else{
                    jLabelFicha2.setLocation(30,635-(59*posicion_ficha2));
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina2 == 3){
                if (paso2 == 2){
                    posicion_ficha2 = posicion_ficha2 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso2 = 3;
                }

                if (posicion_ficha2 > 10){
                    esquina2 = 4;
                }else{
                    jLabelFicha2.setLocation(60+(55*posicion_ficha2),30);
                }
            }

            if(esquina2 == 4){
                if(paso2 == 3){
                    posicion_ficha2 = posicion_ficha2 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso2 = 4;
                }

                if(posicion_ficha2 > 10){
                    esquina2 = 5;
                }else{
                    jLabelFicha2.setLocation(635, 60+(55*posicion_ficha2));
                }         
            }
        }    
    }//GEN-LAST:event_jLabelFicha2MouseClicked

    private void jLabelFicha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha3MouseClicked
        if (turno == 3 && jugarDado == 3){
            if (esquina3 == 1 || esquina3 == 5){
                if (paso3 == 4 || paso3 == 1){
                    posicion_ficha3 = posicion_ficha3 - 10;
                    paso = 10;
                }

                if (posicion_ficha3 > 10){
                    esquina3 = 2;
                    paso3 = 1;
                }else{
                    jLabelFicha3.setLocation(620-(posicion_ficha3*56),635);
                }
            }

            if (esquina3 == 2){
                if (paso3 == 1){
                    posicion_ficha3 = posicion_ficha3 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso3 = 2;
                }

                if (posicion_ficha3 > 10){
                    esquina3 = 3;
                }else{
                    jLabelFicha3.setLocation(30,635-(59*posicion_ficha3));
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina3 == 3){
                if (paso3 == 2){
                    posicion_ficha3 = posicion_ficha3 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso3 = 3;
                }

                if (posicion_ficha3 > 10){
                    esquina3 = 4;
                }else{
                    jLabelFicha3.setLocation(60+(55*posicion_ficha3),30);
                }
            }

            if(esquina3 == 4){
                if(paso3 == 3){
                    posicion_ficha3 = posicion_ficha3 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso3 = 4;
                }

                if(posicion_ficha3 > 10){
                    esquina3 = 5;
                }else{
                    jLabelFicha3.setLocation(635, 60+(55*posicion_ficha3));
                }         
            }
        }
    }//GEN-LAST:event_jLabelFicha3MouseClicked

    private void jLabelFicha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha4MouseClicked
        if (turno == 4 && jugarDado == 4){
            if (esquina4 == 1 || esquina4 == 5){
                if (paso4 == 4 || paso4 == 1){
                    posicion_ficha4 = posicion_ficha4 - 10;
                    paso4 = 10;
                }

                if (posicion_ficha4 > 10){
                    esquina4 = 2;
                    paso4 = 1;
                }else{
                    jLabelFicha4.setLocation(620-(posicion_ficha4*56),635);
                }
            }

            if (esquina4 == 2){
                if (paso4 == 1){
                    posicion_ficha4 = posicion_ficha4 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso4 = 2;
                }

                if (posicion_ficha4 > 10){
                    esquina4 = 3;
                }else{
                    jLabelFicha4.setLocation(30,635-(59*posicion_ficha4));
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina4 == 3){
                if (paso4 == 2){
                    posicion_ficha4 = posicion_ficha4 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso4 = 3;
                }

                if (posicion_ficha4 > 10){
                    esquina4 = 4;
                }else{
                    jLabelFicha4.setLocation(60+(55*posicion_ficha4),30);
                }
            }

            if(esquina4 == 4){
                if(paso4 == 3){
                    posicion_ficha4 = posicion_ficha4 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso4 = 4;
                }

                if(posicion_ficha4 > 10){
                    esquina4 = 5;
                }else{
                    jLabelFicha4.setLocation(635, 60+(55*posicion_ficha4));
                }         
            }
        }    
    }                                         

    /*private void jLabelFicha3MouseClicked(java.awt.event.MouseEvent evt) {                                          
        
    }//GEN-LAST:event_jLabelFicha4MouseClicked

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarDado;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAdorno;
    private javax.swing.JLabel jLabelFicha1;
    private javax.swing.JLabel jLabelFicha2;
    private javax.swing.JLabel jLabelFicha3;
    private javax.swing.JLabel jLabelFicha4;
    private javax.swing.JLabel jLabelTablero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAvanzarCasillas;
    private javax.swing.JTextField txtDado1;
    private javax.swing.JTextField txtDado2;
    private javax.swing.JTextField txtDineroJugador1;
    private javax.swing.JTextField txtDineroJugador2;
    private javax.swing.JTextField txtDineroJugador3;
    private javax.swing.JTextField txtDineroJugador4;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
