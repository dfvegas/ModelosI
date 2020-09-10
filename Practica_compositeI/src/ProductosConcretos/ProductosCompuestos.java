package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */
// agrupacion de productos abstractos (paquete)
import Component.ProductoAbstracto;
import java.util.ArrayList;
import java.util.List;

public class ProductosCompuestos extends ProductoAbstracto { // hereda la clase abstracta ProductoAbstracto

    double precio; // atributo tipo double
    private List< ProductoAbstracto> productos = new ArrayList<ProductoAbstracto>(); // atributo privado tipo List

    public ProductosCompuestos(String nom) { // constructor de clase
        super(nom, 0);

    }

    @Override
    public double getprecio() { // sobreescritura del metodo get del atributo precio heredado
        double pres = 0; // inicializa la variable pres con valor 0
        for (ProductoAbstracto sum : productos) { // recorre la lista creada con los productos
            pres += sum.getprecio(); // suma el valor de todos los productos que estan en la lista
        }
        return pres; // retorna el valor total de la suma los productos
    }

    @Override
    public void setprecio(double pres) { // sobreescritura del metodo set del atributo precio heredado
        throw new UnsupportedOperationException();
        // no permite establecer un precio (suma de simples y/o compuestos)
    }

    public void SumProductos(ProductoAbstracto producto) { // metodo para agregar productos a la lista

        this.productos.add(producto); // agrega un nuevo producto a la lista
    }

    public boolean quitarProductos(ProductoAbstracto producto) { // metodo para borrar productos de la lista

        return this.productos.remove(producto); // borra un producto de la lista
    }
}// fin de la clase
