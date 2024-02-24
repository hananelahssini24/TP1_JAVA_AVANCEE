package Exercice3.metier;

public class Avion extends Vehicule {
    private String compagnie;
    private double vitesseMax;
    //CONSTRUCTORS
    public Avion() {
    }
    //
    public Avion(String nom, double prix,String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }
    //
    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }



}
