/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_concreta;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioPiezas;
import Productos_concretos.ChasisMonocasco;
import Productos_concretos.ChasisCoupe;
import Productos_concretos.ChasisMuscle;

/**
 *
 * @author david
 */
public class ChasisConcreto implements ServicioFactory{ // implementa la interfaz ServicioFactory

    @Override
    public ServicioPiezas CrearPiezas(int opc) { // sobree escribe el metodo CrearPiezas de la interfaz
        switch (opc) {
            case 1:
                return new ChasisMuscle(); // retorna el producto concreto ChasisMuscle
            case 2:
                return new ChasisCoupe(); // retorna el producto concreto ChasisMuscle
            case 3:
                return new ChasisMonocasco(); // retorna el producto concreto ChasisMonocasco
            default:
                break;
        }
        return null;
    }
    
}
