public class Destructible {

    private double health;

    public Destructible(double h) {
        this.health = h;
    }

    public void hit(double d) {
        this.health -= d;
    }
}
