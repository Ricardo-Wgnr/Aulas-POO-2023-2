package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;


public class Parede extends Elemento{

    public static final int LARGURA = 30;
    public static final int ALTURA = 10;

    public Parede(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }

    @Override
    public void desenhar(Draw d) {
        // d.setPenColor(Color.GREEN);
        // d.filledRectangle(posicaoX, posicaoY, LARGURA, ALTURA);
        d.picture(posicaoX, posicaoY, "wallDim.png");
    }



}
