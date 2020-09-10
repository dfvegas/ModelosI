package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */
// agrega productos para la venta
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import Component.ProductoAbstracto;

public class Salida {

    private long ordenI; // atributo privado de tipo long
    private String Cliente; // atributo privado de tipo String
    //private Calendar fecha;
    //private List productos = new ArrayList();

    private List< ProductoAbstracto> productos = new ArrayList<ProductoAbstracto>(); // atributo privado de tipo List

    public Salida(long orden, String cliente) { // constructor de clase
        super();
        this.ordenI = orden;
        this.Cliente = cliente;
    }

    public long getorden() { // metodo get del atributo orden

        return ordenI; // retorna ordenI

    }

    public void setorden(long orden) { // metodo set del atributo orden

        this.ordenI = orden; // da el valor de orden al atributo ordenI
    }

    public String getcliente() { // metodo get del atributo cliente
        return Cliente; // retorna Cliente
    }

    public void setcliente(String cliente) { // metodo set del atributo cliente
        this.Cliente = cliente; // da el valor de cliente al atributo Cliente
    }

    public List getproductos() { // metodo get del atributo productos

        return productos; // retorna productos
    }

    public void setproductos(List productos) { // metodo set del atributo productos

        this.productos = productos; // da el valor de productos al atributo productos
    }

    public double getprecio() { // metodo get del atributo precio
        double pres = 0; // inicializa la variable pres con el valor de 0
        for (ProductoAbstracto sum : productos) { // recorre la lista de productos
            pres += sum.getprecio(); // suma el precio de todos los prodcutos
        }
        return pres; // retornar pres
    }

    public void adicionProductos(ProductoAbstracto produ) { // metodo para adicionar producto a la lista

        productos.add(produ); // agrega un producto a la lista 
    }

    public void eliminarProductos(ProductoAbstracto produ) { // metodo para eliminar producto de la lista

        productos.add(produ); // elimina un producto de la lista 
    }

    public void imprimir() { // metodo para imprimir en pantalla
        NumberFormat formato = new DecimalFormat("####.00"); // intancia de la clase NumberFormat
        System.out.println("\n====================================\nOrden........" + ordenI); // imprime en pantalla el número de la orden
        System.out.println("Cliente..." + Cliente); // imprime en pantalla el nombre del cliente que hizo el pedido
        System.out.println("Productos..........."); // imprime en pantalla
        for (ProductoAbstracto sum : productos) { // recorre la lista de productos
            System.out.println(sum.getnombre() + "......." 
                    + formato.format(sum.getprecio())); // imprime en pantalla cada uno de los productos correspondientes al tipo de orden que se hizo y sus precio por medio del metodo getprecio de la clase ProductosCompuestos
        };
        System.out.println();
        System.out.println("Total Compra   :" + formato.format(getprecio())); // por medio del metodo getprecio de la clase salida imprime el costo total de los productos
    }

}// fin lista
