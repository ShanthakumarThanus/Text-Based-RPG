public class Bow extends Weapon{
    private static final double DAMAGE = 20; //maj : convention de nommage en majuscule pour les var type "final"
    private static final double PRICE = 10;
    private static final String NAME = "Axe";

    public Bow() {
        super(DAMAGE, PRICE, NAME);
    }

    public String asciiArt(){
        return "            4$$-.\n" +
                "             4   \".\n" +
                "             4    ^.\n" +
                "             4     $\n" +
                "             4     'b\n" +
                "             4      \"b.\n" +
                "             4        $\n" +
                "             4        $r\n" +
                "             4        $F\n" +
                "  -$b========4========$b====*P=-\n" +
                "             4       *$$F\n" +
                "             4        $$\"\n" +
                "             4       .$F\n" +
                "             4       dP\n" +
                "             4      F\n" +
                "             4     @\n" +
                "             4    .\n" +
                "             J.\n"
                ;
    }
}
