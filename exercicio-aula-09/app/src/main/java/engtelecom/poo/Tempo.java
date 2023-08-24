package engtelecom.poo;

public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tempo() {

        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;

    }
    public Tempo(int horas) {

        this.horas = 0;
        this.setHoras(horas);
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int horas, int minutos) {
        this.horas = 0;
        this.setHoras(horas);
        this.minutos = 0;
        this.setMinutos(minutos);
        this.segundos = 0;
    }

    public Tempo(int horas, int minutos, int segundos) {
        this.horas = 0;
        this.setHoras(horas);
        this.minutos = 0;
        this.setMinutos(minutos);
        this.segundos = 0;
        this.setSegundos(segundos);
    }

    public String toString() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }

    public long toSegundos() {
        return (long) this.segundos + (long) this.minutos*60 + (long) this.horas*3600;
    }

    public long diferencaTempo (Tempo compara) {

        return this.toSegundos() - compara.toSegundos();
    }

    public int getHoras() {
        return horas;
    }

    public boolean setHoras(int horas) {
        if (horas >= 0 && horas <= 24) {
            this.horas = horas;
            return true;
        } else {
            return false;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            return true;
        } else {
            return false;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }
}
