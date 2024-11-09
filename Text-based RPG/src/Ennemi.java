public class Ennemi extends Personnage {

    //variable pour stocker l'XP actuel du joueur, afin d'ajuster les caractéristiques de l'ennemi en fonction du niveau du joueur
    int playerXP;

    //constructeur spécifique à la classe Ennemi
    public Ennemi(String nom, int playerXP) {
        super(nom, (int) (Math.random()*playerXP + playerXP/3 + 5), (int) (Math.random()*(playerXP/4 + 2) + 1));
        this.playerXP = playerXP;
    }

    //méthode d'attaque et défense de la classe Ennemi
    @Override
    public int attaquer() {
        return 0;
    }

    @Override
    public int seDefendre() {
        return 0;
    }
}
