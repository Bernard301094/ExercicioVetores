package org.example.soma_vetor;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int limite = scanner.nextInt();
        double soma = 0.0;
        double[] numeros = new double[limite];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        double media = soma / numeros.length;

        System.out.print("Valores: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i] + " ");
        }

        System.out.println();
        System.out.println("SOMA: " + soma);
        System.out.printf("MÉDIA: %.2f%n", media);
    }
}
