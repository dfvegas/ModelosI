/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conserje.Conserje;
import java.util.Scanner;
import originator.Originator;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre para guardar la partida");
        String nombre = sc.nextLine();
        int progreso = 10;
        // Crear el objeto originador/creador
        Originator creador = new Originator(nombre, progreso);
        // Crear el objeto gestor/vigilante del Memento
        Conserje vigilante = new Conserje();
        // Crear el Memento y asociarlo al objeto gestor
        vigilante.setMemento(creador.createMemento());
        // Mostrar los datos del objeto
        System.out.println("Partida guardada: [" + creador.getNombre() + " " + creador.getProgreso() + "%]");
        // Modificar los datos del objeto
        creador.setNombre(nombre);
        creador.setProgreso(progreso + 10);
        // Mostrar los datos del objeto
        System.out.println("El jugador " + creador.getNombre() + " ha perdido su vida en el " + creador.getProgreso()
                + "%" + " del progreso, presione enter para regresar al último progreso guardado");
        do {
            nombre = sc.nextLine();
        } while (!nombre.equals(""));
        // Restaurar los datos del objeto
        creador.setMemento(vigilante.getMemento());
        // Mostrar los datos del objeto
        System.out.println("Se regresó a la partida guardada como: [" + creador.getNombre() + " " + creador.getProgreso() + "%]");
    }

}
