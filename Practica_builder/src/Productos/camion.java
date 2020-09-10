/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author jorge malaver
 */
public class camion {

    private String motor = ""; //atributo de tipo String
    private String carroceria = ""; //atributo de tipo String
    private String ruedas = ""; //atributo de tipo String

    public void setmotor(String motor) { // metodo set del atributo motor
        this.motor = motor;
    }

    public void setcarroceria(String carroceria) { // metodo set del atributo carroceria
        this.carroceria = carroceria;
    }

    public void setruedas(String ruedas) { // metodo set del atributo ruedas

        this.ruedas = ruedas;
    }

    public String getMotor() {
        return motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public String getRuedas() {
        return ruedas;
    }

}
