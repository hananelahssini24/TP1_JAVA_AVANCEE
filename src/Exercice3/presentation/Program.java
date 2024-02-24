package Exercice3.presentation;

import Exercice3.metier.Avion;
import Exercice3.metier.Moto;
import Exercice3.metier.Voiture;

public class Program {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("MOD1", 2019, "CLIO", 2000);
        Moto moto = new Moto("marq1", "puiss1", "nom1", 10000.0);
        Avion avion = new Avion("comp1", 16.0, "av1", 9000000.0);
        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();
        System.out.println("\nInformations sur la voiture :");
        voiture.afficherInformations();
        System.out.println("\nInformations sur la moto :");
        moto.afficherInformations();
        System.out.println("\nInformations sur l'avion :");
        avion.afficherInformations();
    }
}
