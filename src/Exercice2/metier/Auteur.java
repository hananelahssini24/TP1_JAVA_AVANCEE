package Exercice2.metier;

public class Auteur extends Personne {
    private int numAuteur;

    public int getNumAuteur() {
        return this.numAuteur;
    }

    public void setNumAuteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }

    public Auteur() {
    }

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public String toString() {
        return super.toString() + " numAuteur=" + this.numAuteur;
    }
}
