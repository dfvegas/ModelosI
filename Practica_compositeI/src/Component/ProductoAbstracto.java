/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

/**
 *
 * @author jorge malaver
 */
public abstract class ProductoAbstracto { // clase abstracta con los atributos generales de los componentes
    
    String nombre; // atributo tipo String
    double precio; // atributo tipo double
    
    public ProductoAbstracto(String nom, double pres){ // constructor de clase 
        
        super();
        this.nombre=nom;
        this.precio=pres;
    }
    
    public String getnombre(){ // metodo get del atributo nombre
        
        return nombre; // retorna nombre
    }
    
    public void setnombre( String nom){ // metodo set del atributo nombre
        
        this.nombre=nom; // da el valor nom a nombre
    }
    
    public double getprecio(){ // metodo get del atributo precio
        
        return precio; // retorna precio
    }
    
    public void setprecio(double pres){ // metodo set del atributo precio
        
        this.precio=pres; // da el valor pres a precio
    }
}// fin de la clase definie las caracteristicas del producto
