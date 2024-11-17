public class Arme {

    private final String NOM;
    private final int DEGAT;

    public Arme(String NOM, int DEGAT) {
        this.NOM = NOM;
        this.DEGAT = DEGAT;
    }

    public String getNOM() {
        return this.NOM;
    }

    public int getDEGAT() {
        return this.DEGAT;
    }

    public String toString() {
        return "\nNom de l'arme : " + this.NOM + "\nDégat : " + this.DEGAT;
    }
}
