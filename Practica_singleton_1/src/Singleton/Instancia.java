package Singleton;

/**
 *
 * @author jorge malaver
 */
public class Instancia {

    private static Instancia inst; // referencia de la clase Instancia
    private String valor; // atributo de tipo String

    private Instancia() { // constructor privado de clase

    }

    public static Instancia getInstancia() { // metodo publico estatico para crear objeto de tipo Instancia
        if (inst == null) {
            inst = new Instancia(); // crea objeto de tipo Instancia
        }
        return inst;
    }

    public void inst(String mensaje) { // metodo para imprimir en pantalla

        System.out.println(mensaje);
    }

    public void setvalor(String mensa) { // metodo set del atributo valor
        valor = mensa;
    }

    public String getvalor() { // metodo get del atributo valor
        return valor;
    }
}
