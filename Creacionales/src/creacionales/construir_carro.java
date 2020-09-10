package creacionales;

/**
 *
 * @author jorge malaver
 */
import Productos.*; 
import Fabrica_abstracta.CarroBuilder;

public class construir_carro {
    private CarroBuilder nuevo; // referencia de la clase CarroBuilder

    public void setcarroBuilder(CarroBuilder op) { // metodo set del objeto

        nuevo = op;
    }

    public carro getcarro() { // metodo get del objeto
        return nuevo.getcarro();
    }

    public void fabrica_camion() { // metodo para hacer la creacion del carro
        nuevo.ConstruirCamion(); // ejecuta el metodo ConstruirCamion
        nuevo.builchasis(); //ejecuta el metodo buildchasis
        nuevo.builmotor(); //ejecuta el metodo buildmotor
        nuevo.builruedas(); //ejecuta el metodo buildruedas
    }

}
