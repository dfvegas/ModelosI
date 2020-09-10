/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author jorge malaver
 */
import Almacenes.*;
//import Almacenes.Jumbo;
import Abstracto.Comun;

public class fabrica {

    protected String seleccion; //crea atributo llamado seleccion

    public fabrica(String sel) {
        seleccion = sel; //método que guarda la variable sel en la variable seleccion
    }

    public Comun crear_selecion() { //método para retornar el almacén selecciondo
        if (seleccion.equalsIgnoreCase("Exito")) {
            return new Exito(); //retorna el valor sobreescrito en la clase Exito
        } else if (seleccion.equalsIgnoreCase("Metro")) {
            return new Metro();//retorna el valor sobreescrito en la clase Jumbo
        } else {
            return new Jumbo(); //retorna el valor sobreescrito en la clase Metro
        }
    }

}
