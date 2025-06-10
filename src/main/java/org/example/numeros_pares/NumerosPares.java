package org.example.numeros_pares;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int limite = scanner.nextInt();
        int [] numerosInteiros = new int[limite];
        int par = 0;
        int quantidadePares = 0;

        for (int i = 0; i < numerosInteiros.length ; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numerosInteiros[i] = numero;
        }
        System.out.println("NÚMEROS PARES: ");

        for (int i = 0; i < numerosInteiros.length; i++) {
            if(numerosInteiros[i] % 2 == 0) {
                par = numerosInteiros[i];
                System.out.print(par + "  ");
                quantidadePares++;
            }
        }

        scanner.close();
        System.out.println();
        System.out.println("QUANTIDADE PARES = " + quantidadePares);
    }
}
