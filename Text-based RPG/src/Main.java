public class Main {

    public static void main(String[] args) {
        WeaponStore store = new WeaponStore();
        /*for(Weapon w : store.getWeapons()) {
            System.out.println(w.asciiArt());
        }*/
        store.printWeapons();
    }
}