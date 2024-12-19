package personnage.jeu.deplacement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {
    @Test
    public void testTournerUneFois() {
        Personnage personnage = new Personnage();
        assertEquals("EST", personnage.tourner(1));
    }
    @Test
    public void testTournerDeuxFois() {
        Personnage personnage = new Personnage();
        assertEquals("SUD", personnage.tourner(2));
    }

}
