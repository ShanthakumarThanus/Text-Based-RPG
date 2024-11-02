import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class MoteurDuJeu {
    static Scanner scanner = new Scanner(System.in);
    static Joueur joueur;
    public static boolean isRunning;

    public static int place = 0, act;
    public static String[] places = {"Endroit 1", "Endroit 2", "Endroit 3", "Endroit 4"};

    //méthode pour récupérer la saisie de l'utilisateur
    public static int readInt(String prompt, int userChoises) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Veuillez saisir un chiffre !");
            }
        } while(input < 1 || input > userChoises);
        return input;
    }

    //méthode pour clear la console
    public static void clearConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //méthode pour séparer le contenu
    public static void printSeparator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //méthode pour print l'en-tête
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //méthode permettant de mettre en pause le jeu tant que l'utilisateur appuie sur une entrée
    public static void appuiePourContinuer() {
        System.out.println("\n Appuyer pour continuer");
        scanner.next();
    }

    //méthode pour démarrer le jeu
    public static void startGame() {
        boolean nameSet = false;
        String name;
        //affichage du titre
        clearConsole();
        printSeparator(40);
        printSeparator(40);
        System.out.println("Mon Text-Based-RPG ! (j'ai pas trouvé de nom pour l'instant, désolé !");
        printSeparator(30);
        printSeparator(40);
        appuiePourContinuer();

        //obtention du nom du joueur
        do {
            clearConsole();
            printHeading("Quel est ton nom ?");
            name = scanner.next();
            //demande au joueur s'il voudrait corriger son nom
            clearConsole();
            printHeading("Ton nom est " + name + ".\nEst-ce correcte ?");
            System.out.println("(1) Oui !");
            System.out.println("(2) Non, j'ai envie de le changer.");
            int input = readInt("-> ", 2);
            if(input == 1)
                nameSet = true;
        } while (!nameSet);

        //afficher l'introduction de l'histoire
        joueur = new Joueur(name);

        //afficher la première partie
        Histoire.printFirstActIntro();

        //creation de l'objet du nouveau joueur avec le nom en paramètre
        joueur = new Joueur(name);

        //déclarer isRunning à true pour que la boucle continue
        isRunning = true;

        //démarrage de la boucle du jeu
        gameLoop();
    }

    //méthode pour que le joueur puisse continuer son aventure sur le jeu
    public static void continueAdventure() {

    }

    //affichage des infos à propos du personnage
    public static void characterInfo() {
        clearConsole();
        printHeading("INFORMATION SUR VOTRE PERSONNAGE");
        System.out.println(joueur.nom + "\tHP : " + joueur.HP + "/" + joueur.maxHP);
        printSeparator(20);
        System.out.println("XP : " + joueur.XP);
        printSeparator(20);

        //affichage du caractèristique choisi
        if(joueur.numAtkUpgrades > 0) {
            System.out.println("Caractèristique d'attaque : " + joueur.atkUpgrades[joueur.numAtkUpgrades - 1]);
        }
        if(joueur.numDefUpgrades > 0) {
            System.out.println("Caractèristique de défense : " + joueur.defUpgrades[joueur.numDefUpgrades - 1]);
        }

        appuiePourContinuer();
    }

    //affichage du menu principal
    public static void printMenu() {
        clearConsole();
        printHeading(places[place]);
        System.out.println("Veuillez choisir ce que vous comptez faire : ");
        printSeparator(20);
        System.out.println("(1) Continuer votre aventure");
        System.out.println("(2) Information sur votre personnage");
        System.out.println("(3) Quitter le jeu");
    }

    //boucle activité du jeu
    public static void gameLoop() {
        while(isRunning) {
            printMenu();
            int input = readInt("->", 3);
            if(input == 1) {
                continueAdventure();
            } else if(input == 2) {
                characterInfo();
            } else {
                isRunning = false;
            }
        }
    }
}