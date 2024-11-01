import java.util.ArrayList;
import java.util.List;

public class Inventaire {
    /*private List<Objet> objets;

    public Inventaire() {
        this.objets = new ArrayList<>();
    }

    // Ajouter un objet
    public void ajouterObjet(Objet objet) {
        objets.add(objet);
        System.out.println(objet.getNom() + " a été ajouté à l'inventaire.");
    }

    // Retirer un objet
    public void retirerObjet(Objet objet) {
        if (objets.remove(objet)) {
            System.out.println(objet.getNom() + " a été retiré de l'inventaire.");
        } else {
            System.out.println("L'objet " + objet.getNom() + " n'est pas dans l'inventaire.");
        }
    }

    // Vérifier la présence d'un objet
    public boolean contientObjet(Objet objet) {
        return objets.contains(objet);
    }

    // Afficher les détails de tous les objets de l'inventaire
    public void afficherInventaire() {
        if (objets.isEmpty()) {
            System.out.println("L'inventaire est vide.");
        } else {
            System.out.println("Contenu de l'inventaire :");
            for (Objet objet : objets) {
                objet.afficherDetails();
            }
        }
    }

    // Exemple de méthode pour utiliser une potion (si elle est dans l'inventaire)
    public void utiliserPotion(Potion potion, Personnage personnage) {
        if (objets.contains(potion)) {
            personnage.setPV(personnage.getPV() + potion.getPointsDeVieRecuperes());
            System.out.println(personnage.getNom() + " utilise une potion et récupère " + potion.getPointsDeVieRecuperes() + " PV !");
            retirerObjet(potion);
        } else {
            System.out.println("La potion n'est pas dans l'inventaire.");
        }
    }*/
}
