import java.util.Random;

public class Combat {
    public static void combattre(Personnage joueur, Monstre monstre) {
        Random random = new Random();
        while (joueur.getVie() > 0 && monstre.estVivant()) {
            int degatsJoueur = random.nextInt(10) + 1; // Dégâts aléatoires du joueur
            int degatsMonstre = random.nextInt(10) + 1; // Dégâts aléatoires du monstre

            // Attaque du joueur
            monstre.perdreVie(degatsJoueur);
            System.out.println("Vous infligez " + degatsJoueur + " dégâts au monstre.");

            if (monstre.estVivant()) {
                // Contre-attaque du monstre
                joueur.perdreVie(degatsMonstre);
                System.out.println("Le monstre vous inflige " + degatsMonstre + " dégâts.");
            }
        }

        if (joueur.getVie() > 0) {
            joueur.gagnerXp(monstre.getXp());
            System.out.println("Vous avez vaincu le monstre et gagné " + monstre.getXp() + " XP.");
        } else {
            System.out.println("Vous êtes mort !");
        }
    }
}
