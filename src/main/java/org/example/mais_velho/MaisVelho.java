package org.example.mais_velho;

import java.util.Scanner;
import java.util.Vector;

public class MaisVelho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        if (quantidadePessoas <= 0) {
            System.out.println("Quantidade inválida. Deve ser maior que zero.");
            return;
        }

        Vector<Vector<Object>> pessoas = new Vector<>();

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            scanner.nextLine(); // Limpa o buffer
            String nome = scanner.nextLine();

            System.out.print("Idade de " + nome + ": ");
            int idade = scanner.nextInt();

            Vector<Object> pessoa = new Vector<>();
            pessoa.add(nome);
            pessoa.add(idade);

            pessoas.add(pessoa);
        }

        int indiceMaisVelho = 0;
        int maiorIdade = (int) pessoas.get(0).get(1);

        for (int i = 1; i < pessoas.size(); i++) {
            int idadeAtual = (int) pessoas.get(i).get(1);
            if (idadeAtual > maiorIdade) {
                maiorIdade = idadeAtual;
                indiceMaisVelho = i;
            }
        }

        scanner.close();
        System.out.println("PESSOA MAIS VELHA: " + pessoas.get(indiceMaisVelho).get(0));
    }
}

