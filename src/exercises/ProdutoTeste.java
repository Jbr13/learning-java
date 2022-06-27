package exercises;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4500, 0.25);

        System.out.printf("Preco com desconto do produto %s: %.2f \n", p1.nome, p1.getPrecoComDesconto());
    }
}
