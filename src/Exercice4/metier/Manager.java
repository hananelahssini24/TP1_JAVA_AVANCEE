package Exercice4.metier;

public class Manager extends Employe {
    private String service;

    public Manager() {
    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double calculerSalaire() {
        double salaireR = salaire + salaire* 0.2;
        return salaireR;
    }

    @Override
    public String toString() {
        return super.toString()+ " service='" + service + '\'' + "} ";
    }
}

