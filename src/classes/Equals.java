package classes;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Joao";
        u1.email = "joao.vitor.cpp@hotmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Joao";
        u2.email = "joao.vitor.cpp@hotmail.com";

        System.out.printf("u1 == u2: %b\n", u1 == u2);
        System.out.printf("u1.equals(u2): %b\n", u1.equals(u2));
    }
}
