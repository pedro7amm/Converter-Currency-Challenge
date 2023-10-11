package com.CurrencyConverter;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Conversor de Monedas","Salir"};
        boolean correrApp = true;
        int valorIngre = 0;
        double resultado= 0.0;

        //IMPLEMENTACION DE SELECT DE OPCIONES EN EL MENU
        /* String opcMenu = (JOptionPane.showInputDialog(null,
                "Selecciona la funcion a ejecutar", "opciones",
                JOptionPane.PLAIN_MESSAGE,null,new Object[]{
                        "Seleccionar",
                        "Conversor de monedas"}, "Seleccionar")).toString();*/

        while(correrApp){
            //IMPLEMENTACION DE BOTONES DEL MENU
            int opcMenu = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona una opción:",
                    "Menú Inicial",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch(opcMenu){
                case 0:
                    String[] opcMoneda = {"Colones a Euros","Colones a Dolares","Colones a libras",
                            "Euros a Colones","Dolares a Colones","Libras a Colones","Volver al menu"};
                    int opcMenuMone = JOptionPane.showOptionDialog(
                            null,
                            "Selecciona una opción:",
                            "Menú Conversion Monedas",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcMoneda,
                            opcMoneda[0]
                    );
                    switch(opcMenuMone) {
                        case 0:
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Colones:"));
                                resultado = valorIngre * 0.0018;
                                JOptionPane.showMessageDialog(null, resultado+" EUROS.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        case 1:
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Colones:"));
                                resultado = valorIngre * 0.0019;
                                JOptionPane.showMessageDialog(null, resultado+" USD.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }
                            break;
                        case 2:
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Colones:"));
                                resultado = valorIngre * 0.0015;
                                JOptionPane.showMessageDialog(null, resultado+" LIBRAS.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        case 3:
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Euros:"));
                                resultado = valorIngre / 568.58;
                                JOptionPane.showMessageDialog(null, resultado+" COLONES.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        case 4:
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Dolares:"));
                                resultado = valorIngre / 535.26;
                                JOptionPane.showMessageDialog(null, resultado+" COLONES.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }
                            break;
                        case 5:
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Libras:"));
                                resultado = valorIngre / 658.96;
                                JOptionPane.showMessageDialog(null, resultado+" COLONES.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        default:
                            break;
                    }
                case 1:
                    correrApp=false;
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,"Gracias por usar el sistema.");

    }
}