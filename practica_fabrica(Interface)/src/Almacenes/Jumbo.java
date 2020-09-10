/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenes;

/**
 *
 * @author jorge malaver
 */
import Abstracto.Comun;

public class Jumbo implements Comun {

    String var; // crea variable ripo Sting

    public String Escojer() { // Metodo sobreescrito de la interfaz Comun
        var = " Jumbo";
        return var;
    }
}
