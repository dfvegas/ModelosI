/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory;

import Fabrica_abstracta.ServicioFactory;
import Fabrica_abstracta.ServicioTransporte;
import Fabrica_concreta.AcuaticoConcreto;
import Fabrica_concreta.AereoConcreto;
import Fabrica_concreta.TerrestreConcreto;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Abstract_factory {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner (System.in);
    public static int op;
    public static void main(String[] args) {
        do{
            op=menu();//pegunta por el periodo elegido
            switch(op){
                case 1:
                    Transporte(new TerrestreConcreto());//llamado al metodo Carro o moto
                    break; //se le pasa una factoria concreta
                case 2:
                    Transporte(new AereoConcreto());//llamado al metodo Avion
                    break;
                case 3:
                    Transporte(new AcuaticoConcreto());
                    break;
                case 4:
                    System.out.println("Cerrando Programa");
                    System.exit(0);
                 default :
                    System.out.println("Opcion invalida");
            }//cierra switchn\n
            //System.out.println("\n\n");
        }while(op!=4);
     
       
       
     }
    
    public static void Transporte(ServicioFactory Trans){//Esta funcion llama a los diferentes menus
        int opc = 0;
        switch (op) {
            case 1:
                opc=menuTerrestre();
                break;
            case 2:
                opc=menuAereo();
                break;
            case 3:
                opc=menuAcuatico();
                break;
            default:
                System.out.println("Opcion invalida");
        }
        ServicioTransporte servicio= Trans.CrearTrans(opc);//Transporte que es una referencia a la intefaz
        servicio.Ensamblado();//ejecuta la fabrica de producto concreto seleccionada1
        servicio.Pintado();
        servicio.Prueba();
        
    }//fin metodo Periodo
    
    public static int menu() {
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Crear transporte terrestre. \n"
                + "2.   Crear transporte aereo. \n"
                + "3.   Crear transporte acuatico. \n"
                + "4.   Cerrar programa.\n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }
    public static int  menuTerrestre(){
        System.out.println(
                "\nEscoja el vehiculo que desea\n"
                + "1.   Crear Automovil. \n"
                + "2.   Crear Moto. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }
    public static int  menuAereo(){
        System.out.println(
                "\nEscoja el vehiculo que desea\n"
                + "1.   Crear Avion. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }
    public static int  menuAcuatico(){
        System.out.println(
                "\nEscoja el vehiculo que desea\n"
                + "1.   Crear Yate. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }
}
