package practica_singleton_1;

/**
 *
 * @author jorge malaver
 */
import Singleton.Instancia;

public class Practica_singleton_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic  
        Instancia inst = Instancia.getInstancia(); // crea un objeto a traves del metodo getInstancia de la clase Instancia
        // Instancia inst_1 = Instancia.getInstancia(); // no se debe crear otro objeto de esta misma
 
        inst.inst("HOLA MUNDO"); // imprime en pantalla el mensaje a traves del metodo inst
        
        inst.setvalor("VERIFICACION SINGLETON"); // da el valor asignado a traves del metodo set
        // System.out.println(inst_1.getvalor());

    }
}
