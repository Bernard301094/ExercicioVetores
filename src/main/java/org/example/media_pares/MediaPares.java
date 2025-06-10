package org.example.media_pares;

import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int limiteVetor = scanner.nextInt();

        int[] vetor = new int[limiteVetor];
        int somaPares = 0;
        int quantidadePares = 0;


        for (int i = 0; i < vetor.length ; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }

        if (quantidadePares > 0) {
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", (double) somaPares / quantidadePares));
        } else {
            System.out.println("NENHUM NúMERO PAR");
        }

        scanner.close();
    }
}
