/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author jorge malaver
 */
import IteradorConcreto.ListapalIterador;

public class ListaPalabras {

    //atributos para manejar la lista y la posicion
    private String pal1, pal2, pal3, pal4, pal5;
    private int pos = 0;

    // constructor que asocia la instancia y el vlor inicial de la posicion
    public ListaPalabras() {

        //pos=0;
    }

    // agrega palabras a los atributos
    public void agregarpal(String n) {

        switch (pos) {
            case 0:
                pal1 = n;
            case 1:
                pal2 = n;
            case 2:
                pal3 = n;
            case 3:
                pal4 = n;
            case 4:
                pal5 = n;
                break;
        }//fin switch

        pos++;
    }

    // crea un iterador con la informacion que tiene la estructura
    // crea un crea un metodo recorrer que devuelve un objeto de tipo listspaliterador
    public ListapalIterador pala() {

        return new ListapalIterador(pal1, pal2, pal3, pal4, pal5);
    }
}
