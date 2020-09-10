/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import Implementador.Seleccion_color;
import Implementador2.Seleccion_talla;

/**
 *
 * @author jorge malaver
 */
public class Pantalon extends Abstract_prenda {
 
    
    public Pantalon(Seleccion_color tono, Seleccion_talla tamaño){
     super(tono, tamaño);   
    }
    
    @Override
    public void prenda(){
        System.out.println(".....Pantalon.....");
        tono.Seleccionar_color();
        tamaño.Seleccion_talla();
    }
}
