public class Joueur extends Personnage {

    //nb entier pour stocker le nombre de upgrades/skills
    public int numAtkUpgrades, numDefUpgrades;

    //infos supplémentaires sur le joueur
    int gold, restLeft, potion;

    //tableaux pour stocker les noms des compétences, attaque et défense
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strenght"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};

    //constructeur spécifique à la classe Joueur
    public Joueur(String nom) {
        super(nom, 100, 0);
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //valeur par défaut des infos supplémentaires
        this.gold = 5;
        this.restLeft = 1;
        this.potion = 0;
        //laisser le joueur choisir une caractèristique lors de la création d'un nouveau personnage
        chooseTrait();
    }

    @Override
    public int attaquer() {
        return (int) (Math.random()*(XP/4 + numAtkUpgrades*3 + 3) + XP/10 + numAtkUpgrades*2 + numDefUpgrades + 1);
    }

    @Override
    public int seDefendre() {
        return (int) (Math.random()*(XP/4 + numDefUpgrades*3 + 3) + XP/10 + numDefUpgrades*2 + numAtkUpgrades + 1);
    }

    //laissez le joueur choisir un trait de l'un ou l'autre chemin de compétence
    public void chooseTrait() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printHeading("veuillez choisir une caractèristique : ");
        System.out.println("(1)" + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2)" + defUpgrades[numDefUpgrades]);
        //instruction pour obtenir le choix du joueur
        int input = MoteurDuJeu.readInt("->", 2);
        MoteurDuJeu.clearConsole();
        //choix entre attaque et défense
        if(input == 1 ) {
            MoteurDuJeu.printHeading("Tu as choisis " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        }
        else {
            MoteurDuJeu.printHeading("Tu as choisis " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        MoteurDuJeu.appuiePourContinuer();
    }
}
