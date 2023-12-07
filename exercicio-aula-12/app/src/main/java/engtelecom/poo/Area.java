package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Area {

    public static final int TOTAL_PAREDES = 3;

    private int altura;
    private int largura;

    private int totalDeTesouros;
    private ArrayList<Elemento> elementos;

    public Area(int altura, int largura, int totalDeTesouros) {
        this.altura = altura;
        this.largura = largura;
        this.totalDeTesouros = totalDeTesouros;
        this.elementos = new ArrayList<>();
        this.posicionaElementos();
    }

    public boolean posicionaElementos() {
        if (((this.altura*this.largura) > (Tesouro.ALTURA * Tesouro.LARGURA)) && ((this.altura*this.largura > Parede.ALTURA*Parede.LARGURA))) {
            for (int i = 0; i < this.totalDeTesouros; i++) {
                Random x = new Random();
                Random y = new Random();
                Random v = new Random();
                int posicaoX = x.nextInt(this.largura);
                int posicaoY = y.nextInt(this.altura);
                int valor = v.nextInt(50);
                while (((posicaoY - Tesouro.ALTURA) < 0) || ((posicaoX + Tesouro.LARGURA) > this.largura) || (valor == 0)) {
                    posicaoY = y.nextInt(this.altura);
                    posicaoX = x.nextInt(this.largura);
                    valor = v.nextInt(50);
                }
                this.elementos.add(new Tesouro(posicaoX, posicaoY, valor));
            }
            for (int i = 0; i < TOTAL_PAREDES; i++) {
                Random x = new Random();
                Random y = new Random();
                Random v = new Random();
                int posicaoX = x.nextInt(this.largura);
                int posicaoY = y.nextInt(this.altura);
                while (((posicaoY - Tesouro.ALTURA) < 0) || ((posicaoX + Tesouro.LARGURA) > this.largura)) {
                    posicaoY = y.nextInt(this.altura);
                    posicaoX = x.nextInt(this.largura);
                }
                this.elementos.add(new Parede(posicaoX, posicaoY));
            }

            return true;
        }
        return false;
    }

    public boolean verificaParede (int x, int y) {
        Rectangle robo = new Rectangle(x, y, Robo.LARGURA, Robo.ALTURA);

        for (int k = 0; k < this.elementos.size(); k++) {
            if (elementos.get(k) instanceof Parede) {
                Rectangle parede = new Rectangle(this.elementos.get(k).posicaoX, this.elementos.get(k).posicaoY, Parede.LARGURA, Parede.ALTURA);
                if (robo.intersects(parede)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Tesouro coletarTesouro(int x, int y) {
        Rectangle robo = new Rectangle(x, y, Robo.LARGURA, Robo.ALTURA);

        for (int i = 0; i < this.totalDeTesouros; i++) {
            if (this.elementos.get(i) instanceof  Tesouro) {
                Rectangle tesouro = new Rectangle(this.elementos.get(i).posicaoX,this.elem, entos.get(i).posicaoY, Tesouro.LARGURA, Tesouro.ALTURA);
                if (robo.intersects(tesouro)) {
                    return (Tesouro) this.elementos.get(i);
                }
            }
        }
        return null;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void desenhar(Draw desenho){
        elementos.forEach(e->e.desenhar(desenho));
    }

}
