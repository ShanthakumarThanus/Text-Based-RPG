public class Monster extends Destructible {

    private String nom;
    private int vie;
    private int xp;

    private static final double LIFE = 50; // vie initiale
    private double currentLife; //vie actuelle, modifiable

    public Monster(String nom, int vie, int xp) {
        super(LIFE);
        this.currentLife = LIFE; // pv actuelle égale au pv max
        this.nom = nom;
        this.vie = vie;
        this.xp = xp;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public double getCurrentLife() { return currentLife; }
    public int getXp() { return xp; }

    public void perdreVie(double points) {
        if (points < 0) {
            throw new IllegalArgumentException("Les points de dégâts doivent être positifs.");
        }
        this.currentLife -= points; // Réduction de la vie actuelle
        if (this.currentLife < 0) {
            this.currentLife = 0; // descend pas en dessous de 0
        }
    }


    public boolean estVivant() {
        return currentLife > 0;
    }
}
