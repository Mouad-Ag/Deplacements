package personnage.jeu.deplacement;

public class Personnage {
    public String tourner(int i) {
        if (i % 4 == 1) return "EST";
        if (i % 4 == 2) return "SUD";
        if (i % 4 == 3) return "OUEST";
        if (i == 4) return "NORD";
        return null;
    }
}
