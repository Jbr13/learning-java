package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		// o print, irá exibir a informação na mesma linha, sem quebrar de uma string pra outra
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		// Já o println irá exbiri a string e quebrar 1 linha para que a proxima possa ser exibida
		System.out.println("Bom");
		System.out.println("dia!");

		// O printf é utilizado para iterpolarmos as variáveis
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		entrada.close();
	}
}
