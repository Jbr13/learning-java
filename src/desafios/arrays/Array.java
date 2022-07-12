package desafios.arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        System.out.println("Quantas notas você deseja informar?");
        int arraySize = scanner.nextInt();

        double[] notas = new double[arraySize];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %d nota\n", i + 1);
            notas[i] = scanner.nextDouble();
        }

        for(double nota : notas) {
            somaNotas += nota;
        }

        System.out.printf("A média das %d notas informadas é: %.2f\n", notas.length, somaNotas / notas.length);

        scanner.close();
    }
}
