/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_iterador;

/**
 *
 * @author jorge malaver
 */

import Estructuras.*;
import Iterador.iterador;
public class Practica_Iterador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // crea tres objetos
        ListaNumeros obj = new ListaNumeros();
        ListaPalabras obj1 = new ListaPalabras();
        iterador avanzar;
        
        obj.agregar(7);
        obj.agregar(5);
        obj.agregar(6);
        obj.agregar(9);
        obj.agregar(1);
           
        obj1.agregarpal("Kelly");
        obj1.agregarpal("Sonia");
        obj1.agregarpal("luis");
        obj1.agregarpal("hola");
        obj1.agregarpal("mundo");
        
        avanzar =obj.recorrer();//se le asigna la clase que devuelve el metodo iterador
        // de la lista numeros
        while(avanzar.tienesig()){
            
            int nume = (int) avanzar.sig();// cast para convertir a entero y devuelve un objeto porque el metodoc sig 
            // devuelve un objeto
            System.out.println(nume);
        }
        
        System.out.println();
        
        avanzar = obj1.pala();
        while(avanzar.tienesig()){
            
            String palabra = (String) avanzar.sig();
            System.out.println(palabra);
        }
    }
    
}
