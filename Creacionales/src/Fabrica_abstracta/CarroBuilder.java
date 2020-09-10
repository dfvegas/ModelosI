
package Fabrica_abstracta;

import Productos.carro;

/**
 *
 * @author jorge malaver
 */

public abstract class CarroBuilder {
    
    protected carro Carro; //referencia de la clase carro
    
    public carro getcarro(){ //metodo get del objeto tipo Carro
     
        return Carro;
    }
    
    public void ConstruirCamion(){ // metodo que crea un objeto de tipo carro
        Carro =new carro(); // guarda una instancia de la clase carro
    }
    
    public abstract String ConstruirPiezas(ServicioFactory piezas);
    public abstract void builmotor(); // metodo abstracto para construir motor
    public abstract void builchasis(); // metodo abstracto para construir chasis
    public abstract void builruedas(); // metodo abstracto para construir ruedas
}
