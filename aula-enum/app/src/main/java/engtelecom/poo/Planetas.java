package engtelecom.poo;

public enum Planetas {

    MERCURIO(1), VENUS(2), TERRA(3), MARTE(4),
    JUPITER(5), SATURNO(6), URANO(7), NETUNO(8);

    public final int posicao;

    Planetas(int posicao) {
        this.posicao = posicao;
    }

    public static Planetas getByPosicao(int posicao) {
        for (Planetas t: Planetas.values()) {
            if (posicao == t.posicao) {
                return t;
            }
        }
        return null;
    }

}
