/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_concreta;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioTransporte;
import Productos_concretos.Automovil;
import Productos_concretos.Moto;

/**
 *
 * @author david
 */
public class TerrestreConcreto implements ServicioFactory {//La clase implementa a servicio Factory

    public ServicioTransporte CrearTrans(int opc) { //Sobre escribe el método retornando un objeto de tipo automovil o tipo moto
        if (opc==1){
            return new Automovil();
        }else if (opc==2){
            return new Moto();
        }
        return null;
    }

}
