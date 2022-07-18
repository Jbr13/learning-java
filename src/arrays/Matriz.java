package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int qtdNotasTotal = 0;

        System.out.println("Quantidade de alunos:");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Quantidade de notas:");
        int qtdNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
            for (int nota = 0;nota < notasDaTurma[aluno].length; nota++) {
                System.out.printf("Informe a %d nota do %d aluno\n", nota + 1, aluno + 1);
                notasDaTurma[aluno][nota] = scanner.nextDouble();
                qtdNotasTotal += notasDaTurma[aluno][nota];            }
        }

        double media = qtdNotasTotal / (qtdAlunos * qtdNotas);
        System.out.printf("A média é: %.2f", media);

        scanner.close();

    }
}
