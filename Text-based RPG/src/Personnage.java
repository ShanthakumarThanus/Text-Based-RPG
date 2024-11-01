import java.util.ArrayList;
import java.util.List;

public abstract class Personnage {
    private String nom;
    private int maxHP, HP, XP;

    public Personnage(String nom, int maxHP, int XP) {
        this.nom = nom;
        this.maxHP = maxHP;
        this.XP = XP;
        this.HP = maxHP; //hit point
    }

    //getters
    /*public String getNom() {
        return this.nom;
    }*/

    public abstract int attaquer();
    public abstract int seDefendre();
}
