
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Productos.*; //importa todo del paquete Productos
public abstract class CamionBuilder {
    
    protected camion Camion; //referencia de la clase camion
    
    public camion getcamion(){ //metodo get del objeto tipo camion
     
        return Camion;
    }
    
    public void ConstruirCamion(){ // metodo que crea un objeto de tipo camion
        Camion =new camion(); // guarda una instancia de la clase camion
    }
    
    public abstract void builmotor(); // metodo abstracto para construir motor
    public abstract void builcarroceria(); // metodo abstracto para construir carroceria
    public abstract void builruedas(); // metodo abstracto para construir ruedas
}
