import java.util.Random;

public class Combat {
    public static void combattre(Personnage joueur, Monster monster) {
        Random random = new Random();
        while (joueur.getVie() > 0 && monster.estVivant()) {
            // Les dégâts du joueur sont calculés en fonction de son arme
            double degatsJoueurBase = joueur.getDegatsMax(); // Dégâts maximum de l'arme la plus puissante
            double degatsJoueur = degatsJoueurBase + random.nextDouble() * 5; // Ajout d'un facteur aléatoire

            // Les dégâts du monstre restent aléatoires
            double degatsMonstre = random.nextInt(10) + 1;

            // Attaque du joueur
            monster.perdreVie(degatsJoueur);
            System.out.println("Vous infligez " + (int)degatsJoueur + " dégâts au monstre.");

            if (monster.estVivant()) {
                // Contre-attaque du monstre
                joueur.perdreVie(degatsMonstre);
                System.out.println("Le monstre vous inflige " + degatsMonstre + " dégâts.");
            }
        }

        if (joueur.getVie() > 0) {
            joueur.gagnerXp(monster.getXp());
            System.out.println("Vous avez vaincu le monstre et gagné " + monster.getXp() + " XP.");
        } else {
            System.out.println("Vous êtes mort !");
        }
    }
}
