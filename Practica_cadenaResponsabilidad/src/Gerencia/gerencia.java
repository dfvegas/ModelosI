
package Gerencia;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;
public class gerencia implements Manejo_principal{
    
    private  final int TipoD = 3;//el atributo contiene el identificador si la
    //peticion debe ser respondida por este dpto
    
    public gerencia(){} // no se necesita referencia a la interfaz porque esta clase es la ultima en la cadena de responsabilidad
    
    @Override
    public void getManejo(int Tipo_Dpto){ // metodo sobreescrito para responder la solicitud del cliente
       
        System.out.println("......LA PETICION DEBE SER RESPONDIDA SOLAMENTE POR LA GERENCIA....."); // imprime en pantalla
    }
}
