/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightFactory;

import ConcreteFlyweight.Circulo;
import Flyweight.Figura;
import java.util.HashMap;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class FabricaFiguras {
    private static final HashMap<String, Figura> MapaCirculo = new HashMap(); // crea un HashMap para guardar los objetos creados y no repetirlos
    
    public static Figura getCirculo(String color, JTextArea etiqueta){ // metodo get para crear la figura
        Circulo circulo = (Circulo)MapaCirculo.get(color); // referencia de la clase circulo para recorrer el mapa y ver si ya fue creado
        
        if (circulo==null){ // si no ha sido creado, lo hace 
            circulo = new Circulo(color); // crea una intancia de la clase circulo
            MapaCirculo.put(color, circulo); // asigna al circulo un lugar en el mapa
            etiqueta.setText(etiqueta.getText()+ "\nCreando circulo de color: " + color); // envia mensaje al crear el circulo
            return circulo;
        }
        return circulo; // si ya ha sido creado, simplemente lo retorna 
    }
}
