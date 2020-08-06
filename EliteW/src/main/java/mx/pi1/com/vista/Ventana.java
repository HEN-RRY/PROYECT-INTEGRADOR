/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.pi1.com.vista;

import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import mx.pi1.com.elitew.Persona;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author SONG
 */
public class Ventana extends javax.swing.JFrame {
    /**
     * Creates new form Ventana
     */
    private ArrayList<Persona>listaPersonas;
    private Persona usuarioLogeado=null; 
            
    public Ventana() {
        listaPersonas = new ArrayList<Persona>();//Crear Ojeto que permite guardar a todas las personas
        initComponents();
        sesionCerrada();
        btnSalir.setVisible(false);
        this.setLocationRelativeTo(null);
        btnRegistrar.setVisible(true);
        btnIniciarSesion.setVisible(true);
    }
    private void sesionActiva(){
        btnRegistroUsuarios.setVisible(false);
    }

    private void sesionCerrada(){
        btnRegistroUsuarios.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistroUsuarios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnSalirPrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegistroUsuarios.setText("Registro de Usuarios");
        btnRegistroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuariosActionPerformed(evt);
            }
        });

        btnSalir.setText("Cerrar Sesion");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSalirPrograma.setText("X");
        btnSalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistroUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalirPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        Login login = new Login(this, true, listaPersonas /*Le pasamos la lista completa de usuarios registrados*/);
        login.setLocationRelativeTo(this);//Pone la posicion del objeto(Ventana) en la posicion media de esta clase
        login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Metodod permite desaparecer la ventana(Objeto)
        login.setVisible(true);//De que la ventana(Objeto) va sar visible
        
        if(login.personaLogeada()!=null){//Si la persona que se optiene diferente de null, se logeo correctamente
            btnSalir.setVisible(true);//Boton se mostrará en la ventana
            btnRegistrar.setVisible(false);//Boton no se mostrará en la ventana
            btnIniciarSesion.setVisible(false);//Boton no se mostrará en la ventana
            this.usuarioLogeado = login.personaLogeada();//El objeto global tendra al objeto que se obtenga de la login
            cambiarEstadoDeFecha(login.personaLogeada());//Le pasamos el objeto que se obtenio en la vetnana(objeto) registrar
            JOptionPane.showMessageDialog(this, "Hola "+usuarioLogeado.getNombre());//Mostrar mensaje de decir "HOLA JUAN MAMANI"
            lblUsuario.setText(login.personaLogeada().getNombre());//La etiqueta de esta clase cambiara el valor de la etiqueta segun q usuario incie la sesión
        }else {
            JOptionPane.showMessageDialog(this, "Error al iniciar sesión");//Si no se obtenio ninguna persona logeada o la persona tendra el valor null, no incio sesion correctamente
        }
        for(Persona p : this.listaPersonas){//For each -> recorrer el Array List con todos los usuaios registrados
            System.out.println("Nombre: " +p.getNombre());//Imprimi el nombre
        }
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    
    private void cambiarEstadoDeFecha(Persona persona){//Algoritmo que me permite cambiar la hora de inciar la sesión
        Persona p = null;
        for(int i=0; i < listaPersonas.size(); i++){
            if(listaPersonas.get(i).getCorreo().equals(persona.getCorreo())){
                if(listaPersonas.get(i).getConstrasenia().equals(persona.getConstrasenia())){
                    listaPersonas.get(i).setHoraSesión(new Date());//Cambiar la hra de incio de sesión
                }
            }
        }
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistrarPersona registrar = new RegistrarPersona(this, true);
        registrar.setLocationRelativeTo(this);//El objeto se centre en la posicio media de esta misma clase
        registrar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registrar.setVisible(true);
        if(registrar.obtenerPersonaRegistrada()!=null){
            this.listaPersonas.add(registrar.obtenerPersonaRegistrada());
            JOptionPane.showMessageDialog(this, "Usuario " + registrar.obtenerPersonaRegistrada().getNombre()+" registrado correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Usuario no registrado");

        }
        for(Persona p : this.listaPersonas){
            System.out.println("-------------------------");
            System.out.println("Correo: " +p.getCorreo());
            System.out.println("Contraseña: " +p.getConstrasenia());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuariosActionPerformed
        if(usuarioLogeado!=null){//Solo se muestra el registro si se inicio sesión
            RegistroDeUsuarios registro = new RegistroDeUsuarios(this,true, this.listaPersonas/*Pasamos la lista completa de usuarios*/);
            registro.setLocationRelativeTo(this);
            registro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            registro.setVisible(true);
        }
    }//GEN-LAST:event_btnRegistroUsuariosActionPerformed

    private void btnSalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProgramaActionPerformed
        
        int valor = JOptionPane.showConfirmDialog(this, "¿desea salir?");
        System.out.println(valor);
        if(valor==0){
            System.exit(0);
        }
           
    }//GEN-LAST:event_btnSalirProgramaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        btnSalir.setVisible(false);
        usuarioLogeado=null;
        lblUsuario.setText("");
        btnRegistrar.setVisible(true);
        btnIniciarSesion.setVisible(true);
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistroUsuarios;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirPrograma;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
