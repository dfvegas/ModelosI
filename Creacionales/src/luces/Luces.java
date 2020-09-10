/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luces;

/**
 *
 * @author User
 */
public class Luces {

    private static Luces inst; //referencia de la clase Luces
    private String luces; // atributo de tipo String
    private static String tipo;  // atributo de tipo String
    
    private Luces() { // constructor privado de clase

    }

    public static Luces getLuces() { // metodo get del atributo inst
        if (inst == null) {//Si el metodo inst esta sin utilizar, va a regresar instancia
            inst = new Luces(); // instancia de la clase Luces
        }
        return inst;
    }

    public String inst(String mensaje) {//Método que contendrá el mensaje de prueba 
        return mensaje;
    }

    public void setvalor(String lu) {//método set del atributo luces 
        luces = lu;
    }

    public String getvalor() { //método get del atributo luces
        return luces;
    }
}
