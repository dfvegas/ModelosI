
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*; // importa todo del paquete Abstraccion

public class Camion_dos extends CamionBuilder{
   
     @Override // notacion para indicar que el metodo es sobreescrito de una clase abstracta
   public void builmotor(){ // sobreescritura del metodo abstracto de la clase heredada
       Camion.setmotor("Motor normal"); // setea valores al atributo motor del objeto camion
   }
   
   @Override // notacion para indicar que el metodo es sobreescrito de una clase abstracta
   public void builcarroceria(){ // sobreescritura del metodo abstracto de la clase heredada
    
       Camion.setcarroceria("corriente"); // setea valores al atributo carroceria del objeto camion
   }
   
   @Override // notacion para indicar que el metodo es sobreescrito de una clase abstracta
   public void builruedas(){ // sobreescritura del metodo abstracto de la clase heredada
       
       Camion.setruedas("medianas"); // setea valores al atributo ruedas del objeto camion
   }
    
    
}
