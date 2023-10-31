package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Robo {

    public static final int LARGURA = 20;
    public static final int ALTURA = 20;

    private int velocidadeX;
    private int velocidadeY;

    private int capacidadeMochila;
    private ArrayList<Tesouro> mochila;

    private int pontuacao;

    private int posicaoX;
    private int posicaoY;

    private Area mapa;

    public Robo(Area mapa, int velocidadeX, int velocidadeY, int capacidadeMochila) {
        this.mapa = mapa;

        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;

        this.posicionarRoboNoMapa(this.mapa);

        this.capacidadeMochila = capacidadeMochila;
        this.pontuacao = 0;
        this.mochila = new ArrayList<>();
    }

    //colocar robo dentro de um mapa em uma coordenada aleatória
    public boolean posicionarRoboNoMapa(Area mapa) {
        // TODO implementar

        if ((this.LARGURA*this.ALTURA) < (this.mapa.getAltura()*this.mapa.getLargura())) {
            // while (?) {}
            Random x = new Random();
            Random y = new Random();
            int posicaoX = x.nextInt(this.mapa.getLargura());
            int posicaoY = y.nextInt(this.mapa.getAltura());
        }

        return false;
    }

    public boolean adicionarTesouro(Tesouro t) {
        // TODO implementar
        return false;
    }

    public Tesouro removerTesouro(Tesouro t) {
        // TODO implementar
        return null;
    }

    public int pontuacao() {
        // TODO implementar
        return -1;
    }

    public boolean movimentar(int direcao) {
        // TODO implementar, robo pode encostar na borda, mas nao ultrapassar, sempre que ele se deslocar,
        //  retorna true, mesmo que em numero menor de casas
        return false;
    }

}
