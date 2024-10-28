import java.util.List;

public abstract class Personnage {
    private String nom;
    private int PV;
    private int mana = 50; // ressource magique du perso
    private int argent;
    private List<Weapon> arme;

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

    public List<Weapon> getArme() {
        return this.arme;
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

    public void setArme(List<Weapon> arme) {
        this.arme = arme;
    }
}
