
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;
public class Solicitudprestamo { // subsistema usado por la clase Facade para analizar el cliente
    
    public boolean poseeprestamo(cliente x){ // metodo para analizar el historial del cliente que desea el prestamo
      
        System.out.println("El cliente ya posee prestamos");
        
        return true;
    }
}
