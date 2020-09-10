package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Productos.*; // importa todo del paquete Productos
import Abstraccion.*; // importa todo del paquete Abstraccion

public class construir_camion {

    private CamionBuilder nuevo; // referencia de la clase CamionBuilder

    public void setcamionBuilder(CamionBuilder op) { // metodo set del objeto

        nuevo = op;
    }

    public camion getcamion() { // metodo get del objeto
        return nuevo.getcamion();
    }

    public void fabrica_camion() { // metodo para hacer la creacion del camion
        nuevo.ConstruirCamion(); // ejecuta el metodo ConstruirCamion
        nuevo.builmotor(); // ejecuta el metodo builmotor
        nuevo.builcarroceria(); // ejecuta el metodo buildcarroceria
        nuevo.builruedas(); // ejecuta el motodo builruedas
    }
}
