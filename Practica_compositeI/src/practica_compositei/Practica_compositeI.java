package practica_compositei;

/**
 *
 * @author jorge malaver
 */
import ProductosConcretos.*;

public class Practica_compositeI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //productos simples

        ProductoSimple ram4 = new ProductoSimple("Memoria 4GB", 23000, "Kisnton"); // crea objeto de la clase ProdcutoSimple llamado ram4 con sus respectivas caracteristicas de nombre, precio y marca
        ProductoSimple ram8 = new ProductoSimple("Memoria 8GB", 46000, "Kisnton"); // crea objeto de la clase ProdcutoSimple llamado ram8 con sus respectivas caracteristicas de nombre, precio y marca

        ProductoSimple disco1 = new ProductoSimple("Disco duro 512MG", 520000, "Kisnton"); // crea objeto de la clase ProdcutoSimple llamado disco1 con sus respectivas caracteristicas de nombre, precio y marca
        ProductoSimple disco2 = new ProductoSimple("Disco diro 1TB", 680000, "Kisnton"); // crea objeto de la clase ProdcutoSimple llamado disco2 con sus respectivas caracteristicas de nombre, precio y marca

        ProductoSimple intel = new ProductoSimple("Procesador Intel 17", 300000, "Intel"); // crea objeto de la clase ProdcutoSimple llamado intel con sus respectivas caracteristicas de nombre, precio y marca

        // productos compuestos
        // co
        ProductosCompuestos Compersonal = new ProductosCompuestos("VALOR COMPUTADOR"); // crea objeto de la clase ProductosCopuestos llamado Compersonal
        ProductosCompuestos Compoficina = new ProductosCompuestos("VALOR COMPUTADOR"); // crea objeto de la clase ProductosCopuestos llamado Compoficina

        // computdora personal de ram 4 y disco de 512  y procesador Intel(paquetes)
        Compersonal.SumProductos(ram4); // por medio del metodo SumProductos agrega el objeto ram4 a la lista de productos del ProductoCompuesto compersonal
        Compersonal.SumProductos(disco1); // por medio del metodo SumProductos agrega el objeto disco1 a la lista de productos del ProductoCompuesto compersonal
        Compersonal.SumProductos(intel); // por medio del metodo SumProductos agrega el objeto intel a la lista de productos del ProductoCompuesto compersonal
 
        Compoficina.SumProductos(ram8); // por medio del metodo SumProductos agrega el objeto ram8 a la lista de productos del ProductoCompuesto compoficina
        Compoficina.SumProductos(disco2); // por medio del metodo SumProductos agrega el objeto disco2 a la lista de productos del ProductoCompuesto compoficina
        Compoficina.SumProductos(intel); // por medio del metodo SumProductos agrega el objeto intel a la lista de productos del ProductoCompuesto compoficina

        // paquete compuesto varios simples
        ProductosCompuestos Compcompleto = new ProductosCompuestos("VALOR COMPUTADOR"); // crea objeto de la clase ProductosCopuestos llamado Compcompleto
        Compcompleto.SumProductos(Compersonal); // por medio del metodo SumProductos agrega el objeto Compersonal a la lista de productos del ProductoCompuesto Comcompleto
        Compersonal.SumProductos(Compoficina); // por medio del metodo SumProductos agrega el objeto Compoficina a la lista de productos del ProductoCompuesto Compersonal

        Salida sal = new Salida(1, "Sonia Jaramillo"); // crea objeto de la clase Salida llamado sal con sus respectivas caracteristicas de numero de orden y cliente
        sal.adicionProductos(ram4); // por medio del metodo adicionProductos de la clase Salida agrega el producto ram4 a la lista 
        sal.adicionProductos(disco1); // por medio del metodo adicionProductos de la clase Salida agrega el producto disco1 a la lista 
        sal.adicionProductos(intel); // por medio del metodo adicionProductos de la clase Salida agrega el producto intel a la lista 

        sal.imprimir(); // llama al metodo imprimir de la clase Salida

        Salida sal1 = new Salida(2, "Universidad Distrtital"); // crea objeto de la clase Salida llamado sal con sus respectivas caracteristicas de numero de orden y cliente
        sal1.adicionProductos(ram8); // por medio del metodo adicionProductos de la clase Salida agrega el producto ram8 a la lista 
        sal1.adicionProductos(disco2); // por medio del metodo adicionProductos de la clase Salida agrega el producto disco2 a la lista 
        sal1.adicionProductos(intel); // por medio del metodo adicionProductos de la clase Salida agrega el producto intel a la lista 

        sal1.imprimir(); // llama al metodo imprimir de la clase Salida

    }

}
