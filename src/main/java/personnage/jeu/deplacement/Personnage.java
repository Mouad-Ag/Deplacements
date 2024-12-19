package personnage.jeu.deplacement;

public class Personnage {
    public String tourner(int i) {
        i = i % 4;
        if (i == 1) return "EST";
        if (i == 2) return "SUD";
        if (i == 3) return "OUEST";
        if (i == 0) return "NORD";
        return null;
    }
}
