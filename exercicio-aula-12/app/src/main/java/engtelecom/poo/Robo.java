package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;
import java.util.Random;

public class Robo extends Elemento{

    public static final int LARGURA = 20;
    public static final int ALTURA = 20;
    public static final int CIMA = 1;
    public static final int DIREITA = 2;
    public static final int BAIXO = 3;
    public static final int ESQUERDA = 4;

    private int velocidadeX;
    private int velocidadeY;

    private int capacidadeMochila;
    private ArrayList<Tesouro> mochila;

    private int pontuacao;

    private Area mapa;

    public Robo(Area mapa, int posicaoX, int posicaoY, int velocidadeX, int velocidadeY, int capacidadeMochila) {
        super(posicaoX,posicaoY);
        this.mapa = mapa;

        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;

        this.capacidadeMochila = capacidadeMochila;
        this.pontuacao = 0;
        this.mochila = new ArrayList<>();
    }

//    public boolean posicionarRoboNoMapa() {
//
//        if ((Robo.LARGURA*Robo.ALTURA) < (this.mapa.getAltura()*this.mapa.getLargura())) {
//            Random x = new Random();
//            Random y = new Random();
//            int posicaoX = x.nextInt(this.mapa.getLargura());
//            int posicaoY = y.nextInt(this.mapa.getAltura());
//            while (((posicaoY - Robo.ALTURA) < 0) || ((posicaoX + Robo.LARGURA) > this.mapa.getLargura())) {
//                posicaoY = y.nextInt(this.mapa.getAltura());
//                posicaoX = x.nextInt(this.mapa.getLargura());
//            }
//            this.posicaoX = posicaoX;
//            this.posicaoY = posicaoY;
//            return true;
//        }
//        return false;
//    }

    public void desenhar(Draw desenho) {

        desenho.picture(posicaoX,posicaoY, "robotDim.png");

    }

    public Tesouro removerTesouro(Tesouro t) {
        if (!this.mochila.isEmpty()) {
            for (int i = 0; i < this.mochila.size(); i++) {
                if (this.mochila.get(i).equals(t)) {
                    this.mochila.remove(t);
                    return t;
                }
            }
        }
        return null;
    }

    public int pontuacao() {
        // TODO implementar
        return -1;
    }

    public boolean mochilaCheia() {
        return this.mochila.size() == this.capacidadeMochila;
    }

    public boolean cavar () {
        if (!mochilaCheia()) {
            Tesouro t = this.mapa.coletarTesouro(this.posicaoX, this.posicaoY);
            if (t != null) {
                this.mochila.add(t);
                this.mapa.getElementos().remove(t);
                return true;
            }
        }
        return false;
    }

    public boolean movimentar(int direcao) {
        int posicaoX0 = this.posicaoX;
        int posicaoY0 = this.posicaoY;
        if (direcao == CIMA) {
            int teste = this.velocidadeY + this.posicaoY;
            if (teste <= this.mapa.getAltura()) {
                this.posicaoY = teste;
                if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                    this.posicaoX = posicaoX0;
                    this.posicaoY = posicaoY0;
                    return false;
                }
                return true;
            } else {
                int diferenca = teste - this.mapa.getAltura();
                this.posicaoY = teste - diferenca;
                if (diferenca < this.velocidadeY) {
                    if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                        this.posicaoX = posicaoX0;
                        this.posicaoY = posicaoY0;
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }

        } else if (direcao == DIREITA) {
            int teste = this.velocidadeX + this.posicaoX;
            if (teste <= this.mapa.getLargura()) {
                this.posicaoX = teste;
                if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                    this.posicaoX = posicaoX0;
                    this.posicaoY = posicaoY0;
                    return false;
                }
                return true;
            } else {
                int diferenca = teste - this.mapa.getLargura();
                this.posicaoX = teste - diferenca;
                if (diferenca < this.velocidadeX) {
                    if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                        this.posicaoX = posicaoX0;
                        this.posicaoY = posicaoY0;
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }

        } else if (direcao == BAIXO) {
            int teste = this.posicaoY - velocidadeY;
            if (teste >= 0) {
                this.posicaoY = teste;
                if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                    this.posicaoX = posicaoX0;
                    this.posicaoY = posicaoY0;
                    return false;
                }
                return true;
            } else {
                this.posicaoY = 0;
                if (Math.abs(teste) < this.velocidadeY) {
                    if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                        this.posicaoX = posicaoX0;
                        this.posicaoY = posicaoY0;
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }

        } else {
            int teste = this.posicaoX - velocidadeX;
            if (teste >= 0) {
                this.posicaoX = teste;
                if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                    this.posicaoX = posicaoX0;
                    this.posicaoY = posicaoY0;
                    return false;
                }
                return true;
            } else {
                this.posicaoX = 0;
                if (Math.abs(teste) < this.velocidadeX) {
                    if (this.mapa.verificaParede(this.posicaoX, this.posicaoY)) {
                        this.posicaoX = posicaoX0;
                        this.posicaoY = posicaoY0;
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
