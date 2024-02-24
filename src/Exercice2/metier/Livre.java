package Exercice2.metier;

public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int iSBN) {
        this.ISBN = iSBN;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return this.auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Livre() {
    }

    public Livre(int iSBN, String titre, Auteur auteur) {
        this.ISBN = iSBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    public String toString() {
        return "ISBN=" + this.ISBN + ", titre=" + this.titre + ", auteur=" + this.auteur.toString();
    }
}

