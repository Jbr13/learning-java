package exercises;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data("13", "05", "1999");

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

    }
}