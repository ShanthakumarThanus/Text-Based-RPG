import java.util.ArrayList;
import java.util.List;

public class Personnage {

    private String nom;
    private double argent;
    private int xp;
    private int mana;
    private double vie;
    private String caste;
    private List<Weapon> weapons;

    public Personnage(String nom, String caste) {
        this.nom = nom;
        this.argent = 10.0;
        this.xp = 0;
        this.mana = 50;
        this.vie = 100;
        this.caste = caste;
        this.weapons = new ArrayList<>();
    }

    // Getters et setters
    public String getNom() { return nom; }
    public double getArgent() { return argent; }
    public int getXp() { return xp; }
    public int getMana() { return mana; }
    public double getVie() { return vie; }
    public String getCaste() { return caste; }

    public void gagnerXp(int points) {
        this.xp += points;
    }

    public void perdreVie(double points) {
        this.vie -= points;
    }

    public void gagnerArgent(double montant) {
        this.argent += montant;
    }

    public void consommerMana(int points) {
        this.mana -= points;
    }

    public void ajouterArme(Weapon weapon) {
        this.weapons.add(weapon);
        System.out.println("L'arme " + weapon.getName() + "a été ajoutée à votre inventaire.");
    }

    public double getDegatsMax() {
        if (!weapons.isEmpty()) {
            // pour détruire un mur, on choisi l'arme la plus puissante présent dans l'inventaire du joueur
            return weapons.stream().mapToDouble(Weapon::getDamage).max().orElse(5);
        }
        return 5; // Dégâts de base si aucune arme n'est équipée, avec ses poings, le pauvre :(
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
