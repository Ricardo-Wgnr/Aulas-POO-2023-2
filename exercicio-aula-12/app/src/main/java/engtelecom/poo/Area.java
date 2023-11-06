package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Area {

    private int altura;
    private int largura;

    private int totalDeTesouros;
    private ArrayList<Tesouro> tesouros;

    public Area(int altura, int largura, int totalDeTesouros) {
        this.altura = altura;
        this.largura = largura;
        this.totalDeTesouros = totalDeTesouros;
        this.tesouros = new ArrayList<>();
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
                this.tesouros.add(new Tesouro(posicaoX, posicaoY, valor));
            }
            return true;
        }
        return false;
    }

    public Tesouro coletarTesouro(int x, int y) {
        boolean intersectaX = false;
        boolean intersectaY = false;
        for (int i = 0; i < this.totalDeTesouros; i++) {
            for (int j = 0; j < Robo.LARGURA; j++) {
                for (int k = 0; k < Tesouro.LARGURA; k++) {
                    if ((x + j) == (this.tesouros.get(i).getPosicaoX() + k)) {
                        intersectaX = true;
                        break;
                    }
                    if (intersectaX) break;
                }
                if (intersectaX) break;
            }
            for (int j = 0; j < Robo.ALTURA; j++) {
                for (int k = 0; k < Tesouro.ALTURA; k++) {
                    if ((x - j) == (this.tesouros.get(i).getPosicaoX() - k)) {
                        intersectaY = true;
                        break;
                    }
                    if (intersectaY) break;
                }
                if (intersectaY) break;
            }
            if (intersectaX && intersectaY) {
                return this.tesouros.get(i);
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
        return tesouros;
    }
}
