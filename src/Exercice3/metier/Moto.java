package Exercice3.metier;

public class Moto extends Vehicule {
    private String marque;
    private String puissance;

    public Moto() {
    }

    public Moto(String marque, String puissance, String nom, double prix) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getPuissance() {
        return this.puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public void emettreSon() {
        System.out.println("La moto rugit.");
    }
}