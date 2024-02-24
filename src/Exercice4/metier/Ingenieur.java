package Exercice4.metier;

public class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public Ingenieur() {
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        double salaireR = salaire + salaire* 0.15;
        return salaireR;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                "specialite='" + specialite + '\'' +
                "} " + super.toString();
    }
}

