/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.modelo;

import java.util.ArrayList;

/**
 *
 * @author mpm
 * Futura lista de personas registradas, no se usa por ahora en el programa.
 */
public class PoolPersonas {
    private static ArrayList<Persona> personasRegistradas = new ArrayList<>();
    public PoolPersonas(ArrayList<Persona> personas){
        this.personasRegistradas = personas;
    }
    public void registrarPersona(Persona persona){
        this.personasRegistradas.add(persona);
    }
    public static ArrayList<Persona> getPersonasRegistradas(){
        return PoolPersonas.personasRegistradas;
    }
}
