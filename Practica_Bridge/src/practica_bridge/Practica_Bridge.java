/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bridge;

/**
 *
 * @author jorge malaver
 */
import Implementador.*;
import Abstraccion.*;
import Implementador2.*;
import java.util.Scanner;

public class Practica_Bridge {

    public static Scanner sc = new Scanner(System.in);
    public static int op;
    public static int op2;
    public static int op3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chaqueta chaqueta;
        Buzo buzo;
        Pantalon pantalon;
        op = menuPrenda();//pegunta por el periodo elegido
        op2 = menuColor();
        op3 = menuTalla();

        switch (op) {
            case 1:
                switch (op2) {
                    case 1:
                        switch (op3) {
                            case 1:
                                buzo = new Buzo(new Amarillo(), new Small());
                                buzo.prenda();
                                break;
                            case 2:
                                buzo = new Buzo(new Amarillo(), new Medium());
                                buzo.prenda();
                                break;
                            case 3:
                                buzo = new Buzo(new Amarillo(), new Large());
                                buzo.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        switch (op3) {
                            case 1:
                                buzo = new Buzo(new Azul(), new Small());
                                buzo.prenda();
                                break;
                            case 2:
                                buzo = new Buzo(new Azul(), new Medium());
                                buzo.prenda();
                                break;
                            case 3:
                                buzo = new Buzo(new Azul(), new Large());
                                buzo.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        switch (op3) {
                            case 1:
                                buzo = new Buzo(new Rojo(), new Small());
                                buzo.prenda();
                                break;
                            case 2:
                                buzo = new Buzo(new Rojo(), new Medium());
                                buzo.prenda();
                                break;
                            case 3:
                                buzo = new Buzo(new Rojo(), new Large());
                                buzo.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (op2) {
                    case 1:
                        switch (op3) {
                            case 1:
                                chaqueta = new Chaqueta(new Amarillo(), new Small());
                                chaqueta.prenda();
                                break;
                            case 2:
                                chaqueta = new Chaqueta(new Amarillo(), new Medium());
                                chaqueta.prenda();
                                break;
                            case 3:
                                chaqueta = new Chaqueta(new Amarillo(), new Large());
                                chaqueta.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        switch (op3) {
                            case 1:
                                chaqueta = new Chaqueta(new Azul(), new Small());
                                chaqueta.prenda();
                                break;
                            case 2:
                                chaqueta = new Chaqueta(new Azul(), new Medium());
                                chaqueta.prenda();
                                break;
                            case 3:
                                chaqueta = new Chaqueta(new Azul(), new Large());
                                chaqueta.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        switch (op3) {
                            case 1:
                                chaqueta = new Chaqueta(new Rojo(), new Small());
                                chaqueta.prenda();
                                break;
                            case 2:
                                chaqueta = new Chaqueta(new Rojo(), new Medium());
                                chaqueta.prenda();
                                break;
                            case 3:
                                chaqueta = new Chaqueta(new Rojo(), new Large());
                                chaqueta.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (op2) {
                    case 1:
                        switch (op3) {
                            case 1:
                                pantalon = new Pantalon(new Amarillo(), new Small());
                                pantalon.prenda();
                                break;
                            case 2:
                                pantalon = new Pantalon(new Amarillo(), new Medium());
                                pantalon.prenda();
                                break;
                            case 3:
                                pantalon = new Pantalon(new Amarillo(), new Large());
                                pantalon.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        switch (op3) {
                            case 1:
                                pantalon = new Pantalon(new Azul(), new Small());
                                pantalon.prenda();
                                break;
                            case 2:
                                pantalon = new Pantalon(new Azul(), new Medium());
                                pantalon.prenda();
                                break;
                            case 3:
                                pantalon = new Pantalon(new Azul(), new Large());
                                pantalon.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        switch (op3) {
                            case 1:
                                pantalon = new Pantalon(new Rojo(), new Small());
                                pantalon.prenda();
                                break;
                            case 2:
                                pantalon = new Pantalon(new Rojo(), new Medium());
                                pantalon.prenda();
                                break;
                            case 3:
                                pantalon = new Pantalon(new Rojo(), new Large());
                                pantalon.prenda();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        /**
         * Abstract_prenda[] prendas = new Abstract_prenda[3]; prendas[0] = new
         * Chaqueta(new Rojo()); prendas[1] = new Buzo(new Azul()); prendas[2] =
         * new Pantalon(new Amarillo());
         *
         * for (Abstract_prenda obj : prendas) { obj.prenda(); }
         */
    }

    public static int menuPrenda() {
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Crear Buzo. \n"
                + "2.   Crear Chaqueta. \n"
                + "3.   Crear Pantalon. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }

    public static int menuColor() {
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Color amarillo. \n"
                + "2.   Color azul. \n"
                + "3.   Color rojo. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }

    public static int menuTalla() {
        System.out.println(
                "MENU DE OPCIONES\n"
                + "1.   Talla Small. \n"
                + "2.   Talla Medium. \n"
                + "3.   Talla Large. \n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }

}
