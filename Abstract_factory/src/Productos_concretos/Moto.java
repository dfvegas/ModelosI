/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos_concretos;

import Fabrica_abstracta.ServicioTransporte;

/**
 *
 * @author david
 */
public class Moto implements ServicioTransporte {//Implementa a servicio transporte sobre escribiendo sus métodos

    public void Ensamblado() {
        try {
            Thread.sleep(2000);
            System.out.println("La moto está siendo ensamblada");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void Pintado() {
        try {
            Thread.sleep(2000);
            System.out.println("La moto está siendo pintada");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void Prueba() {
        try {
            Thread.sleep(2000);
            System.out.println("La moto fue puesta a prueba y está lista para su uso\n\n");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

}
