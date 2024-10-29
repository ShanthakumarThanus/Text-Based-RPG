public abstract class Objet {
    private String nom;
    private int valeur; // valeur monétaire de l'objet
    private String description;

    // Constructeur
    public Objet(String nom, int valeur, String description) {
        this.nom = nom;
        this.valeur = valeur;
        this.description = description;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Méthode pour afficher les détails de l'objet
    public void afficherDetails() {
        System.out.println(nom + ": " + description + " (Valeur : " + valeur + ")");
    }
}
