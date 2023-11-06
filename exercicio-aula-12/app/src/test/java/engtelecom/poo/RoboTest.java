package engtelecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoboTest {

    @Test
    public void posicionarRoboNoMapaTest() {

        Area mapa = new Area(100, 100, 10);
        Robo robo = new Robo(mapa, 1, 2, 5);
        Robo robo2 = new Robo(new Area(0,0, 5), 1,2,5);

        assertTrue(robo.posicionarRoboNoMapa());
        assertFalse(robo2.posicionarRoboNoMapa());

    }

    @Test
    public void adicionarTesouroTest() {

        Tesouro t = new Tesouro(50, 50, 10);
        Robo r = new Robo(new Area(100, 100, 5), 1, 2, 2);
        assertTrue(r.adicionarTesouro(t));
        assertTrue(r.adicionarTesouro(t));
        assertFalse(r.adicionarTesouro(t));

    }

    @Test
    public void removerTesouroTest() {

        Tesouro t1 = new Tesouro(50, 50, 2);
        Tesouro t2 = new Tesouro(50, 50, 2);
        Robo r = new Robo(new Area(100, 100, 5), 1, 2, 2);
        r.adicionarTesouro(t1);
        assertEquals(t1, r.removerTesouro(t1));
        assertNull(r.removerTesouro(t2));

    }

    @Test
    public void movimentarTest() {

        Robo r = new Robo(new Area(100, 100, 5), 1, 2, 2);
        assertTrue(r.movimentar(1));
        assertTrue(r.movimentar(2));
        assertTrue(r.movimentar(3));
        assertTrue(r.movimentar(4));

        for (int i = 0; i < 102; i++) {
            r.movimentar(1);
            if (i == 101) {
                assertFalse(r.movimentar(1));
            }
        }

        for (int i = 0; i < 102; i++) {
            r.movimentar(2);
            if (i == 101) {
                assertFalse(r.movimentar(2));
            }
        }

        for (int i = 0; i < 102; i++) {
            r.movimentar(3);
            if (i == 101) {
                assertFalse(r.movimentar(3));
            }
        }


        for (int i = 0; i < 102; i++) {
            r.movimentar(4);
            if (i == 101) {
                assertFalse(r.movimentar(4));
            }
        }
    }

}





















