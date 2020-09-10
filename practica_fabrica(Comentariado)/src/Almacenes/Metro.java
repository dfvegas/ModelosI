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
import Abstracto.Comun; //importa la clase Comun del paquete Abstracto
public class Metro extends Comun {
    
    @Override
    public String Escojer(){
        return " Metro"; //Sobreescritura del metodo heredado de la clase comun
    }
    
}
