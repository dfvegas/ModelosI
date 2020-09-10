/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_fabrica;

/**
 *
 * @author jorge malaver
 */
import Fabrica.fabrica; //importa la clase fabrica del paquete Fabrica
import java.util.Scanner;
import Abstracto.Comun; //importa la clase Comun del paquete Abstracto
public class Practica_fabrica {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in); //Llama la clase Scanner para poder pedir un dato
        Comun Micomun; //crea variable de tipo Comun
        fabrica Mifabrica; //crea variable de tipo fabrica
        
        System.out.println("Digite el almacen seleccionado:   "); // muestra en pantalla el mensaje
        String  seleccion=sc.nextLine(); // crea una variable y le agrega el valor que el usuario ingrese
        Mifabrica = new fabrica(seleccion); //llama el metodo fabrica para guardar el dato ingresado por el usuario
        Micomun =  Mifabrica.crear_selecion(); //con el metodo crear_seleccion sobreescribe el metodo de la clase Comun
        String salir="Seleccione el almacen....:" + Micomun.Escojer(); //retorna el dato del metodo ya sobreescrito
        
        System.out.println(salir);
        
    }
    
}
