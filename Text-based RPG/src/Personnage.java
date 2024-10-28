import java.util.ArrayList;
import java.util.List;

public abstract class Personnage {
    private String nom;
    private int PV;
    private int mana = 50; // ressource magique du perso
    private int argent;
    private List<Weapon> armes;

    public Personnage(String nom, int PV, int argent) {
        this.nom = nom;
        this.PV = PV;
        this.argent = argent;
        this.armes = new ArrayList<>();
    }

    //getters
    public String getNom() {
        return this.nom;
    }

    public int getPV() {
        return this.PV;
    }

    public int getMana() {
        return this.mana;
    }

    public int getArgent() {
        return this.argent;
    }

    public List<Weapon> getArmes() {
        return this.armes;
    }

    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void setArmes(List<Weapon> armes) {
        this.arme = armes;
    }
}
