package personnage.jeu.deplacement;

public class Personnage {
    public String tourner(int i) {
        if (i % 4 == 1) return "EST";
        return null;
    }
}
