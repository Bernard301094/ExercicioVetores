package org.example.abaixo_da_media;

import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int limiteVetor = scanner.nextInt();

        double[] vetor = new double[limiteVetor];
        double soma = 0;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        double media = soma / vetor.length;

        System.out.printf("MÉDIA DO VETOR = %.3f" , media);
        System.out.println();

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

    }
}
