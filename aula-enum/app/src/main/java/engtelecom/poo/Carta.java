package engtelecom.poo;

public class Carta {

    private Valor valor;
    private Naipe naipe;

    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return "" + this.valor.simbolo + " de " + this.naipe;
    }
}
