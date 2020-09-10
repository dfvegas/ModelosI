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

public class Exito implements Comun {

    String var; // crea variable tipo Sting

    public String Escojer() { // Metodo sobreescrito de la interfaz Comun
        var = " Exito";
        return var;
    }
}
