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
import Implementador2.*;

public abstract class Abstract_prenda {//

    protected Seleccion_color tono; //referencia hacia  objeto implementador
    protected Seleccion_talla tamaño;

    public Abstract_prenda(Seleccion_color tono, Seleccion_talla tamaño) {//referencia hacia la implementacion

        this.tono = tono;
        this.tamaño = tamaño;
    }

    public abstract void prenda();//metodo a implementar n las clases concretas

}
