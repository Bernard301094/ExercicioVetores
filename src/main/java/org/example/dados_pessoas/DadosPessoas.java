package org.example.dados_pessoas;

import java.util.Scanner;
import java.util.Vector;

public class DadosPessoas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int quantidadePessoas = scanner.nextInt();

        if (quantidadePessoas <= 0) {
            System.out.println("Quantidade inválida. Deve ser maior que zero.");
            return;
        }

        scanner.nextLine();
        Vector<Vector<Object>> pessoas = new Vector<>();
        int quantidadeHomens = 0;
        double somaAlturasMulheres = 0.0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Altura da " + (i + 1) + "a pessoa: ");
            double altura = scanner.nextDouble();

            System.out.println("Gênero da " + (i + 1) + "a pessoa: ");
            char genero = scanner.next().charAt(0);

            Vector<Object> pessoa = new Vector<>();
            pessoa.add(altura);
            pessoa.add(genero);

            pessoas.add(pessoa);

            if (genero == 'M' || genero == 'm') {
                quantidadeHomens++;

            } else if (genero == 'F' || genero == 'f') {
                somaAlturasMulheres += altura;
            }

        }

        double mediaAlturasMulheres = somaAlturasMulheres / (quantidadePessoas - quantidadeHomens);

        double maiorAltura = (double) pessoas.get(0).get(0);
        double menorAltura = (double) pessoas.get(0).get(0);

        for (int i = 0; i < pessoas.size(); i++) {
            double alturaAtual = (double) pessoas.get(i).get(0);
            if (alturaAtual > maiorAltura) {
                maiorAltura = alturaAtual;
            }
            if (alturaAtual < menorAltura) {
                menorAltura = alturaAtual;
            }
        }
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Menor altura = " + menorAltura);
        System.out.printf("Altura média das mulheres: %.2f", mediaAlturasMulheres);
        System.out.println();
        System.out.println("Quantidade de homens: " + quantidadeHomens);
    }
}

