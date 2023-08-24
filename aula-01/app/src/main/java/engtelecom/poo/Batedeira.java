package engtelecom.poo;

public class Batedeira {

    private String marca;
    private String modelo;
    private String cor;
    private int volts;
    private int potencia;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        if (volts == 110 || volts == 220) {
            this.volts = volts;
        } else {
            System.out.println("Voltagem inválida");
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
