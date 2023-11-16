package produtos;

import engtelecom.poo.Dimensao;

public class SemFio extends Telefone {

    private double frquencia;
    private int canais;
    private double distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frquencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frquencia = frquencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.printf("freq: %.2f, canais: %d, distancia: %f\n", this.frquencia, this.canais, this.distancia);
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }
}
