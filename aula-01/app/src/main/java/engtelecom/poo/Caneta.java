package engtelecom.poo;

public class Caneta {

    // Atributos

    private String cor;
    private double nivelTinta;

    // Métodos
    public void desenhar(int unidades){
        System.out.println("Desenhando em " + cor);
        nivelTinta = nivelTinta - ((nivelTinta*0.02)*unidades);
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
        this.nivelTinta = nivelTinta;
    }
}