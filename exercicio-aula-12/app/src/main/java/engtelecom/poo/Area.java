package engtelecom.poo;

import java.util.ArrayList;

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

    public void posicionaTesouros() {
        // TODO implementar
    }

    public Tesouro coletarTesouro(int x, int y) {
        // TODO implementar
        return null;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }
}
