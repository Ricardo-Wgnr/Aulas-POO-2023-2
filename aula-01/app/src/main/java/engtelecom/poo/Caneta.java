package engtelecom.poo;

public class Caneta {

    // Atributos

    private String cor;
    private double nivelTinta;
    private double nivelTintaInicial;

    // Métodos
    public void desenhar(int unidades){
        System.out.println("Desenhando em " + cor);
        nivelTinta = nivelTinta - ((0.02*nivelTintaInicial)*unidades);
        System.out.print("Nível de tinta em: " + (100*nivelTinta)/nivelTintaInicial);
        System.out.println("%");
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
        if (this.nivelTinta <= 0) {
            nivelTintaInicial = nivelTinta;
        }
        this.nivelTinta = nivelTinta;

    }
}