package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*; // importa todo del paquete Abstraccion
import Productos.*; // importa todo del paquete Productos
import Concrete_builder.*; // importa todo del paquete Concrete_builder
import java.util.Scanner;

public class Practica_builder {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        opc = menu();
        construir_camion obj = new construir_camion(); // guarda una instacia de la clase construir_camion en la variable
        switch (opc) {
            case 1:
                CamionBuilder obj1 = new Camion_uno(); // guarda una instacia de la clase Camion_uno en la variable
                obj.setcamionBuilder(obj1); // setea obj1 para hacer la creacion del camion
                obj.fabrica_camion(); // // ejecuta el metodo fabrica_camion de la clase construir_camion
                camion nueva = obj.getcamion(); // pide el camion creado para darle valor a la variable nueva
                System.out.println("Motor del camion creado: " + nueva.getMotor()); // muestra en pantalla el valor de motor
                System.out.println("Carroceria del camion creado: " + nueva.getCarroceria()); // muestra en pantalla el valor de carroceria
                System.out.println("Ruedas del camion creado: " + nueva.getRuedas()); // muestra en pantalla el valor de ruedas
                break;
            case 2:
                CamionBuilder obj2 = new Camion_dos(); // guarda una instacia de la clase Camion_dos en la variable
                obj.setcamionBuilder(obj2); // setea obj1 para hacer la creacion del camion
                obj.fabrica_camion(); // // ejecuta el metodo fabrica_camion de la clase construir_camion
                camion nueva2 = obj.getcamion(); // pide el camion creado para darle valor a la variable nueva
                System.out.println("Motor del camion creado: " + nueva2.getMotor()); // muestra en pantalla el valor de motor
                System.out.println("Carroceria del camion creado: " + nueva2.getCarroceria()); // muestra en pantalla el valor de carroceria
                System.out.println("Ruedas del camion creado: " + nueva2.getRuedas()); // muestra en pantalla el valor de ruedas
                break;
            default:
                System.out.println("Opcion invalida");
        }

    }

    public static int menu() {
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Crear camion de lujo. \n"
                + "2.   Crear camion normal. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }
}
