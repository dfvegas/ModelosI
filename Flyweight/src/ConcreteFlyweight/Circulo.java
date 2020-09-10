/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcreteFlyweight;

import Flyweight.Figura;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class Circulo implements Figura{ // implementa la intarfaz Figura
    private String color; // atributo tipo String
    private int x; // atributo tipo int
    private int y; // atributo tipo int
    private int radio; // atributo tipo int
    
    public Circulo(String color){ // constructor de clase
        this.color=color;
    }

    public void setX(int x) { // metodo set de atributo x
        this.x = x;
    }

    public void setY(int y) { // metodo set de atributo y
        this.y = y;
    }

    public void setRadio(int radio) { // metodo set de atributo radio
        this.radio = radio;
    }
    
    @Override
    public void dibujar(JTextArea etiqueta) { // metodo sobreescrito
        etiqueta.setText(etiqueta.getText()+ "\nCIRCULO: Color = " + color + "; Posición x = " + x +
                "; Posición y = " + y + "; Radio = " + radio); // envia mensaje al crear la figura
    }
    
}
