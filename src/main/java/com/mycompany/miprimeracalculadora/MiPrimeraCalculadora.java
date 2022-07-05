package com.mycompany.miprimeracalculadora;

import javax.swing.JOptionPane;

/**
 * FGALVEZ WLOPEZ AORJUELA
 */
public class MiPrimeraCalculadora {

    public static void main(String[] args) {

        String MensajeInicial = JOptionPane.showInputDialog("""
                                                            Selecciona una opcion
                                                            1.Reliza una Operacion
                                                            2.Salir""");
        //double opcionDigitada = Double.parseDouble(MensajeInicial);

        double numero1;
        double numero2;
        double resultado;

        while ("1".equals(MensajeInicial)) {
            if ("1".equals(MensajeInicial)){
                String Mensaje2 = JOptionPane.showInputDialog("""
                                                              Selecciona la operacion de tu preferencia
                                                              1.Suma
                                                              2.Resta
                                                              3.Multiplicacion
                                                              4.Division
                                                              5.Potencia
                                                              6.Raiz Cuadrada
                                                              7.Salir""");
                

                OUTER:
                while ("1".equals(Mensaje2) || "2".equals(Mensaje2) || "3".equals(Mensaje2) || "4".equals(Mensaje2) || "5".equals(Mensaje2) || "6".equals(Mensaje2) || "7".equals(Mensaje2)) {
                    if (null == Mensaje2) {
                        JOptionPane.showMessageDialog(null,"""
                                                                                   Opcion no valida, esocger opcion numerica
                                                                                   1:para Sumar
                                                                                   2:para Restar
                                                                                   3:para Multiplicar
                                                                                   4:para Dividir
                                                                                   5:para Potenciacion
                                                                                   6:para Raiz Cuadrada""");
                        break;
                    } else {
                        switch (Mensaje2) {
                            case "1" -> {
                                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                                resultado = (numero1 + numero2);
                                JOptionPane.showMessageDialog(null,"El resultado de la Suma es: " + resultado);
                                break OUTER;
                            }
                            case "2" -> {
                                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                                resultado = (numero1 - numero2);
                                JOptionPane.showMessageDialog(null,"El resultado de la Resta es: " + resultado);
                                break OUTER;
                            }
                            case "3" -> {
                                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                                resultado = (numero1 * numero2);
                                JOptionPane.showMessageDialog(null,"El resultado de la Multiplicacion es: " + resultado);
                                break OUTER;
                            }
                            case "4" -> {
                                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                                if (numero2 == 0) {
                                    JOptionPane.showMessageDialog(null,"No se puede dividir entre cero ");
                                    break OUTER;
                                } else {
                                    resultado = (numero1 / numero2);
                                    JOptionPane.showMessageDialog(null, "El resultado de la Division es: " + resultado);
                                    break OUTER;
                                }
                            }
                            case "5" -> {
                                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                                resultado = Math.pow(numero1, numero2);
                                JOptionPane.showMessageDialog(null,"El resultado de la potencia es: " + resultado);
                                break OUTER;
                            }
                            case "6" -> {
                                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar un numero"));
                                resultado = Math.sqrt(numero1);
                                JOptionPane.showMessageDialog(null,"El resultado de la Raiz cuadrada es: " + resultado);
                                break OUTER;
                            }
                            case "7" -> {
                                break OUTER;
                            }
                            default -> JOptionPane.showMessageDialog(null,"""
                                                                                                   Opcion no valida, esocger opcion numerica
                                                                                                   1:para Sumar
                                                                                                   2:para Restar
                                                                                                   3:para Multiplicar
                                                                                                   4:para Dividir
                                                                                                   5:para Potenciacion
                                                                                                   6:para Raiz Cuadrada""");
                        }
                    }
                }
            }         
/*
                switch (Mensaje2) {

                    case "1":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                        resultado = (numero1 + numero2);
                        System.out.println("El resultado de la Suma es: " + resultado);
                        break;

                    case "2":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                        resultado = (numero1 - numero2);
                        System.out.println("El resultado de la Resta es: " + resultado);
                        break;

                    case "3":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                        resultado = (numero1 * numero2);
                        System.out.println("El resultado de la Multiplicacion es: " + resultado);
                        break;

                    case "4":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                        if (numero2 == 0) {
                            System.out.println("No se puede dividir entre cero ");
                        } else {
                            resultado = (numero1 / numero2);
                            System.out.println("El resultado de la Division es: " + resultado);
                        }
                        break;

                    case "5":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  primer numero"));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar  segundo numero"));
                        resultado = Math.pow(numero1, numero2);
                        System.out.println("El resultado de la potencia es: " + resultado);
                        break;

                    case "6":
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar un numero"));
                        resultado = Math.sqrt(numero1);
                        System.out.println("El resultado de la Raiz cuadrada es: " + resultado);
                        break;

                    case "7":
                        break;

                    default:
                        System.out.println("Opcion no valida, esocger opcion numerica" + "\n"
                                + "1:para Sumar" + "\n"
                                + "2:para Restar" + "\n"
                                + "3:para Multiplicar" + "\n"
                                + "4:para Dividir" + "\n"
                                + "5:para Potenciacion" + "\n"
                                + "6:para Raiz Cuadrada");

                } */

            else if ( "2".equals(MensajeInicial)){
                break;}

            else { 
                JOptionPane.showMessageDialog(null, "Opcion no valida, esocger una opcion valida ==>> 1:para continuar con operaciones aritmeticas y 2:para salir ");}

        }
    }
}
