import java.util.ArrayList;
import java.util.Scanner;

public class WeaponStore {

    private ArrayList<Weapon> weapons;

    public WeaponStore() {
        this.weapons = new ArrayList<>();
        this.weapons.add(new Axe());
        this.weapons.add(new Hammer());
        this.weapons.add(new Bow());
    }

    public ArrayList<Weapon> getWeapons() {
        return this.weapons;
    }

    public void printWeapons() {
        int i = 1;
        for (Weapon w : this.weapons) {
            System.out.println("[" + i + "]" + w.toString() + "\n" + w.asciiArt());
            i++;
        }
    }

    public void acheterArme(Personnage joueur) {
        Scanner scanner = new Scanner(System.in);
        printWeapons(); // Affiche les armes disponibles
        int choix = -1;

        while (true) {
            System.out.print("Choisissez une arme (1-" + weapons.size() + ") ou 0 pour annuler : ");
            if (scanner.hasNextInt()) { // Vérifie si la saisie est un entier
                choix = scanner.nextInt();

                if (choix == 0) {
                    System.out.println("Achat annulé.");
                    return;
                }

                if (choix > 0 && choix <= weapons.size()) { // Vérifie si l'index est valide
                    break; // Sort de la boucle si le choix est valide
                } else {
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et " + weapons.size());
                }
            } else {
                System.out.println("Entrée invalide. Veuillez saisir un nombre.");
                scanner.next(); // Consomme l'entrée incorrecte
            }
        }

        // Récupération de l'arme choisie
        Weapon armeChoisie = weapons.get(choix - 1); // Indice ajusté
        double prixArme = armeChoisie.getPrice();

        // Vérification des fonds du joueur
        if (joueur.getArgent() >= prixArme) {
            joueur.gagnerArgent(-prixArme);  // Déduit le prix de l'arme
            joueur.ajouterArme(armeChoisie); // Ajoute l'arme à l'inventaire
            System.out.println("Vous avez acheté l'arme : " + armeChoisie.getName());
        } else {
            System.out.println("Vous n'avez pas assez d'argent pour acheter cette arme.");
        }
    }

}
