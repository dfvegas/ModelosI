/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import Interface.Figuras_circulo;

/**
 *
 * @author david
 */
public class Circulo implements Figuras_circulo { //implementa la interface Figuras_circulo

    private String Nombre; // atriburo Nombre
    private int pos_x; // atributos pos_x

    public Circulo() { //constructor de clase
    }

    public void setNombre(String n) { // metodo set para el atrbuto nombre
        this.Nombre = n;
    }

    public String getNombre() { // metodo get para el atrbuto nombre
        return Nombre;
    }

    public void tamaño(int x) { // metodo para dar valores al atributo pos_x
        pos_x = x;
    }

    public void getposicion() { // metodo get para obtener las caracteristicas del circulo
        System.out.println("Radio del circulo: " + this.pos_x);
        System.out.println("Area del circulo: " + (Math.PI*Math.pow(this.pos_x,2)));
    }

    public Figuras_circulo clonar() { // metodo para clonar el circulo

        Figuras_circulo circulo = new Circulo(); // referencia de la clase Circulo
        circulo.setNombre(this.Nombre);
        circulo.tamaño(this.pos_x);
        return circulo;
    }

}
