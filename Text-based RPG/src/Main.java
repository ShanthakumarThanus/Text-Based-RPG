import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeaponStore store = new WeaponStore();

        try {
            System.out.println("Salut !");
            Thread.sleep(1000); // Pause d'1 seconde
            System.out.println("Es-tu prêt à rejoindre l'aventure ?");
            Thread.sleep(1000);
            System.out.println("D'abord...");
            Thread.sleep(1000);
            System.out.println("Choisis ton pseudo : ");
            String name = scanner.nextLine();
            System.out.println("Parfait ! Bienvenue " + name + " !");
            Thread.sleep(1000);

            System.out.println("Voici les armes qui sont à ta disposition actuellement :");
            Thread.sleep(1000);
            store.printWeapons();
        } catch (InterruptedException e) {
            System.err.println("Une erreur s'est produite pendant l'affichage.");
        } finally {
            scanner.close(); 
        }
    }
}