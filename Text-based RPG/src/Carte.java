public class Carte {
    private int[][] carte;
    private Personnage joueur;

    public Carte(Personnage joueur) {
        this.joueur = joueur;
        this.carte = new int[5][5];  // Exemple d'une carte 5x5
        initialiserCarte();
    }

    private void initialiserCarte() {
        // Initialisation des éléments de la carte (0 : vide, 1 : monstre, 2 : obstacle)
        carte[0][0] = 0; // Position initiale du joueur
        carte[4][4] = 0; // Position finale
        carte[1][1] = 1; // Monstre
        carte[2][2] = 2; // Obstacle
    }

    public void deplacerJoueur(String direction) {
        // Implémentation des déplacements (haut, bas, gauche, droite)
        // Attention : vérifier si le mouvement est possible (en fonction des obstacles)
    }

    public void rencontrerObstacleOuMonstre() {
        // Lors de la rencontre avec un monstre ou un obstacle
    }
}
