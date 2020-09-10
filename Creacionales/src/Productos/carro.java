/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

//import luces.Luces;

/**
 *
 * @author jorge malaver
 */
public class carro {

    private String motor = ""; //atributo de tipo String
    private String chasis = ""; //atributo de tipo String
    private String ruedas = ""; //atributo de tipo String

    public void setmotor(String motor) { // metodo set del atributo motor
        this.motor = motor;
    }

    public void setcarroceria(String carroceria) { // metodo set del atributo chasis
        this.chasis = carroceria;
    }

    public void setruedas(String ruedas) { // metodo set del atributo ruedas

        this.ruedas = ruedas;
    }

    public String getMotor() { // metodo get del atributo motor
        return motor;
    }

    public String getCarroceria() { // metodo get del atributo chasis
        return chasis;
    }

    public String getRuedas() { // metodo get del atributo ruedas
        return ruedas;
    }

}
