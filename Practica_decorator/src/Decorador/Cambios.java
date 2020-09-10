package Decorador;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import clase_base.*;

public class Cambios extends Decorador_bicicleta { // extiende la clase abstracta para adicionar los cambios al objeto sencillo

    private Bicicletas bicicleta;

    public Cambios(Bicicletas bici) {
        this.bicicleta = bici;

    }

    public String getDescripcion() { // adiciona cambios al objeto bicicleta sensillo

        return bicicleta.getDescripcion() + "+ CAMBIOS SHIMANO";
    }
}
