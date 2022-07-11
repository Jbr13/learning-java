package desafios.classesEMetodos;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    double peso;
    ArrayList<String> nomeComidasIngeridas = new ArrayList<>();

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(ArrayList<Comida> comidas) throws InterruptedException {

        String resultadoFomatado = "Agora o %s esta pesando %.2fKG após comer as seguintes comidas: %s";

        this.apresentar(this.nome, this.peso);

        for(int i = 0; i < comidas.size();i++) {
            Comida comida = comidas.get(i);
            this.peso += comida.peso;

            this.anuciarComida(comida);

            Thread.sleep(1000);

            this.nomeComidasIngeridas.add(comida.nome);
        }

        anuciarTotalComida(resultadoFomatado);


    }

    void apresentar(String nome, double peso) {
        System.out.printf("Olá, sou o %s e estou pesando atualmente %.2f\n", this.nome, this.peso);
    }

    void anuciarComida(Comida comida) {
        System.out.printf("Comendo %s...\n",comida.nome);
    }

    void anuciarTotalComida(String resultado) {
        System.out.printf(
                resultado,
                this.nome,
                this.peso,
                this.nomeComidasIngeridas.toString().replace("[", "").replace("]", "")
        );
    }
}
