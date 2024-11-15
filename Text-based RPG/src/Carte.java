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
            case "haut":
                if (posX > 0) posX--;
                break;
            case "bas":
                if (posX < carte.length - 1) posX++;
                break;
            case "gauche":
                if (posY > 0) posY--;
                break;
            case "droite":
                if (posY < carte[0].length - 1) posY++;
                break;
            default:
                System.out.println("Direction invalide.");
                return;
        }

        System.out.println("Vous vous déplacez vers : " + direction);
        rencontrerObstacleOuMonstre();
    }

    public void rencontrerObstacleOuMonstre() {
        int caseActuelle = carte[posX][posY];
        if (caseActuelle == 1) {
            System.out.println("Vous avez rencontré un monstre !");
            // Lancement d'un combat
            Monstre monstre = new Monstre("Gobelin", 30, 50); // Exemple
            Combat.combattre(joueur, monstre);
        } else if (caseActuelle == 2) {
            System.out.println("Vous avez rencontré un obstacle !");
            // Choisir de détruire l'obstacle ou fuir
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
