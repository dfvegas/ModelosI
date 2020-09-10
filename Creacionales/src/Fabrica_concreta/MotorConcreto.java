/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_concreta;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioPiezas;
import Productos_concretos.MotorV10;
import Productos_concretos.MotorTFSI;
import Productos_concretos.MotorV6;

/**
 *
 * @author david
 */
public class MotorConcreto implements ServicioFactory{ // implementa la interfaz ServicioFactory

    @Override
    public ServicioPiezas CrearPiezas(int opc) { // sobree escribe el metodo CrearPiezas de la interfaz
        switch (opc) {
            case 1:
                return new MotorV6(); // retorna el producto concreto MotorV6 
            case 2:
                return new MotorTFSI(); // retorna el producto concreto MotorTFSI
            case 3:
                return new MotorV10(); // retorna el producto concreto MotorV10
            default: 
                break;
        }
        return null;
    }
    
}
