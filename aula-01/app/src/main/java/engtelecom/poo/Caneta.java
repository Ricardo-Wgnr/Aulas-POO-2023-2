package engtelecom.poo;

public class Caneta {

    // Atributos
    private String cor;
    private double nivelTinta;

    // Métodos
    public void desenhar(int x0, int y0, int x1, int y1){
        // diminuir a quantidade de tinta
        double distancia = Math.sqrt((Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2)));
        double gasto = 0.2*distancia;
        if (nivelTinta >= gasto) {
            System.out.println("Desenhando em " + cor);
            nivelTinta -= gasto;
        } else {
            System.out.println("Nível de tinta insuficiente para distancia: " + distancia);
        }
    }

    public void definirCor(String c){
        cor = c;
    }

    public String obterCor(){
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(double nivelTinta) {

        if (nivelTinta < 0) {
            this.nivelTinta = 0;
        } else if (nivelTinta > 100) {
            this.nivelTinta = 100;
        } else {
            this.nivelTinta = nivelTinta;
        }

    }
}