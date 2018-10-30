package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido, introduzca la nota.");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        nota(x);
    }

    /*
    Función main para pedir la nota
     */

    private static void nota(int x) {
        switch (x) {
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Suspenso");
                break;
        }
    }

    /*
    Función con un switch que saca por pantalla el resultado.
     */
}