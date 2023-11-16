package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class Tesouro extends Elemento{

    public static final int LARGURA = 10;
    public static final int ALTURA = 10;
    public static final int RAIO = 20;

    private int valor;

    public Tesouro(int posicaoX, int posicaoY, int valor) {
        super(posicaoX,posicaoY);
        this.valor = valor;
    }

    public void desenhar(Draw desenho) {

        desenho.picture(posicaoX,posicaoY,"treasureDim.png");

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
