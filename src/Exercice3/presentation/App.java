package Exercice3.presentation;
import Exercice3.metier.Avion;
import Exercice3.metier.Vehicule;
import Exercice3.metier.Voiture;
public class App {
    private static void afficherSon(Vehicule v){
        v.emettreSon();
    }
    //FINAL : ON PEUT PAS REDEFINIR
    public static void main(String[] args) {
        //PPLOYMORPHISME
        Vehicule[] vehicules = new Vehicule[5];
        Vehicule v1 = new Voiture("v1", 2000, "M1", 2022);
        Vehicule v2 = new Voiture("v1", 2000, "M1", 2022);
        Vehicule v3 = new Avion("N2", 33333333, "C1", 1200);
        Vehicule v4 = new Avion("N2", 33333333, "C1", 1200);
        Vehicule v5 = new Voiture("v1", 2000, "M1", 2022);
        afficherSon(v1);
        afficherSon(v2);
        afficherSon(v3);
        afficherSon(v4);
        afficherSon(v5);
        /*
        for (Vehicule v : vehicules) {
            if (v instanceof Voiture) {
                ((Voiture) v).emettreSon();
            } else
                ((Avion) v).emettreSon();
        }*/


    }
}