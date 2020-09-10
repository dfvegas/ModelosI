/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_concreta;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioTransporte;
import Productos_concretos.Yate;

/**
 *
 * @author david
 */
public class AcuaticoConcreto implements ServicioFactory{//La clase implementa a servicio Factory

    public ServicioTransporte CrearTrans(int opc) { //Sobre escribe el método retornando un objeto de tipo yate
        return new Yate();
    }
    
}
