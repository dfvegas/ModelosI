
package Interface;

/**
 *
 * @author jorge malaver
 */
public interface Figuras_geometricas {
    
    public void setNombre(String n); // metodo set tipo abstracto de nombre
    public String getNombre(); // metodo get tipo abstracto de nombre
    public void tamaño(int x, int y); // metodo para dar valores a los atributos
    public void getposicion(); // metodo get para obtener las caracteristicas del rectangulo
    public Figuras_geometricas clonar(); // metodo para clonar el rectangulo
}
