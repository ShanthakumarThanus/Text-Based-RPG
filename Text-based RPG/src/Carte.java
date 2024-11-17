import java.util.Scanner;

public class Carte {
    private int[][] carte;
    private Personnage joueur;
    private int posX, posY;  // Position actuelle du joueur

    public Carte(Personnage joueur) {
        this.joueur = joueur;
        this.carte = new int[5][5];  // Carte 5x5
        this.posX = 0;  // Position du joueur en haut à gauche
        this.posY = 0;
        initialiserCarte();
    }

    private void initialiserCarte() {
        // Initialisation de la carte
        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                carte[i][j] = 0;  // Par défaut, tout est vide
            }
        }

        // Placer quelques monstres et obstacles
        carte[1][1] = 1; // Monstre à [1,1]
        carte[2][2] = 2; // Obstacle à [2,2]
        carte[4][4] = 0; // Position finale à [4,4]
    }

    public void deplacerJoueur(String direction) {
        switch (direction) {
            case "z":
                if (posX > 0) posX--;
                break;
            case "s":
                if (posX < carte.length - 1) posX++;
                break;
            case "q":
                if (posY > 0) posY--;
                break;
            case "d":
                if (posY < carte[0].length - 1) posY++;
                break;
            case "e" :
                System.out.println("------------------");
                break;
            default:
                System.out.println("Direction invalide.");
                return;
        }

        if (!direction.equals("e")) {
            System.out.println("Vous vous déplacez vers : " + direction);
            rencontrerObstacleOuMonstre();
        }
    }

    public void rencontrerObstacleOuMonstre() {
        Scanner scanner = new Scanner(System.in);
        int caseActuelle = carte[posX][posY];
        if (caseActuelle == 1) {
            System.out.println("Vous avez rencontré un monstre !");
            // Lancement d'un combat
            Monstre monstre = new Monstre("Gobelin", 30, 50); // Exemple
            Combat.combattre(joueur, monstre);
        } else if (caseActuelle == 2) {
            System.out.println("Vous avez rencontré un obstacle !");
            Obstacle obstacle = new Obstacle();
            // Choisir de détruire l'obstacle ou fuir
            System.out.println("Vous souhaitez détruire l'obstacle (1) ou.... fuir ?! (2)");
            int choix = scanner.nextInt();
            if (choix == 1) {
                int degats = joueur.getDegatsMax(); // récupération du dégat max actuel que peut faire le joueur
                obstacle.hit(degats);
                System.out.println("Vous avez infligé " + degats + " points de dégâts à l'obstacle.");

                if(obstacle.health <= 0) {
                    System.out.println("L'obstacle a été détruit !");
                    carte[posX][posY] = 0; // maintenant la case est marquée comme vide
                } else {
                    System.out.println("L'obstacle résiste encore ! Points de vie restants : " + obstacle.health);
                }
            } else {
                System.out.println("Vous avez décidé de fuir ! Peut-être que vous devriez acheter une arme ?");
            }

        } else if (posX == 4 && posY == 4) {
            System.out.println("Félicitations, vous avez atteint la sortie !");
        }
    }

    public void afficherCarte() {
        System.out.println("Carte du donjon :");
        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (i == posX && j == posY) {
                    System.out.print("P ");  // P pour joueur
                } else {
                    System.out.print(carte[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
