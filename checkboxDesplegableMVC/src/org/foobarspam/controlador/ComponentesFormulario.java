/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.foobarspam.modelo.Persona;

/**
 *
 * @author mpm
 * Toda la parte lógica de la aplicación se ejecuta desde la funcion componentes.
 * Contiene una clase persona que se utiliza de molde para crear personas y añadirlas a una array/txt.
 * También contiene una clase PoolPersonas que aun esta sin implementar.
 */
public class ComponentesFormulario {
    static private Persona personaRegistrada = null;
    static private ArrayList<Persona> personasRegistradas = new ArrayList<>();
    
    public static void setPersonaRegistrada(String nombre,String dni, String sexo, String estado){
      personaRegistrada = new Persona(nombre, dni, sexo, estado);
      personasRegistradas.add(personaRegistrada);
    }
    public static String getPersona(){
        return personaRegistrada.getPersona();
    }

    public static void escribirRegistro() {
        try {
            FileWriter fw =new FileWriter("src/registro.txt");
            for (Persona persona : personasRegistradas){
                fw.write(persona.getPersona()+"\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
