package engtelecom.poo;

/**
 * Classe utilitária para realizar cálculos
 */
public class Calculadora {

    /**
     * Faz a soma dos dois parâmetros que foram informados
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da soma
     */
    public static int soma (int a, int b) {
        return a+b;
    }

    /**
     * Irá retornar uma String informando o tipo do triângulo de acordo com as dimensões dos lados
     * @param ladoA dimensão do lado A
     * @param ladoB dimensão do lado B
     * @param ladoC dimensão do lado C
     * @return "Equilátero" para 3 lados iguais. "Escaleno" para três lados diferentes. "Isósceles" para dois lados iguais.
     * "Não é um triângulo" se os valores informados não formarem um triângulo.
     */
    public static String tipoDoTriangulo(int ladoA, int ladoB, int ladoC) {

        // TODO implementar esse método

        if (Math.abs(ladoA - ladoB) <= ladoC && (ladoA + ladoB) > ladoC
                && Math.abs(ladoA - ladoC) <= ladoB && (ladoA + ladoC) > ladoB
                && Math.abs(ladoB - ladoC) <= ladoA && (ladoB + ladoC) > ladoA) {

            if (ladoA == ladoB && ladoA == ladoC) {
                return "Equilátero";
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }

        } else {
            return "Não é um triângulo";
        }

    }

}
