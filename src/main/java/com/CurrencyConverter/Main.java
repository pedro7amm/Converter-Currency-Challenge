package com.CurrencyConverter;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Conversor de Monedas"}; //Inicializando Opciones menu principal
        String[] opcMoneda = {"Colones a Euros","Colones a Dolares","Colones a libras",
                "Euros a Colones","Dolares a Colones","Libras a Colones","Volver al menu"}; //Inicializando opciones menu conversión de monedas
        boolean correrApp = true; //variable que permite seguir corriendo la app si el user así lo desea
        int valorIngre = 0; //variable para guardar el valor que ingresa el usuario
        float resultado; //variable que guarda el resultado de la conversión

        //IMPLEMENTACION DE SELECT DE OPCIONES EN EL MENU
        /* String opcMenu = (JOptionPane.showInputDialog(null,
                "Selecciona la funcion a ejecutar", "opciones",
                JOptionPane.PLAIN_MESSAGE,null,new Object[]{
                        "Seleccionar",
                        "Conversor de monedas"}, "Seleccionar")).toString();*/

        while(correrApp){
            //IMPLEMENTACION DE BOTONES DEL MENU
            int opcMenu = JOptionPane.showOptionDialog( //Se crean varias opciones con el array Opciones usando la posicion del array como valor
                    null,
                    "Selecciona una opción:",
                    "Menú Inicial",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch(opcMenu) { //Switch que permite ingresar a la opción que el usuario quiere
                case 0:
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
                        case 0: //Colones a Euros
                            try{ //Try catch para interceptar un error si el usuario no ingresa un valor deseado
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Colones:"));
                                resultado = valorIngre * 0.0018f; //conversión para obtener el valor en la moneda deseada
                                JOptionPane.showMessageDialog(null, resultado+" EUROS.");//Mensaje brindando el resultado de la conversión
                            }catch (NumberFormatException ex){ //Maneja la excepción de manera que da un mensaje al usuario informando lo que esta haciendo
                                ex.printStackTrace(); //Se imprime en consola la excepción que tuvo el usuario
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        case 1: //Colones a Dolares
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Colones:"));
                                resultado = valorIngre * 0.0019f;
                                JOptionPane.showMessageDialog(null, resultado+" USD.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }
                            break;
                        case 2: //Colones a Libras
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Colones:"));
                                resultado = valorIngre * 0.0015f;
                                JOptionPane.showMessageDialog(null, resultado+" LIBRAS.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        case 3: //Euros a Colones
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Euros:"));
                                resultado = valorIngre * 568.58f;
                                JOptionPane.showMessageDialog(null, resultado+" COLONES.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }

                            break;
                        case 4: //Dolares a Colones
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Dolares:"));
                                resultado = valorIngre * 535.26f;
                                JOptionPane.showMessageDialog(null, resultado+" COLONES.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }
                            break;
                        case 5: //Libras a Colones
                            try{
                                valorIngre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Libras:"));
                                resultado = valorIngre * 658.96f;
                                JOptionPane.showMessageDialog(null, resultado+" COLONES.");
                            }catch (NumberFormatException ex){
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,"Ingreso un caracter no valido");
                            }
                            break;
                        default:
                            break;
                    }
                    if(opcMenuMone!=6){
                        int respuesta = JOptionPane.showConfirmDialog(null,
                                "Desea realizar otra conversion?", "Confirmación", JOptionPane.YES_NO_OPTION);
                        if(respuesta == JOptionPane.NO_OPTION){
                            correrApp=false;
                        }
                    }
            }
        }
        JOptionPane.showMessageDialog(null,"Programa Finalizado."); //Mensaje de cierre de programa

    }
}