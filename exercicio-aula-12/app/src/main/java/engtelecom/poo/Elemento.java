package engtelecom.poo;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import edu.princeton.cs.algs4.Draw;

// nao posso instanciar ela, serve somente de base para herdarem dela
public abstract class Elemento {

    protected int posicaoX;
    protected int posicaoY;


    public Elemento(int posicaoX, int posicaoY) {
        // TODO garantir que a posicao x e y estao dentro dos limites do mapa
        // se nao estiver, posiciona o robo no centro do mapa
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }


    // Método abstract -> Quem herda de Elemento, obrigatoriamente terá que implementar seu proprio método desenhar
    public abstract void desenhar(Draw d);

    public boolean isColisao(Elemento e){
        return false;
    }

}
