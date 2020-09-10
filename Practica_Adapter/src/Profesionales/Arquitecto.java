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
public class Arquitecto extends Target_Profesionales { // extiende la clase Target_Profesionales
    
    
    @Override
    public void Leer_planos(){ // metodo void para describir la funcion del profesional
        System.out.println("Planos de todo tipo"); // imprime en pantalla
    }
    
    @Override
    public void contratos(){ // metodo void para describir la funcion del profesional
        System.out.println("Contratos dibujantes"); // imprime en pantalla
    }
    
    @Override
    public void supervision(){ // metodo void para describir la funcion del profesional
        System.out.println("Auditoria diseño "); // imprime en pantalla
    }
}
