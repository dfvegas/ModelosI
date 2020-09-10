package Figuras;

/**
 *
 * @author jorge malaver
 */
import Interface.Figuras_geometricas;

public class Rectangulo implements Figuras_geometricas {

    private String Nombre; // atriburo Nombre
    private int pos_x, pos_y; // atributos pos_x y pos_y

    public Rectangulo() { // constructor de clase
    }

    public void setNombre(String n) { // metodo set del atributo nombre
        this.Nombre = n;
    }

    public String getNombre() { // metodo get del atributo nombre
        return Nombre;
    }

    public void tamaño(int x, int y) { // metodo para dar valores a los atributos pos_x y pos_y
        pos_x = x;
        pos_y = y;

    }

    public void getposicion() { // metodo get para obtener las caracteristicas del rectangulo
        System.out.println("Altura del rectangulo: " + this.pos_y);
        System.out.println("Ancho del rectangulo: " + this.pos_x);
    }

    public Figuras_geometricas clonar() { // metodo para clonar el rectangulo

        Figuras_geometricas geometrica = new Rectangulo(); // referencia de clase Rectangulo
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }
}
