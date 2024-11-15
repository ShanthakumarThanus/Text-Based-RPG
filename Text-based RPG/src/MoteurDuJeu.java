import java.util.Scanner;

public class MoteurDuJeu {
    private static Personnage joueur;
    private static Carte carte;
    private static Magasin magasin;

    public void GameStart() {
        Scanner scanner = new Scanner(System.in);

        // Création du personnage
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Choisissez une caste (Sorcier, Elfe, Guerrier): ");
        String caste = scanner.nextLine();
        joueur = new Personnage(nom, caste);

        magasin = new Magasin();
        carte = new Carte(joueur);

        // Boucle de jeu
        while (joueur.getVie() > 0) {
            System.out.println("\n1. Consulter les stats");
            System.out.println("2. Acheter une arme");
            System.out.println("3. Déplacer le joueur");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    joueur.afficherStats();
                    break;
                case 2:
                    magasin.acheterArme(joueur);
                    break;
                case 3:
                    // Déplacement
                    System.out.print("Entrez direction (haut, bas, gauche, droite): ");
                    String direction = scanner.next();
                    carte.deplacerJoueur(direction);
                    break;
                case 4:
                    System.out.println("Merci d'avoir joué !");
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}

