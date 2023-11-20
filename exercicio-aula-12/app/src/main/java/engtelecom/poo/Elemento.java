package engtelecom.poo;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import edu.princeton.cs.algs4.Draw;

// nao posso instanciar ela, serve somente de base para herdarem dela
public abstract class Elemento {

    protected int posicaoX;
    protected int posicaoY;


    public Elemento(int posicaoX, int posicaoY) {
        // se nao estiver, posiciona o robo no centro do mapa
        this.setPosicaoX(posicaoX);
        this.setPosicaoY(posicaoY);
    }


    // Método abstract -> Quem herda de Elemento, obrigatoriamente terá que implementar seu proprio método desenhar
    public abstract void desenhar(Draw d);

    public boolean isColisao(Elemento e){
        return false;
    }

    public boolean setPosicaoX(int posicaoX) {
        if ((posicaoX >= App.MIN_X) && (posicaoX <= App.MAX_X)) {
            this.posicaoX = posicaoX;
            return true;
        }
        this.posicaoX = App.MAX_X/2;
        return false;
    }

    public boolean setPosicaoY(int posicaoY) {
        if ((posicaoY >= App.MIN_Y) && (posicaoY <= App.MAX_Y)) {
            this.posicaoY = posicaoY;
            return true;
        }
        this.posicaoY = App.MAX_Y/2;
        return false;
    }
}
