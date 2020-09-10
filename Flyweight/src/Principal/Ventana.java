/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ConcreteFlyweight.Circulo;
import FlyweightFactory.FabricaFiguras;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author USER
 */
public class Ventana extends JFrame {

    public static final String colores[] = {"Rojo", "Azul", "Amarillo", "Verde", "Morado"};
    private JPanel panel;
    private JLabel titulo;
    private JLabel posX;
    private JLabel posY;
    private JLabel lblradio;
    private JLabel selColor;
    private JLabel resultado;
    private JRadioButton rbRojo;
    private JRadioButton rbAzul;
    private JRadioButton rbAmarillo;
    private JRadioButton rbVerde;
    private JRadioButton rbMorado;
    private JButton boton;
    private JTextField x;
    private JTextField y;
    private JTextField radio;
    private JTextArea impresion;

    public Ventana() {
        setSize(600,800); // tamaño de la ventana
        setLocationRelativeTo(null); // coloca la ventana en el centro
        setTitle("Practica Flyweight"); // titulo de la ventana
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // termina la ejecucion al cerrar la ventana
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarRadioButton();
        colocarBotones();
        colocarCajasDeTexto();
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas() {
        titulo = new JLabel();
        titulo.setText("CREADOR DE CIRCULOS");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(75, 20, 400, 30);
        titulo.setFont(new Font("cooper black", 0, 30));
        panel.add(titulo);
        
        posX = new JLabel();
        posX.setText("Posición en x:");
        posX.setHorizontalAlignment(SwingConstants.CENTER);
        posX.setBounds(85, 75, 115, 30);
        posX.setFont(new Font("cooper black", 0, 15));
        panel.add(posX);
        
        posY = new JLabel();
        posY.setText("Posición en y:");
        posY.setHorizontalAlignment(SwingConstants.CENTER);
        posY.setBounds(85, 125, 115, 30);
        posY.setFont(new Font("cooper black", 0, 15));
        panel.add(posY);
        
        lblradio = new JLabel();
        lblradio.setText("Radio:");
        lblradio.setHorizontalAlignment(SwingConstants.CENTER);
        lblradio.setBounds(112, 175, 115, 30);
        lblradio.setFont(new Font("cooper black", 0, 15));
        panel.add(lblradio);
        
        selColor = new JLabel();
        selColor.setText("Seleccione el color del circulo:");
        selColor.setHorizontalAlignment(SwingConstants.CENTER);
        selColor.setBounds(50, 225, 400, 30);
        selColor.setFont(new Font("cooper black", 0, 18));
        panel.add(selColor);

    }

    private void colocarRadioButton() {
        rbRojo = new JRadioButton();
        rbRojo.setText("Rojo");
        rbRojo.setForeground(Color.red);
        rbRojo.setBounds(50, 270, 50, 30);
        panel.add(rbRojo);

        rbAzul = new JRadioButton();
        rbAzul.setText("Azul");
        rbAzul.setForeground(Color.blue);
        rbAzul.setBounds(150, 270, 50, 30);
        panel.add(rbAzul);

        rbAmarillo = new JRadioButton();
        rbAmarillo.setText("Amarillo");
        rbAmarillo.setForeground(Color.yellow);
        rbAmarillo.setBounds(250, 270, 75, 30);
        panel.add(rbAmarillo);

        rbVerde = new JRadioButton();
        rbVerde.setText("Verde");
        rbVerde.setForeground(Color.green);
        rbVerde.setBounds(350, 270, 60, 30);
        panel.add(rbVerde);

        rbMorado = new JRadioButton();
        rbMorado.setText("Morado");
        rbMorado.setForeground(Color.magenta);
        rbMorado.setBounds(450, 270, 75, 30);
        panel.add(rbMorado);

        ButtonGroup grBotones = new ButtonGroup();
        grBotones.add(rbRojo);
        grBotones.add(rbAzul);
        grBotones.add(rbAmarillo);
        grBotones.add(rbVerde);
        grBotones.add(rbMorado);
    }

    private void colocarBotones() {
        boton = new JButton();
        boton.setText("Enviar");
        boton.setBounds(200, 320, 100, 30);
        panel.add(boton);

        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (rbRojo.isSelected() == true && !x.getText().isEmpty() && !y.getText().isEmpty() && !radio.getText().isEmpty()) {
                    Circulo circulo = (Circulo) FabricaFiguras.getCirculo("Rojo", impresion);
                    circulo.setX(Integer.parseInt(x.getText()));
                    circulo.setY(Integer.parseInt(y.getText()));
                    circulo.setRadio(Integer.parseInt(radio.getText()));
                    circulo.dibujar(impresion);
                } else if (rbAzul.isSelected() == true && !x.getText().isEmpty() && !y.getText().isEmpty() && !radio.getText().isEmpty()) {
                    Circulo circulo = (Circulo) FabricaFiguras.getCirculo("Azul", impresion);
                    circulo.setX(Integer.parseInt(x.getText()));
                    circulo.setY(Integer.parseInt(y.getText()));
                    circulo.setRadio(Integer.parseInt(radio.getText()));
                    circulo.dibujar(impresion);
                } else if (rbAmarillo.isSelected() == true && !x.getText().isEmpty() && !y.getText().isEmpty() && !radio.getText().isEmpty()) {
                    Circulo circulo = (Circulo) FabricaFiguras.getCirculo("Amarillo", impresion);
                    circulo.setX(Integer.parseInt(x.getText()));
                    circulo.setY(Integer.parseInt(y.getText()));
                    circulo.setRadio(Integer.parseInt(radio.getText()));
                    circulo.dibujar(impresion);
                } else if (rbVerde.isSelected() == true && !x.getText().isEmpty() && !y.getText().isEmpty() && !radio.getText().isEmpty()) {
                    Circulo circulo = (Circulo) FabricaFiguras.getCirculo("Verde", impresion);
                    circulo.setX(Integer.parseInt(x.getText()));
                    circulo.setY(Integer.parseInt(y.getText()));
                    circulo.setRadio(Integer.parseInt(radio.getText()));
                    circulo.dibujar(impresion);
                } else if (rbMorado.isSelected() == true && !x.getText().isEmpty() && !y.getText().isEmpty() && !radio.getText().isEmpty()) {
                    Circulo circulo = (Circulo) FabricaFiguras.getCirculo("Morado", impresion);
                    circulo.setX(Integer.parseInt(x.getText()));
                    circulo.setY(Integer.parseInt(y.getText()));
                    circulo.setRadio(Integer.parseInt(radio.getText()));
                    circulo.dibujar(impresion);
                } else {
                    JOptionPane.showMessageDialog(null, "No selecciono ninguna opción o hay algun valor en blanco");
                }
            }
        };
        boton.addActionListener(accion);
    }

    private void colocarCajasDeTexto() {
        x = new JTextField();
        x.setBounds(200, 75, 100, 30);
        panel.add(x);

        y = new JTextField();
        y.setBounds(200, 125, 100, 30);
        panel.add(y);

        radio = new JTextField();
        radio.setBounds(200, 175, 100, 30);
        panel.add(radio);

        impresion = new JTextArea();
        impresion.setBounds(50, 365, 500, 400);
        impresion.setEditable(false);
        panel.add(impresion);
    }

}
