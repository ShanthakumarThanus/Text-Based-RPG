
//classe servant à afficher chaques parties de l'histoire du jeu RPG
public class Histoire {

    public static void printIntro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("HISTOIRE");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous êtes un joueur prisonnier dans un donjon et votre objectif est de s'en sortir !");
        System.out.println("Sur votre chemin, vous allez rencontrer des monstres coriace qui seront de plus en plus dangereux, ainsi que des obstacles.");
        System.out.println("Maintenant c'est à vous d'aller à l'action pour retrouver votre liberté ! Prêt à relever ce défis ?!");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printFirstActIntro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 1 - Introduction");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous êtes entrain d'essayer de sortir de votre cellule, mais soudain, un monstre s'apperçois de vos mouvement suspect... ");
        System.out.println("C'est un endroit très dangereux. On dit que peu de gens en sont ressorties vivant de coin.");
        System.out.println("Assez décourageant n'est-ce pas ? Haha... BREF,tu agiras malgrè ces contraintes, pour qu'on puisse enfin une vie prospère. *lâche une larme* ");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printFirstActOutro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 1 - Outro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous l'avez fait ! Félicitations pour avoir traversé ce coin mystérieux dont personne ne connais réellement ce qui se cache. Vous êtes toujours en envie !");
        System.out.println("\n Cette étape vous a fait gagné de l'expérience, ce qui signifie que vous avez appris à développer une autre caractèristique.");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printSecondActIntro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 2 - Intro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous commencez à traverser la frontière de cet endroit dangereux.");
        System.out.println("Vous avez collecté de l'or sur les monstres vous avez combattu à travers votre chemin.");
        System.out.println("\n Vous savez exactement où se situe le château de l'empereur mais vous devez d'abord traverser ce village abandonné. Mais attention, ce village contient des explosifs !");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printSecondActOutro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 2 - Outro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous avez à présent traversé ce coin tant redouté.");
        System.out.println("Vous vous situer à quelques heures de votre destination final, le château de l'empereur !");
        System.out.println("Vous savez que vous ne pouvez rester ici, alors vous faite une pause pour récupérer de l'énergie.");
        System.out.println("\n Vous avez obtenue la capacité à apprendre une autre caractéristique.");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printThirdActIntro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 3 - Intro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 3");
        System.out.println("Partie 3");
        System.out.println("\nPartie 3");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printThirdActOutro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 3 - Outro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 3");
        System.out.println("Partie 3");
        System.out.println("Partie 3");
        System.out.println("\n Partie 3");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printFourthActIntro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 4 - Intro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous êtes entrain de vous introduire dans le château de l'empereur");
        System.out.println("Partie 4");
        System.out.println("Partie 4");
        System.out.println("\n P4");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printFourthActOutro() {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Partie 4 - Intro");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Vous avez réussi à s'introduire dans le château de l'empereur");
        System.out.println("Partie 4");
        System.out.println("Partie 4");
        System.out.println("\n Winner");
        MoteurDuJeu.appuiePourContinuer();
    }

    public static void printEnd(Joueur joueur) {
        MoteurDuJeu.clearConsole();
        MoteurDuJeu.printSeparator(30);
        System.out.println("Félicitations, " + joueur.nom + "! Vous avez réussi à battre l'empereur et libéré votre village !");
        MoteurDuJeu.printSeparator(30);
        System.out.println("Crédit : ....");
    }
}
