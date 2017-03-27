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
    private String nombre = null;
    private String dni = null;
    private String estado = null;
    private String sexo = null;
    
    public Persona(String nombre,String dni, String estado, String sexo){
        this.nombre = nombre;
        this.dni = dni;
        this.estado = estado;
        this.sexo = sexo;
    }

    public String getPersona() {
        return this.nombre + ", " + this.dni + ", " + this.estado + ", " + this.sexo;
    }
}
