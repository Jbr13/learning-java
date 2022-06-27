package exercises;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4500.89;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 2500.89;
        p2.desconto = 0.15;

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media do carrinho: %.2f \n", mediaCarrinho);
    }
}
