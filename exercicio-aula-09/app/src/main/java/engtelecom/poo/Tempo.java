package engtelecom.poo;

public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;
    private int modelo;

    public Tempo() {
        zeros();
    }
    public Tempo(int horas) {
        zeros();
        this.setHoras(horas);
    }

    public Tempo(int horas, int minutos) {
        if (!verificaTempo(horas, minutos, 0, 24)) {
            zeros();
        }
    }

    public Tempo(int horas, int minutos, int segundos) {
        if (! verificaTempo(horas, minutos, segundos, 24)) {
            zeros();
        }
    }

    public Tempo(int horas, int minutos, int segundos, int modelo) {

        if (! verificaTempo(horas, minutos, segundos, modelo)) {
            zeros();
        }

    }

    private boolean verificaTempo(int horas, int minutos, int segundos, int modelo) {
        if (this.setHoras(horas) && this.setMinutos(minutos) && this.setSegundos(segundos) && this.setModelo(modelo)) {
            return true;
        }
        return false;
    }

    private void zeros() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.modelo = 24;
    }

    public String toString() {
        if (this.modelo == 12) {
            if (this.horas > 12) {
                return String.format("%02d:%02d:%02d PM", this.horas -12, this.minutos, this.segundos);
            }
            return String.format("%02d:%02d:%02d AM", this.horas, this.minutos, this.segundos);
        }
        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }

    public String toTempo(int segundos) {
        this.horas = segundos/3600;
        this.minutos = (segundos%3600) / 60;
        this.segundos = ((segundos%3600) % 60);
        return this.toString();
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
        if (horas >= 0 && horas <= 23) {
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

    public int getModelo() {
        return modelo;
    }

    public boolean setModelo(int modelo) {
        if (modelo == 12 || modelo == 24) {
            this.modelo = modelo;
            return true;
        }
        return false;
    }
}
