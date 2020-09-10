/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_concreta;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioPiezas;
import Productos_concretos.RuedaBridgestone;
import Productos_concretos.RuedaGoodyear;
import Productos_concretos.RuedaMichellin;

/**
 *
 * @author david
 */
public class RuedaConcreta implements ServicioFactory{ // implementa la interfaz ServicioFactory

    @Override
    public ServicioPiezas CrearPiezas(int opc) { // sobree escribe el metodo CrearPiezas de la interfaz
        switch (opc) {
            case 1:
                return new RuedaMichellin(); // retorna el producto concreto RuedaMichellin
            case 2:
                return new RuedaGoodyear(); // retorna el producto concreto RuedaGoodyear
            case 3:
                return new RuedaBridgestone(); // retorna el producto concreto RuedaBridgestone 
            default:
                break;
        }
        return null;
    }
    
}
