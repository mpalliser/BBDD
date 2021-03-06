/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.vista;

import javax.swing.JOptionPane;
import org.foobarspam.controlador.ComponentesFormulario;

/**
 *
 * @author mpm
 */
public class InterfaceComponents extends javax.swing.JFrame {
    private String estado = null;
    /**
     * Creates new form InterfaceComponents
     */
    public InterfaceComponents() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        acceptar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        sexo = new javax.swing.JComboBox<>();
        paro = new javax.swing.JCheckBox();
        estudiante = new javax.swing.JCheckBox();
        trabajador = new javax.swing.JCheckBox();
        sexoLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        nombreLabel.setText("Nombre");

        dniLabel.setText("Dni");

        acceptar.setBackground(new java.awt.Color(0, 102, 102));
        acceptar.setForeground(new java.awt.Color(255, 255, 255));
        acceptar.setText("Aceptar");
        acceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(0, 102, 102));
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 102, 102));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        sexo.setBackground(new java.awt.Color(0, 102, 102));
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Hombre", "Mujer" }));

        paro.setText("Esta en paro");
        paro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paroActionPerformed(evt);
            }
        });

        estudiante.setText("Estudiando");
        estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteActionPerformed(evt);
            }
        });

        trabajador.setText("Trabajador");
        trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadorActionPerformed(evt);
            }
        });

        sexoLabel.setText("Sexo");

        nombre.setBackground(new java.awt.Color(204, 255, 204));

        dni.setBackground(new java.awt.Color(204, 255, 204));
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombreLabel)
                                        .addComponent(dniLabel))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dni, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(nombre)))
                                .addComponent(trabajador)
                                .addComponent(paro)
                                .addComponent(sexoLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estudiante)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoLabel)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptar)
                    .addComponent(limpiar)
                    .addComponent(salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptarActionPerformed
        String nombre = this.nombre.getText();
        String dni = this.dni.getText();
        String sexo = this.sexo.getSelectedItem().toString();
        
        if (nombre.length() <= 2 || nombre.matches(".*\\d+.*")){
            JOptionPane.showMessageDialog(this, "Debes introducir un nombre válido");
        }else if( estado == null || estado == ""){
            JOptionPane.showMessageDialog(this, "Debes elegir un estado");            
        }else if ( this.sexo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Debes elegir un sexo");
        }
        //Expresión regular que valida si un DNI/NIE es correcto(tanto numero como la letra)
        else if ( dni.matches("(^\\d{8}[A-Z&&[^IÑOU]])|(^[XYZ]\\d{7}[A-Z&&[^IÑOU]])")){
            ComponentesFormulario.setPersonaRegistrada(nombre,dni,sexo,this.estado);
            JOptionPane.showMessageDialog(null, ComponentesFormulario.getPersona() + ": Registrada con exito");
        }else{
            JOptionPane.showMessageDialog(this, "Debes introducir un DNI válido");
        }
    }//GEN-LAST:event_acceptarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        nombre.setText("");
        dni.setText("");
        paro.setSelected(false);
        estudiante.setSelected(false);
        trabajador.setSelected(false);
        sexo.setSelectedIndex(0);
    }//GEN-LAST:event_limpiarActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void paroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paroActionPerformed
        estado = "en paro";
        estudiante.setSelected(false);
        trabajador.setSelected(false);
    }//GEN-LAST:event_paroActionPerformed

    private void estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteActionPerformed
        estado = "estudiante";
        paro.setSelected(false);
        trabajador.setSelected(false);
    }//GEN-LAST:event_estudianteActionPerformed

    private void trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadorActionPerformed
        estado = "trabajador";
        paro.setSelected(false);
        estudiante.setSelected(false);
    }//GEN-LAST:event_trabajadorActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        ComponentesFormulario.escribirRegistro();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceComponents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ComponentesFormulario iniciar = new ComponentesFormulario();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceComponents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptar;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JCheckBox estudiante;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JCheckBox paro;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JCheckBox trabajador;
    // End of variables declaration//GEN-END:variables
}
