package exercises;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double getPrecoComDesconto() {
        return preco * (1 - desconto);
    }

}
