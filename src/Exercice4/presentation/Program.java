package Exercice4.presentation;

import Exercice4.metier.Employe;
import Exercice4.metier.Ingenieur;
import Exercice4.metier.Manager;

public class Program {
    public static void main(String[] args) {
        Employe e1 = new Ingenieur("lahssini", "hanane", "hanane@gmail.com", "06125", 30000.0, "informatique");
         System.out.println(e1.calculerSalaire());
        System.out.println(e1);
        Employe e2 = new Manager("lahssini", "janat", "janat@gmail.com", "06125", 60000.0, "marketing");
        System.out.println(e2.calculerSalaire());
        System.out.println(e2);
    }

}
