/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.modelo;

/**
 *
 * @author mpm
 */
public class Persona {
    String nombre;
    String edad;
    String sexo;

    public Persona(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String getPersona(){
        return nombre + edad + sexo;
    }
    
}
