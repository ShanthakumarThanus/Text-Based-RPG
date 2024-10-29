public class Arme extends Objet {
    private int degats;

    public Arme(String nom, int valeur, String description, int degats) {
        super(nom, valeur, description);
        this.degats = degats;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Dégâts : " + degats);
    }
}
