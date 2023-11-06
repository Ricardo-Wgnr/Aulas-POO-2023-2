package engtelecom.poo;

public class Tesouro {

    public static final int LARGURA = 10;
    public static final int ALTURA = 10;

    private int posicaoX;
    private int posicaoY;
    private int valor;

    public Tesouro(int posicaoX, int posicaoY, int valor) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.valor = valor;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public int getValor() {
        return valor;
    }

}
