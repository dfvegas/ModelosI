/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author david
 */
public interface Figuras_circulo {
 
    public void setNombre(String n); // metodo set tipo abstracto de nombre
    public String getNombre(); // metodo get tipo abstracto de nombre
    public void tamaño(int r); // metodo para dar valores a los atributos
    public void getposicion(); // metodo get para obtener las caracteristicas del circulo
    public Figuras_circulo clonar(); // metodo para clonar el circulo
}
