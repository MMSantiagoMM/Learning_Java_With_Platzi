package org.example;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*String [] nombres = new String [5];
        for (int i = 0; i < nombres.length ; i++) {
            System.out.println("Ingrese un nombre para la posición: " + i);
            nombres[i] = read.next();
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }*/
        int [][] numeros = new int [2][2];
        String auxiliar = "";
        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros.length ; j++) {
                System.out.println("Ingrese un número en la linea: " + i + " y en la columna: " + j);
                numeros[j][j] = read.nextInt();
                auxiliar += " Fila: " + i + " Columna: " + j + " = " + numeros[j][j];
            }
        }
        System.out.println(auxiliar);


        }
    }

