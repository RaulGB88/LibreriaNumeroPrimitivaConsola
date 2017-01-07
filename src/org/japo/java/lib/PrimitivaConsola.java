/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//Importación del método Scanner.
import java.util.Scanner;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class PrimitivaConsola {

    //Instanciación del método Scanner.
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    //Instanciación del Array que contiene el número completo del boleto de Primitiva.
    public static int[] numeroBoleto = new int[5];

    //Introducir un número por teclado.
    public static int introducirNumero() {

        int numero = 0;
        boolean testOK = true;
        do {
            try {
                System.out.printf("Introduce el número deseado....: ");
                numero = SCN.nextInt();
                testOK = false;
            } catch (Exception e) {
                System.out.println("Error de entrada.");
            }
        } while (testOK);

        return numero;
    }

    //Comprueba que el número introducido es realmente un número válido de la Primitiva.
    public static int comprobarNumero() {

        int numero;

        boolean numeroOK;
        do {
            numero = introducirNumero();
            numeroOK = !(numero >= 0 && numero <= 49);

            if (numeroOK) {
                System.out.println("Número no válido.");
            }
        } while (numeroOK);

        return numero;
    }

    //Repite el método anterior y lo almacena.
    public static void repetirNumero() {

        for (int veces = 0; veces < 5; veces++) {
            numeroBoleto[veces] = comprobarNumero();

        }
    }

    //Mensaje con el número completo del boleto de Primitiva.
    public static void mensajePrimitiva() {

        repetirNumero();
        System.out.printf("Número boleto......: %d-%d-%d-%d-%d", numeroBoleto[0], numeroBoleto[1], numeroBoleto[2], numeroBoleto[3], numeroBoleto[4]);
    }

}
