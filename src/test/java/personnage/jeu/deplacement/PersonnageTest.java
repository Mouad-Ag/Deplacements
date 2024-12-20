package personnage.jeu.deplacement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {
    private  Personnage p;
    @BeforeEach
    public void setUp() {
        p = new Personnage();
    }

    @AfterEach
    public void tearDown() {
        p = null;
    }

    @Test
    public void testTournerUneFois() {
        assertEquals("EST", p.tourner(1));
    }
    @Test
    public void testTournerDeuxFois() {
        assertEquals("SUD", p.tourner(2));
    }
    @Test
    public void testTournerTroisFois() {
        assertEquals("OUEST", p.tourner(3));
    }
    @Test
    public void testTournerQuatreFois() {
        assertEquals("NORD", p.tourner(4));
    }
    @Test
    public void testTournerDouzeFois() {
        assertEquals("NORD", p.tourner(12));
    }
    @Test
    public void testTournerMoinsUneFois() {
        assertEquals("OUEST", p.tourner(-1));
    }
    @Test
    public void testTournerMoinsDixHuitFois() {
        assertEquals("SUD", p.tourner(-18));
    }
}
