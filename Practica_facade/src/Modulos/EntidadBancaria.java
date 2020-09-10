
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;
public class EntidadBancaria { // subsistema usado por la clase Facade para analizar el cliente
    
    public boolean Tienefondos(cliente x){ // metodo para analizar los fondos del cliente que desea el prestamo
     
        System.out.println("La cuenta tiene fondos");
        return true;
    }
}
