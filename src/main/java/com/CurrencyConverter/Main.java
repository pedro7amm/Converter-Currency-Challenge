package com.CurrencyConverter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String opcMenu = (JOptionPane.showInputDialog(null,
                "Selecciona la funcion a ejecutar", "opciones",
                JOptionPane.PLAIN_MESSAGE,null,new Object[]{
                        "Seleccionar",
                        "Conversor de monedas"}, "Seleccionar")).toString();

        JOptionPane.showMessageDialog(null,"La opcion escogida fue"+opcMenu);
    }
}