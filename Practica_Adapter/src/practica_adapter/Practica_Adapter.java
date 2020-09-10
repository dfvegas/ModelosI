
package practica_adapter;
/**
 *
 * @author jorge malaver
 */

import Profesionales.Arquitecto;
import Profesionales.Ingeniero;
//import Profesionales.Medico;
import Profesionales.MedicoAdapter;
import Profesionales.Target_Profesionales;
import java.util.Scanner;
public class Practica_Adapter {

     private static Scanner obj  =new Scanner(System.in); // crea instancia de la clase Scanner para leer datos
     private static Target_Profesionales profesionales; // referencia de la clase Target_Profesionales
   
     private static void usarprofesion(){ // metodo estatico para usar la profesion escogida
         profesionales.Leer_planos(); // ejecuta el metodo Leer_planos
         profesionales.contratos(); // ejecuta el metodo contratos
         profesionales.supervision(); // ejecuta el metodo supervision
     }
     
  
     
    public static void main(String[] args) {
        // TODO code application logic here
        
    
       int op; // variable op
       do{
           
           op = escogerOp(); //
           switch(op){
               case 1:
                profesionales = new Ingeniero(); // crea instacia de la clase Ingeniero
                usarprofesion(); // ejecuta el meodo usar profesion para describir las funciones del ingeniero
                break;
               case 2:
                   profesionales =new Arquitecto(); // crea instacia de la clase Arquitecto
                   usarprofesion(); // ejecuta el meodo usar profesion para describir las funciones del arquitecto
                   break;
               case 3:
                   profesionales = new MedicoAdapter(); // crea instacia de la clase MedicoAdapter
                   usarprofesion(); // ejecuta el meodo usar profesion para describir las funciones del medico adaptandolas a las funciones de los otros profesionales
                   break;
               case 4:
                   System.out.println("La opcion no es valida"); // imprime en pantalla 
           }
           
           
       }while(op!=4);
     }//cierra el main
   
    private static int escogerOp(){ // menu para escoger la opcion 
         System.out.print( // imprime en pantalla
         
         "Menu Opciones\n"+
         "---------------\n"+
         "1.  Fuciones Ingeniero.\n" +
         "2.  Funciones Arquitecto.\n "+
         "3.  Finciones del medico.\n "+
         "4.   Salir. \n"+
         "Selecciones opcion....."
         );
         
         return Integer.parseInt(obj.nextLine());
     } 
}// cierra la clase practica_adapter
