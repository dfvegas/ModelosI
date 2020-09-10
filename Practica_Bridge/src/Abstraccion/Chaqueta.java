/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Implementador.*;
import Implementador2.Seleccion_talla;

public class Chaqueta extends Abstract_prenda{
    
    public Chaqueta(Seleccion_color tono, Seleccion_talla tamaño){
     super(tono, tamaño);   
    }
    
    @Override
    public void prenda(){
        System.out.println("...Chaqueta....");
        tono.Seleccionar_color();
        tamaño.Seleccion_talla();
    }
}
