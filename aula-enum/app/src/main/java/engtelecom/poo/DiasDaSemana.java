package engtelecom.poo;

public enum DiasDaSemana {

    DOMINGO(0), SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6);

    public final int codigo;

    DiasDaSemana(int codigo) {
        this.codigo = codigo;
    }

    public static DiasDaSemana getByCodigo (int codigo) {
        for (DiasDaSemana d: DiasDaSemana.values()) {
            if (codigo == d.codigo) {
                return d;
            }
        }
        return null;
    }
}
