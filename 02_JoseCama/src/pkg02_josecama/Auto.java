package pkg02_josecama;

import javax.swing.JOptionPane;

//Estudiante: Jose Megun Cama La Madrid

public class Auto {
    
    // Atributos
    private String marca;
    private String color;
    private int km;
    
    // Constructor
    public void Auto() {
        marca = JOptionPane.showInputDialog("Ingrese la marca del auto: ");
        color = JOptionPane.showInputDialog("Ingrese el color del auto: ");
        km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km del auto: "));
    }
    
    // Método
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "El auto es un " + marca +  ", de color " + color + " y va a " + km + " km.");
    }
}

