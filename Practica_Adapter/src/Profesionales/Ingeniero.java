/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;

/**
 *
 * @author jorge malaver
 */
public class Ingeniero extends Target_Profesionales {
    
    public Ingeniero(){ // constructor de la clase Ingeniero
        super();
        System.out.println("Contruccion de obras civiles"); // imprime en pantalla
    }
    
    @Override
    public void Leer_planos(){ // metodo void para describir la funcion del profesional
        System.out.println("Planos de todo tipo"); // imprime en pantalla
    }
    
    @Override
    public void contratos(){ // metodo void para describir la funcion del profesional
     System.out.println("Elaborar contratos construccion"); // imprime en pantalla
    }
    
    @Override
    public void supervision(){ // metodo void para describir la funcion del profesional
        System.out.println("Auditoria y control"); // imprime en pantalla
    }
}
