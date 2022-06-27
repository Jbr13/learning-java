package exercises;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 13;
        data1.mes = 05;
        data1.ano = 1999;

        System.out.printf("%d/%d/%d", data1.dia, data1.mes, data1.ano);
    }
}
