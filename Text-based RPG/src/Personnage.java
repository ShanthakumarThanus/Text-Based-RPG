public class Personnage {
    private String nom;
    private int argent;
    private int xp;
    private int mana;
    private int vie;
    private String caste;

    public Personnage(String nom, String caste) {
        this.nom = nom;
        this.argent = 100;
        this.xp = 0;
        this.mana = 50;
        this.vie = 100;
        this.caste = caste;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public int getArgent() { return argent; }
    public int getXp() { return xp; }
    public int getMana() { return mana; }
    public int getVie() { return vie; }
    public String getCaste() { return caste; }

    public void gagnerXp(int points) {
        this.xp += points;
    }

    public void perdreVie(int points) {
        this.vie -= points;
    }

    public void gagnerArgent(int montant) {
        this.argent += montant;
    }

    public void consommerMana(int points) {
        this.mana -= points;
    }

    public void afficherStats() {
        System.out.println("Nom: " + nom);
        System.out.println("Caste: " + caste);
        System.out.println("Vie: " + vie);
        System.out.println("Mana: " + mana);
        System.out.println("XP: " + xp);
        System.out.println("Argent: " + argent);
    }
}
