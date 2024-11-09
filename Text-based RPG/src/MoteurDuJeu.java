
import java.util.Scanner;

public class MoteurDuJeu {
    static Scanner scanner = new Scanner(System.in);
    static Joueur joueur;
    public static boolean isRunning;

    //évenements
    public static String[] encounters = {"Bataille","Bataille","Bataille","Bataille","Repos"};

    //les ennemis
    public static String[] enemies = {"Ogre", "Ogre", "Gobelin", "Gobelin", "Dragon"};

    //élements de l'histoire du jeu
    public static int place = 0, act = 1;
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

    //méthode qui gère les chapitres du jeu
    public static void checkAct() {
        //changer le chapitre selon l'xp du joueur
        if(joueur.XP >= 10 && act == 1) {
            //level up le chapitre et changement de l'endroit où se situe le personnage
            act = 2;
            place = 1;
            //affichage de l'outro du chapitre actuel
            Histoire.printFirstActOutro();
            //level up le joueur
            joueur.chooseTrait();
            //affichage de l'intro du chapitre suivant
            Histoire.printSecondActIntro();
            //nouvelles valeurs pour les ennemis
            enemies[0] = "Mercenaire";
            enemies[1] = "Gobelin";
            enemies[2] = "Meute de loups";
            enemies[3] = "Acolyte de l'empereur";
            enemies[4] = "Vilain inconnu";
            //nouvelles valeurs pour les ennemis
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Pause";
            encounters[4] = "Aller à la boutique";
        }else if(joueur.XP >= 50 && act == 2) {
            //level up le chapitre et changement de l'endroit où se situe le personnage
            act = 3;
            place = 2;
            //affichage de l'outro du chapitre actuel
            Histoire.printSecondActOutro();
            //level up le joueur
            joueur.chooseTrait();
            //affichage de l'intro du chapitre suivant
            Histoire.printThirdActIntro();
            //nouvelles valeurs pour les ennemis
            enemies[0] = "Mercenaire";
            enemies[1] = "Gobelin";
            enemies[2] = "Meute de loups";
            enemies[3] = "Acolyte de l'empereur";
            enemies[4] = "Vilain inconnu";
            //nouvelles valeurs pour les ennemis
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Pause";
            encounters[4] = "Aller à la boutique";
            // regénération du PV du joueur
            joueur.HP = joueur.maxHP;
        } else if (joueur.XP >= 100 && act == 3) {
            act = 4;
            place = 3;
            Histoire.printThirdActOutro();
            joueur.chooseTrait();
            Histoire.printFourthActIntro();
            // regénération du PV du joueur
            joueur.HP = joueur.maxHP;
            //appel du dernier combat
            //finalBattle();
        }
    }

    public static void randomEncounter() {
        // nombre aléatoire entre 0 et la taille du tableau "encounters"
        int encounter = (int) (Math.random()* encounters.length);
        //appel des méthodes selon les conditions
        if(encounters[encounter].equals("Bataille")) {
            randomBattle();
        } else if(encounters[encounter].equals("Repos")) {
            //takeRest();
        } else {
            //shop();
        }
    }

    //méthode pour que le joueur puisse continuer son aventure sur le jeu
    public static void continueAdventure() {
        //vérifier si le niveau doit être incrémenté
        checkAct();
        //vérifier si le jeu n'est pas encore au dernier niveau
        if(act != 4)
            randomEncounter();
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

    //bataille aléatoire
    public static void randomBattle() {
        clearConsole();
        printHeading("Tu viens de rencontrer un ennemi, tu dois te battre contre lui !");
        appuiePourContinuer();
        //création d'un ennemi aléatoire
        battle(new Ennemi(enemies[(int)(Math.random()*enemies.length)], joueur.XP));
    }

    //méthode qui gère les combats
    public static void battle(Ennemi ennemi) {
        while(true) {
            clearConsole();
            printHeading(ennemi.nom + "\nHP" + ennemi.HP + "/" + ennemi.maxHP);
            printHeading(joueur.nom + "\nHP" + ennemi.HP + "/" + joueur.maxHP);
            System.out.println("Choisi une action :");
            System.out.println("(1) Se battre\n(2) Utiliser une potion\n(3) Fuir");
            int input = readInt("->", 3);
            //mécanisme d'action selon le choix du joueur
            if(input == 1) {
                //SE BATTRE
                //calcul des dégats causés (dmg) et des dégats pris (dmgTook) (dégats (dmg) causés par l'ennemi au joueur)
                int dmg = joueur.attaquer() - ennemi.seDefendre();
                int dmgTook = ennemi.attaquer() - joueur.seDefendre();
                //vérifier si le dégât causé et le dégat reçu n'est pas une valeur négatif
                if(dmgTook < 0) {
                    //ajout de quelques dégâts si le joueur se défend bien pour équilibrer l'attaque et la défense selon la caractéristique choisi par le joueur
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if(dmg < 0) {
                    dmg = 0;
                }
                //dégâts pour chaque parties
                joueur.HP -= dmgTook;
                ennemi.HP -= dmg;
                //affichage les infos à propos de la partie courante de la bataille
                clearConsole();
                printHeading("BATAILLE");
                System.out.println("L'" + ennemi.nom + "vous a mis " + dmgTook + ".");
                appuiePourContinuer();
                //vérifier si le joueur est toujours en vie
                if(joueur.HP <= 0) {
                    playerDied(); //méthode qui met fin au jeu
                    break;
                } else if(ennemi.HP <= 0) {
                    //le joueur a gagné
                    clearConsole();
                    printHeading("Tu as battus " + ennemi.nom + "!");
                    //augmentation de l'xp du joueur
                    joueur.XP += ennemi.XP;
                    System.out.println("Tu as obtenus " + ennemi.XP + "XP ! Bravo !");
                    appuiePourContinuer();
                    break;
                }
            } else if(input == 2) {
                //UTILISER UNE POTION
            } else {
                //FUIR
                clearConsole();
                //vérifier que le joueur n'est pas contre le boss final
                if(act != 4) {
                    //mis une chance de 35% de s'enfuir
                    if(Math.random()*10 + 1 <= 3.5) {
                        printHeading("Tu as réussi à t'enfuir de " + ennemi.nom + "!");
                        appuiePourContinuer();
                        break;
                    } else {
                        printHeading("Tu n'as malheureusement pas réussi à t'enfuir.");
                        //calcul des dégâts reçu par le joueur
                        int dmgTook = ennemi.attaquer();
                        System.out.println("Tu t'es pris " + dmgTook + " de dégât lorsque tu as essayé de t'enfuir !");
                        appuiePourContinuer();
                        //vérifier si le joueur est toujours en vie
                        if(joueur.HP <= 0)
                            playerDied();
                    }
                } else {
                    printHeading("TU NE PEUX PAS T'ÉCHAPPER DE L'EMPEREUR !!!");
                    appuiePourContinuer();
                }
            }
        }
    }

    //méthode appelé lorsque le joueur est mort
    public static void playerDied() {
        clearConsole();
        printHeading("Tu es mort...");
        printHeading("Tu as obtenus " + joueur.XP + "XP durant ton aventure. Essaye de faire mieux la prochaine fois !");
        isRunning = false;
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
