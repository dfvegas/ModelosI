/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete_builder;

import Fabrica_abstracta.CarroBuilder;
import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioPiezas;
import Fabrica_concreta.ChasisConcreto;
import Fabrica_concreta.MotorConcreto;
import Fabrica_concreta.RuedaConcreta;


/**
 *
 * @author david
 */
public class Camaro extends CarroBuilder { // extiende la clase CarroBuilder

    @Override
    public String ConstruirPiezas(ServicioFactory piezas) { // sobreescribe el metodo heredado
        ServicioPiezas servicio = piezas.CrearPiezas(1); // crea las piezas utilizando el metodo de la intefaz
        return servicio.Ensamblado();  // retorna las piezas ensambladas
    }

    @Override
    public void builmotor() { // sobreescribe el metodo heredado
        Carro.setmotor(ConstruirPiezas(new MotorConcreto())); // setea el valor del motor creado
    }

    @Override
    public void builchasis() { // sobreescribe el metodo heredado
        Carro.setcarroceria(ConstruirPiezas(new ChasisConcreto())); // setea el valor del chasis creado

    }

    @Override
    public void builruedas() { // sobreescribe el metodo heredado
        Carro.setruedas(ConstruirPiezas(new RuedaConcreta())); // setea el valor de las ruedas creadas

    }



}
