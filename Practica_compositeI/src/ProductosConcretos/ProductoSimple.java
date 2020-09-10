package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */
import Component.ProductoAbstracto;

public class ProductoSimple extends ProductoAbstracto { // hereda la clase abstracta ProductoAbstracto

    String marca; // atributo tipo String
    double precio; // atributo tipo String

    public ProductoSimple(String nom, double pres, String marca) { // contructor de clase
        super(nom, pres);
        this.marca = marca;
        this.precio = pres;
    }

    @Override
    public double getprecio() { // metodo get del atributo precio, heredado de la abstrccion
        return precio; // retorna precio
    }

    @Override
    public void setprecio(double pres) { // metodo set del atributo precio, heredado de la abstrccion

        this.precio = pres; // da el valor pres a precio
    }

    public String getMarca() { // metodo get del atributo marca
        return marca; // retorna marca
    }

    public void setMarca(String mar) { // metodo set del atributo marca

        this.marca = mar; // da el valor mar a marca
    }
} // fin clase ProductoSimple se adiciona un nuevo atributo llamado marca
