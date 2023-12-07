package engtelecom.poo;

public enum Naipe {

    OURO(1, '\u2666'), ESPADA(2, '\u2660'),
    COPA(3, '\u2665'), PAU(4, '\u2663');

    public final int valor;
    public final char simbolo;

    Naipe(int valor, char simbolo){
        this.valor = valor;
        this.simbolo = simbolo;
    }

}
