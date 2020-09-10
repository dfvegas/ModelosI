
package Facade;

/**
 *
 * @author jorge malaver
 */
import Modulos.*;
import Cliente.*;
public class FacadePrestamo {
 
    public boolean sinreporte(cliente x){ // metodo para analizar el estado del cliente que desea un prestamo
        
        // utiliza instancias de los subsistemas para que  se encarguen del analisis del cliente para poder darle el prestamo
        if(new EntidadBancaria().Tienefondos(x) && (new Estudiocredito().historialcredito(x)) && new Solicitudprestamo().poseeprestamo(x)){
            
          System.out.println("Se le otorgo el prestamo"); // si el cliente cumple todos los requisitos, le otorgan el prestamo
          return true;
    }
        else{
            
            System.out.println("No Se le otorgo el prestamo"); // si el cliente no cumple todos los requisitos, no le otorgan el prestamos
          return false;
        }
    
    }
}
