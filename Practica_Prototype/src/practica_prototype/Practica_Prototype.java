package practica_prototype;

/**
 *
 * @author jorge malaver
 */
import Figuras.Circulo;
import Figuras.Rectangulo;
import Interface.Figuras_circulo;
import java.util.Scanner;
import Interface.Figuras_geometricas;

public class Practica_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int op, posx, posy, radio;
        Scanner sc = new Scanner(System.in); // instancia de tipo Scanner 

        // menu de opciones
        System.out.println("escoja la figura que desea clonar.....");
        System.out.println("1. Rectangulo");
        System.out.println("2. Circulo");
        op = sc.nextInt();

        if (op == 1) {
            Rectangulo rectangulo = new Rectangulo(); // referencia de la clase Rectangulo
            Figuras_geometricas geometrica = null;
            rectangulo.setNombre("Rectangulo");
            rectangulo.tamaño(18, 25);

            System.out.println("......ORIGINAL.....");
            System.out.println("Figura Geometrica Seleccionada: " + rectangulo.getNombre());
            System.out.println("......TAMAÑO ORIGINAL......");
            rectangulo.getposicion(); // ejecuta el metodo getposicion de la clase Rectangulo
            geometrica = rectangulo.clonar(); // ejecuta el metodo clonar de la clase Rectangulo
            geometrica.setNombre("La figura clonada fue: " + geometrica.getNombre()); // setea el nombre de la figura selecionada
            System.out.print("Digite el nuevo alto: ");
            posy = sc.nextInt();
            System.out.print("Digite el nuevo ancho: ");
            posx = sc.nextInt();
            geometrica.tamaño(posx, posy); // ejecuta el metodo tamaño de la clase Figuras_geometricas
            
            // figura clonada
            System.out.println("\n....Esta es la figura clonada...");
            System.out.println(geometrica.getNombre()); // pide el nombre de la figura
            System.out.println("...Estas son las caracteristicas de la figura clonada...");
            geometrica.getposicion(); // ejecuta el metodo getposicion de la clese Figuras_geometricas
        } else if (op==2){
            Circulo circulo = new Circulo(); // referencia de la clase circulo
            Figuras_circulo cir = null;
            circulo.setNombre("circulo");
            circulo.tamaño(5);

            System.out.println("......ORIGINAL.....");
            System.out.println("Figura Geometrica: " + circulo.getNombre());
            System.out.println("......TAMAÑO ORIGINAL DE LA FIGURA.....");
            circulo.getposicion(); // ejecuta el metodo getposicion de la clase Circulo
            cir = circulo.clonar(); // ejecuta el metodo clonar de la clase Circulo
            cir.setNombre( "La figura clonada fue: " + cir.getNombre()); // setea el nombre de la figura selecionada
            System.out.print("Digite el nuevo radio: ");
            radio = sc.nextInt();
            cir.tamaño(radio); // ejecuta el metodo tamaño de la clase Figuras_circulo
            
            // figura clonada
            System.out.println("\n...Esta es la figura clonada...");
            System.out.println(cir.getNombre()); // pide el nombre de la figura
            System.out.println("...Estas son las caracteristicas de la figura clonada...");
            cir.getposicion(); // ejecuta el metodo getposicion de la clese Figuras_geometricas
        }
    }

}
