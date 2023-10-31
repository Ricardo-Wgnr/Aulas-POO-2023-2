package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoboTest {

    @Test
    public void posicionarRoboNoMapaTest() {

        Area mapa = new Area(100, 100, 10);
        Robo robo = new Robo(mapa, 1, 2, 5);

        assertTrue(robo.posicionarRoboNoMapa(mapa));

    }

}
