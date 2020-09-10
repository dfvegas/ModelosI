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
import Fabrica.fabrica;
import java.util.Scanner;
import Abstracto.Comun;
public class Practica_fabrica {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in); //crea objeto de tipo Scanner
        Comun Micomun; //referencia la clase Comun
        fabrica Mifabrica; // referencia la clase fabrica

        System.out.println("Digite el almacen seleccionado:   "); // muestra en pantalla el mensaje
        String  seleccion=sc.nextLine(); // crea una variable y le agrega el valor que el usuario ingrese
        Mifabrica = new fabrica(seleccion); //llama el metodo fabrica para guardar el dato ingresado por el usuario
        Micomun =  Mifabrica.crear_selecion(); //con el metodo crear_seleccion sobreescribe el metodo de la clase Comun
        String salir="Seleccione el almacen....:" + Micomun.Escojer(); //retorna el dato del metodo ya sobreescrito
        
        System.out.println(salir);
        
    }
    
}
