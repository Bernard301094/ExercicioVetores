package org.example.aprovados;

import java.util.Scanner;
import java.util.Vector;

public class Aprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
        int quantidadeAlunos = scanner.nextInt();

        if (quantidadeAlunos <= 0) {
            System.out.println("Quantidade inválida. Deve ser maior que zero.");
            return;
        }

        Vector<Vector<Object>> alunos = new Vector<>();

        for (int i = 0; i < quantidadeAlunos ; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            scanner.nextLine();

            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Nota 1ro Semestre: ");
            double nota1 = scanner.nextDouble();
            System.out.println("Nota 2do Semestre: ");
            double nota2 = scanner.nextDouble();

           Vector<Object> aluno = new Vector<>();
            aluno.add(nome);
            aluno.add(nota1);
            aluno.add(nota2);

            alunos.add(aluno);

        }

        double somaNotas = 0.0;

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.size() ; i++) {
            somaNotas = (double) alunos.get(i).get(1) + (double) alunos.get(i).get(2);
            double media = somaNotas / 2.0;

            if (media >= 6.0) {
                System.out.println(alunos.get(i).get(0) + " com média: " + media);
            }
        }
        scanner.close();
    }
}
