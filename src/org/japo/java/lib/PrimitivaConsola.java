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
    public static final int[] NUMERO_BOLETO = new int[5];

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

    public static void repetirNumero() {

        for (int veces = 0; veces < 5; veces++) {
            NUMERO_BOLETO[veces] = comprobarNumero();

        }
    }

    public static void mensajePrimitiva() {

        repetirNumero();
        System.out.printf("Número boleto......: %d-%d-%d-%d-%d", NUMERO_BOLETO[0], NUMERO_BOLETO[1], NUMERO_BOLETO[2], NUMERO_BOLETO[3], NUMERO_BOLETO[4]);
    }

}
