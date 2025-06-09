package org.example.alturas;

import java.util.Scanner;
import java.util.Vector;

public class Alturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        if (quantidadePessoas <= 0) {
            System.out.println("Quantidade inválida. Deve ser maior que zero.");
            return;
        }

        Vector<Vector<Object>> pessoas = new Vector<>();
        scanner.nextLine(); // limpar buffer

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade de " + nome + ": ");
            int idade = scanner.nextInt();

            System.out.print("Altura de " + nome + ": ");
            double altura = scanner.nextDouble();

            scanner.nextLine(); // limpar buffer

            Vector<Object> pessoa = new Vector<>();
            pessoa.add(nome);
            pessoa.add(idade);
            pessoa.add(altura);

            pessoas.add(pessoa);
        }

        double somaAlturas = 0.0;
        int menores16 = 0;
        Vector<String> nomesMenores16 = new Vector<>();

        for (Vector<Object> pessoa : pessoas) {
            int idade = (int) pessoa.get(1);
            double altura = (double) pessoa.get(2);

            somaAlturas += altura;

            if (idade < 16) {
                menores16++;
                nomesMenores16.add((String) pessoa.get(0));
            }
        }

        double mediaAltura = somaAlturas / quantidadePessoas;
        double percentualMenores16 = (menores16 * 100.0) / quantidadePessoas;

        System.out.printf("\nAltura média: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores16);

        for (String nome : nomesMenores16) {
            System.out.println(nome);
        }
    }
}

