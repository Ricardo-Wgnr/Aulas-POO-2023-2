package engtelecom.poo;

import java.util.ArrayList;

public class Jogador {

    private String nome;
    private ArrayList<Carro> garagem;
    private ArrayList<Motor> estante;
    private Carro carroAtual;

    public Jogador(String n, Carro c) {
        this.nome = n;
        this.carroAtual = c;
        garagem = new ArrayList<>();
        estante = new ArrayList<>();
    }

    public boolean adicionarCarro (Carro c) {
        if (garagem.size() < App.TOTAL_CARROS) {
            garagem.add(c);
            return true;
        }
        return false;
    }

    public boolean adicionarPeca (Motor m) {
        if (estante.size() < App.TOTAL_PECAS) {
            estante.add(m);
            return true;
        }
        return false;
    }

    public Carro getCarroAtual() {
        return carroAtual;
    }

    public void setCarroAtual(Carro carroAtual) {
        this.carroAtual = carroAtual;
    }

    public int totalDeCarrosNaGaragem () {
        return garagem.size();
    }

    public int totalDeMotoresNaEstante () {
        return estante.size();
    }

    public boolean comprarCarro (Carro novo) {
        if (garagem.size() < App.TOTAL_CARROS) {
            garagem.add(carroAtual);
            carroAtual = novo;
            return true;
        }
        return false;
    }

    public boolean comprarMotor (Motor novo) {
        if (estante.size() < App.TOTAL_PECAS) {
            estante.add(carroAtual.getPropulsor());
            carroAtual.setPropulsor(novo);
            return true;
        }
        return false;
    }

    public boolean venderCarro(int posicao) {
        if (garagem.size() == 0 || (posicao >= garagem.size()) || (posicao < 0)) {
            return false;
        }
        garagem.remove(posicao);
        return true;
    }
}
