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
        System.out.println("Choose a name : ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}