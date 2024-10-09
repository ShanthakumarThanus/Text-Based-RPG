public class Obstacle {

    private static final double PV = 100; //variable de classe
    private double health; //variable d'instance

    public Obstacle() {
        this.health = PV;
    }

    public void hit(double d) {
        this.health -= d;
    }
}
