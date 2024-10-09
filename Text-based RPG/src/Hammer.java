public class Hammer extends Weapon {

    private static final double DAMAGE = 10;
    private static final double PRICE = 10;
    private static final String NAME = "Hammer";
    public Hammer() {
        super(DAMAGE, PRICE, NAME);
    }

    public String asciiArt() {
        return
                "             +-+\n" +
                        "=============| |\n" +
                        "            `:_;'";

    }
}