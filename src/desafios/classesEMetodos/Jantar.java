package desafios.classesEMetodos;

import java.util.ArrayList;

public class Jantar {
    public static void main(String[] args) throws InterruptedException {

        Pessoa pessoa = new Pessoa("João", 99.0);
        ArrayList<Comida> comidasIngeridas = new ArrayList<>();

        Comida comida01 = new Comida("Temaki", 0.50);
        Comida comida02 = new Comida("Hot roll", 0.25);
        Comida comida03 = new Comida("Temaki gigante especial da casa", 0.800);

        comidasIngeridas.add(comida01);
        comidasIngeridas.add(comida02);
        comidasIngeridas.add(comida03);

        pessoa.comer(comidasIngeridas);



    }
}
