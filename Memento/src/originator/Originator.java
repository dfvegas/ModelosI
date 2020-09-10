/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package originator;

import memento.Memento;

/**
 *
 * @author USER
 */
public class Originator {

    private String nombre;
    private int progreso;

    public Originator(String nombre, int progreso) {
        this.nombre = nombre;
        this.progreso = progreso;
    }

    public void setMemento(Memento m) {
        this.nombre = m.getNombre();
        this.progreso = m.getProgreso();
    }

    public Memento createMemento() {
        return new Memento(nombre, progreso);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }

}
