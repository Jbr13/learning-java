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
        final String formato = "%s/%s/%s";
        return String.format(formato, dia, mes, ano);
    }
}
