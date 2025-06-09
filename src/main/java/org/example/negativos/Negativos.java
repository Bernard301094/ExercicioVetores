package org.example.negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int limite = scanner.nextInt();
        int[] numeros = new int[limite];

        for (int i = 0; i < limite; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < limite; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            } else if(numeros[i] > 0) {
                System.out.println("NÃO HÁ NÚMEROS NEGATIVOS");
                break;
            }
        }
        scanner.close();
    }
}