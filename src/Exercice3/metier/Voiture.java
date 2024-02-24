package Exercice3.metier;

import java.util.Objects;

public class Voiture extends Vehicule {
    private String modele;
    private int annee;
    //
    public Voiture() {}
    //
    public Voiture(String nom, double prix,String modele, int annee) {
        super(nom,prix);
        this.modele = modele;
        this.annee = annee;
    }
    //GETTERS AND SETTERS :
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    //METHODS:
    //REDEFINITION emettreSon
    @Override
    public void emettreSon() {
        System.out.println( "La voiture vrombit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println(" Modéle "+modele+"Annee :"+annee);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", annee=" + annee +
                '}';
    }

    @Override
    public boolean equals(Object o){
        Voiture voiture = (Voiture) o;
        return annee == voiture.annee && Objects.equals(modele, voiture.modele);
    }
}
