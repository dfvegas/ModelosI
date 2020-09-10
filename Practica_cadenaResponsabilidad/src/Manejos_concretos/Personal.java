
package Manejos_concretos;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;
public class Personal implements Manejo_principal{
 
    private  final int TipoD = 2;//el atributo contiene el identificador si la
    //peticion debe ser respondida por este dpto
    private Manejo_principal suceso;//parametor del sucesor en la cadena de responsabilidad
    
    public Personal(Manejo_principal s){// objeto que implemena la inteface
        this.suceso =s;// al atributo de la asigna la interface
    }
    
    @Override
    public void getManejo(int Tipo_Dpto){  // metodo sobreescrito para responder la solicitud del cliente
     
     if(Tipo_Dpto==TipoD) {
         System.out.println("......EL PEDIDO DEBE SER CONTESTADO POR PERSONAL....."); // imprime en pantalla
     }  
     else{
         suceso.getManejo(Tipo_Dpto);//llama el metodo del sucesor enciando el valor que ha 
         //solicitado el cliente
     }
    }
    
}
