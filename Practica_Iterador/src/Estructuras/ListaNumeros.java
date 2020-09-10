
package Estructuras;

/**
 *
 * @author jorge malaver
 */
import IteradorConcreto.ListaNumIterador;
public class ListaNumeros {
    //atributos para manejar la lista y la posicion
    private int enteros[];
    private int pos;
    // constructor que asocia la instancia y el vlor inicial de la posicion
    public ListaNumeros(){
        enteros = new int[10];
        pos=0;
    }
    // agrega numeros al arreglo
    public void agregar(int i){
        
        enteros[pos++] =i;
      }
    // crea un iterador con la informacion que tiene la estructura
    // crea un crea un metodo recorrer que devuelve un objeto de tipo listsnumitrrador
    public ListaNumIterador recorrer(){
       
        return new ListaNumIterador(enteros);//devuelve una nueva instancia y recibe como parametro
        // el arreglo
    }
}
