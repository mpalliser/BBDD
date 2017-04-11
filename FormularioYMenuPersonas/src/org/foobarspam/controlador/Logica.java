/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.controlador;

import javax.swing.JOptionPane;
import org.foobarspam.modelo.*;

/**
 *
 * @author mpm
 */
public class Logica {
    static PoolPersonas registroPersonas = null;

    public static void inicializarRegistro() {
        registroPersonas = new PoolPersonas();
    }
    public static void registrar(String nombre, String edad, String sexo) {
        if (nombre.equals("") || edad.equals("") || sexo.equals("")){
            JOptionPane.showMessageDialog(null, "Los valores introducidos NO son invalidos");
        }else if (registroPersonas.getNumeroRegistros() < 10){
            Persona nuevaPersona = new Persona(nombre, edad, sexo);
            registroPersonas.registrarPersona(nuevaPersona);  
            JOptionPane.showMessageDialog(null, "Registrado/a: " + nombre + edad + sexo);
        }else {
            JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de personas registradas");
        } 
    }

    public static void mostrarRegistro() {
        JOptionPane.showMessageDialog(null, registroPersonas.mostrarPersonasRegistradas());
    }
    
    
}
