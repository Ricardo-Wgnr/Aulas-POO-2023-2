package engtelecom.poo;

public class Lampada {

    private String cor;
    private double vidaUtil;
    private boolean acesa;
    private int volts;

    //modelo, fabricante, preco, temperatura

    public void acenderLampada() {
        acesa = true;
        System.out.println("Lampada acesa");
    }

    public void apagarLampada() {
        acesa = false;
        System.out.println("Lampada apagada");
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}
