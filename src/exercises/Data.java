package exercises;

public class Data {
    String dia;
    String mes;
    String ano;

    Data() {
        dia = "01";
        mes = "01";
        ano = "1970";
    }

    Data(String diaInicial, String mesInicial, String anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("Data formatada: %s/%s/%s", dia, mes, ano);
    }
}
