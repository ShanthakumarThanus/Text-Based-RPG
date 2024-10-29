public class Potion extends Objet {
    private int pointsDeVieRecuperes;

    public Potion(String nom, int valeur, String description, int pointsDeVieRecuperes) {
        super(nom, valeur, description);
        this.pointsDeVieRecuperes = pointsDeVieRecuperes;
    }

    public int getPointsDeVieRecuperes() {
        return pointsDeVieRecuperes;
    }

    public void setPointsDeVieRecuperes(int pointsDeVieRecuperes) {
        this.pointsDeVieRecuperes = pointsDeVieRecuperes;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Points de vie récupérés : " + pointsDeVieRecuperes);
    }
}
