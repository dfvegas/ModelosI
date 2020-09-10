/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos_concretos;

import Fabrica_abstracta.ServicioPiezas;

/**
 *
 * @author david
 */
public class ChasisMonocasco implements ServicioPiezas{ // implementa la interfaz ServicioPiezas

    @Override
    public String Ensamblado() { // sobreescritura del metodo de la interfaz
        return "Chasis Monocasco";
    }
    
}
