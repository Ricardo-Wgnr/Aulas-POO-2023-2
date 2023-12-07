package engtelecom.poo;

public enum Valor {

    AS(8, "A"), DOIS(9, "2"), TRES(10, "3"), QUATRO(1, "4"), CINCO(2, "5"), SEIS(3, "6"), SETE(4, "7"),
    OITO(-1, "8"), NOVE(-1, "9"), DEZ(-1, "10"), VALETE(6, "J"), DAMA(5, "Q"), REI(7, "K");

    public final int valor;
    public final String simbolo;

    Valor(int valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }

}
