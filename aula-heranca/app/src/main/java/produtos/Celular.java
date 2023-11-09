package produtos;

import engtelecom.poo.Dimensao;

public class Celular extends SemFio{

    private String sistemaOperacional;

    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frquencia, int canais, double distancia, String sistemaOperacional) {
        super(codigo, numSerie, modelo, peso, dim, frquencia, canais, distancia);
        this.sistemaOperacional = sistemaOperacional;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Sistema operacional: " + this.sistemaOperacional);
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
