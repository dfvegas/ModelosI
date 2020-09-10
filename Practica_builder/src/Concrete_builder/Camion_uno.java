/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
public class Camion_uno extends CamionBuilder{
    
   @Override // notacion para indicar que el metodo es sobreescrito de una clase abstracta
   public void builmotor(){ // sobreescritura del metodo abstracto de la clase heredada
       Camion.setmotor("Motor cummis"); // setea valores al atributo motor del objeto camion
   }
   
   @Override // notacion para indicar que el metodo es sobreescrito de una clase abstracta
   public void builcarroceria(){ // sobreescritura del metodo abstracto de la clase heredada
    
       Camion.setcarroceria("De lujo"); // setea valores al atributo carroceria del objeto camion
   }
   
   @Override // notacion para indicar que el metodo es sobreescrito de una clase abstracta
   public void builruedas(){ // sobreescritura del metodo abstracto de la clase heredada
       
       Camion.setruedas("Gan tamaño"); // setea valores al atributo ruedas del objeto camion
   }
}
