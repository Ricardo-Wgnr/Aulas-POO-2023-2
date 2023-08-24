package engtelecom.poo;

public class Contador {

    private int valorAtual;

    public void setValorAtual() {
        this.valorAtual = 0;
    }

    public void incrementar() {
        valorAtual++;
    }

    public int getValorAtual() {
        return valorAtual;
    }

}
