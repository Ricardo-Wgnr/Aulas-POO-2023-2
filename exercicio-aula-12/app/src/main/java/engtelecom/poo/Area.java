package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;
import java.util.Random;

public class Area {

    private int altura;
    private int largura;

    private int totalDeTesouros;
    private ArrayList<Elemento> elementos;

    public Area(int altura, int largura, int totalDeTesouros) {
        this.altura = altura;
        this.largura = largura;
        this.totalDeTesouros = totalDeTesouros;
        this.elementos = new ArrayList<>();
        this.posicionaTesouros();
    }

    public boolean posicionaTesouros() {
        if ((this.altura*this.largura) > (Tesouro.ALTURA * Tesouro.LARGURA)) {
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
            return true;
        }
        return false;
    }

    public Tesouro coletarTesouro(int x, int y) {

        // TODO mudar com base no retangulo intersecta

        boolean intersectaX = false;
        boolean intersectaY = false;
        for (int i = 0; i < this.totalDeTesouros; i++) {
            for (int j = 0; j < Robo.LARGURA; j++) {
                for (int k = 0; k < Tesouro.LARGURA; k++) {
                    if ((x + j) == (this.elementos.get(i).getPosicaoX() + k)) {
                        intersectaX = true;
                        break;
                    }
                    if (intersectaX) break;
                }
                if (intersectaX) break;
            }
            for (int j = 0; j < Robo.ALTURA; j++) {
                for (int k = 0; k < Tesouro.ALTURA; k++) {
                    if ((x - j) == (this.elementos.get(i).getPosicaoX() - k)) {
                        intersectaY = true;
                        break;
                    }
                    if (intersectaY) break;
                }
                if (intersectaY) break;
            }
            if (intersectaX && intersectaY) {
                return this.elementos.get(i);
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

    public ArrayList<Tesouro> getTesouros() {
        return elementos;
    }

    public void desenhar(Draw desenho){
        elementos.forEach(e->e.desenhar(desenho));
    }

}
