package engtelecom.poo;

public class Carro {

    private String marca;
    private Motor propulsor;

    public Carro (String marca, Motor motor) {
        this.marca = marca;
        this.propulsor = motor;
    }

    public void acelerar (int v) {

    }

    public void trocarMotor (Motor m) {
        this.propulsor = m;
    }

    public Motor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Motor propulsor) {
        this.propulsor = propulsor;
    }
}
