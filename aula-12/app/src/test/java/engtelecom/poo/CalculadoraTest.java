package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculadoraTest {

    @Test
    public void testarSomaPositivos() {

        assertEquals(3, Calculadora.soma(1, 2));
        assertEquals(3, Calculadora.soma(2, 1));
        assertEquals(1, Calculadora.soma(0, 1));
        assertEquals(1, Calculadora.soma(1, 0));
        assertEquals(0, Calculadora.soma(0, 0));
    }

    @Test
    public void testarSomaNegativos() {

        assertEquals(-3, Calculadora.soma(-2, -1));
        assertEquals(-3, Calculadora.soma(-1, -2));
        assertEquals(-1, Calculadora.soma(0, -1));
        assertEquals(-1, Calculadora.soma(-1, 0));
        assertEquals(1, Calculadora.soma(2, -1));
        assertEquals(1, Calculadora.soma(-1, 2));

    }

    @Test
    public void testarTipoDoTrianguloEquilatero() {

        assertEquals("Equilátero", Calculadora.tipoDoTriangulo(3, 3, 3));

    }

    @Test
    public void testarTipoDoTrianguloEscaleno() {

        assertEquals("Escaleno", Calculadora.tipoDoTriangulo(5, 10, 9));

    }

    @Test
    public void testarTipoDoTrianguloIsosceles() {

        assertEquals("Isósceles", Calculadora.tipoDoTriangulo(2, 4, 4));
        assertEquals("Isósceles", Calculadora.tipoDoTriangulo(4, 4, 2));
        assertEquals("Isósceles", Calculadora.tipoDoTriangulo(4, 2, 4));

    }

    @Test
    public void testarTipoDoTrianguloNaoETriangulo() {

        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(1, 2, 3));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(1, 3, 2));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(2, 1, 3));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(2, 3, 1));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(3, 1, 2));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(3, 2, 1));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(1, 1, 5));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(1, 5, 1));
        assertEquals("Não é um triângulo", Calculadora.tipoDoTriangulo(5, 1, 1));

    }
}
