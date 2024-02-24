package Exercice1.metier;

public class Compte {
    private long num;
    private String nomClient;
    private double solde;

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        if (solde > 0)
        this.solde = solde;
    }

    public Compte() {

    }

    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public void afficherCompteInfo(){
        System.out.println("Numéro de compte est : " + num +
                "\nNom du client est : " + nomClient +
                "\nSolde est : " + solde);    }

    public void retirer(double montant) {
        if (montant > solde) {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        } else {
            solde -= montant;
            System.out.println(montant + " retiré. Nouveau solde : " + solde);
        }
    }
    public void deposer(double montant) {
        solde += montant;
        System.out.println(montant + " déposé. Nouveau solde : " + solde);
    }

    @Override
    public String toString() {
        return "Numéro de compte est : " + num + "\n" +
                "Nom du client est :" + nomClient + "\n" +
                "Solde est :" + solde;
    }
}
