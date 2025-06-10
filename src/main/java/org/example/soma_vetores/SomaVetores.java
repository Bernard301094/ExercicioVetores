package org.example.soma_vetores;

import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int tamanhoVetor = scanner.nextInt();

        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite um número:");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite um número:");
            vetorB[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        scanner.close();
    }
}
