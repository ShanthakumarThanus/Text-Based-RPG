import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WeaponStore store = new WeaponStore();
        /*for (Weapon w : store.getWeapons()) {
            System.out.println(w.asciiArt());
        }*/
        store.printWeapons();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Salut ! ");
        System.out.println("Es-tu prêts à rejoindre l'aventure ? ");
        System.out.println("D'abord... ");
        System.out.println("Choisis ton pseudo : ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}