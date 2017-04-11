/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mpm
 */
public class PoolPersonas {
    ArrayList <Persona> personasRegistradas = new ArrayList<>();
    
    public PoolPersonas(){
    }
    public void registrarPersona(Persona newPersona){
            personasRegistradas.add(newPersona);      
    }

    public String mostrarPersonasRegistradas() {
        String i = "";
        for( Persona persona : personasRegistradas){
            i += persona.getPersona() + "\n";
        }
        return i;
    }

    public int getNumeroRegistros() {
        return personasRegistradas.size();
    }
    
}
