package engtelecom.poo;

import java.util.ArrayList;

public class Robo {

    private int velocidadeX;
    private int velocidadeY;
    private Tesouro [] armazenamento;
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Robo(int velocidadeX, int velocidadeY, int armazenamento) {
        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;
        this.armazenamento = new Tesouro[armazenamento];
    }

    public boolean movimentoRobo(int direcao) {
        return false;
    }

    public boolean verificaTesouro() {
        return false;
    }

}
