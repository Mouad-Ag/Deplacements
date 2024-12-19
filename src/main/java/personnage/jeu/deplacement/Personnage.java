package personnage.jeu.deplacement;

public class Personnage {
    public String tourner(int i) {
        if (i % 4 == 1) return "EST";
        if (i == 2) return "SUD";
        return null;
    }
}
