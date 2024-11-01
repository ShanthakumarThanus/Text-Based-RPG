import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class MoteurDuJeu {
    static Scanner scanner = new Scanner(System.in);
    static Joueur joueur;

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

        //creation de l'objet du nouveau joueur avec le nom en paramètre
        joueur = new Joueur(name);
    }
}
