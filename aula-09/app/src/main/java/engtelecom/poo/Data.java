package engtelecom.poo;

public class Data {

    // Atributos

    private int dia;
    private int mes;
    private int ano;

    // Método construtor

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = 1;
        this.setMes(mes);
        this.ano = ano;
    }

    public int diferencaEmDias(Data d) {

        return this.dia - d.dia;

    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        //se mes nao for valido, mantem atual
        if (mes > 0 && mes < 13) {
            this.mes = mes;
            return true;
        } else {
            return false;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
