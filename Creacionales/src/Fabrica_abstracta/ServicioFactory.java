/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_abstracta;

/**
 *
 * @author david & miguel
 */
// factoria Abstracta, contiene el metodo de instanciacion
public interface ServicioFactory {
    public ServicioPiezas CrearPiezas(int opc);//crearPieza es el metodo de instanciacion
    //devuelve el metodo ServicioPiezas
}
