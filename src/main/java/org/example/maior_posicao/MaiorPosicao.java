package org.example.maior_posicao;

import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int numero = scanner.nextInt();
        double maiorNumero = 0;
        int posicaoMaiorNumero = 0;

        double[] vetor = new double[numero];

        for (int i = 0; i < vetor.length ; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextDouble(); // Lê o número do usuário
            maiorNumero = Math.max(maiorNumero, vetor[i]); // Atualiza o maior número encontrado
            if (maiorNumero == vetor[i]) { // Verifica se o número atual é o maior
                posicaoMaiorNumero = i; // Atualiza a posição do maior número
            }
        }

        scanner.close();
        System.out.println("MAIOR VALOR = " + maiorNumero);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorNumero);
    }
}
