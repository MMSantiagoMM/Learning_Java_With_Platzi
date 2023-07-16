package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = read.nextInt();
        System.out.println("Que operacion desea realizar");
        String consulta = read.next();

        int resultado = Funcion_1.calcular(num1,num2,consulta);
        System.out.println(resultado);




    }
}