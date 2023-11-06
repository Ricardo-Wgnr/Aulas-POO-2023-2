package engtelecom.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {

    @Test
    public void posicionaTesourosTest() {

        Area mapa = new Area(100, 100, 5);
        assertTrue(mapa.posicionaTesouros());
        Area mapa2 = new Area(0, 0, 5);
        assertFalse(mapa2.posicionaTesouros());

    }

    @Test
    public void coletarTesouroTest() {

        Area a = new Area(100, 100, 1);
        Tesouro t = new Tesouro(10, 10, 2);
        a.getTesouros().remove(0);
        a.getTesouros().add(t);

        assertEquals(t, a.coletarTesouro(10,10));
        assertEquals(t, a.coletarTesouro(5,10));
        assertEquals(t, a.coletarTesouro(10,5));
        assertEquals(t, a.coletarTesouro(5,5));
        assertEquals(t, a.coletarTesouro(1,10));
        assertEquals(t, a.coletarTesouro(10,1));
        assertEquals(t, a.coletarTesouro(1,1));
        assertNull(a.coletarTesouro(50, 50));

    }

}
