package Exercice3.metier;
public class Vehicule {
    private String nom;
    private double prix;
    //CONSTRUCTOERS:
    public Vehicule() {}
    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    //GETTERS AND SETTARS :
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    //METHODS :
    //EMETTRESON
    public void emettreSon() {
        System.out.println( "Le v�hicule �met un son inconnu.");
    }
    //
    public void afficherInformations(){
        System.out.print( "Nom= est :" + nom + ", Prix est :" + prix);
    }


}
