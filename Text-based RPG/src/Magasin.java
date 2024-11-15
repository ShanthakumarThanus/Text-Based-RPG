import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magasin {
    private List<String> armesDisponibles;

    public Magasin() {
        armesDisponibles = new ArrayList<>();
        armesDisponibles.add("Épée");
        armesDisponibles.add("Arc");
        armesDisponibles.add("Bâton magique");
    }

    public void afficherArmes() {
        System.out.println("Armes disponibles à l'achat :");
        for (int i = 0; i < armesDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + armesDisponibles.get(i));
        }
    }

    public void acheterArme(Personnage joueur) {
        Scanner scanner = new Scanner(System.in);
        afficherArmes();
        System.out.print("Choisissez une arme (1-" + armesDisponibles.size() + "): ");
        int choix = scanner.nextInt();
        if (choix > 0 && choix <= armesDisponibles.size()) {
            if (joueur.getArgent() >= 50) {
                joueur.gagnerArgent(-50);  // Dépense 50 d'argent
                System.out.println("Vous avez acheté " + armesDisponibles.get(choix - 1));
            } else {
                System.out.println("Vous n'avez pas assez d'argent!");
            }
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
