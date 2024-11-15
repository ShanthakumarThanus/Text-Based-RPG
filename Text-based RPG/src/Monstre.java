public class Monstre {
    private String nom;
    private int vie;
    private int xp;

    public Monstre(String nom, int vie, int xp) {
        this.nom = nom;
        this.vie = vie;
        this.xp = xp;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public int getVie() { return vie; }
    public int getXp() { return xp; }

    public void perdreVie(int points) {
        this.vie -= points;
    }

    public boolean estVivant() {
        return vie > 0;
    }
}
