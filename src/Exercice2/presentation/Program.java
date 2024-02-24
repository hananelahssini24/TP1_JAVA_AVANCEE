package Exercice2.presentation;

import Exercice2.metier.Adherent;
import Exercice2.metier.Auteur;
import Exercice2.metier.Livre;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Auteur au1 = new Auteur("lahssini", "hanane", "hanane@gmail.com", "0645127896", 30, 1);
        System.out.println(au1);
        Adherent ad1 = new Adherent("lahssini", "hanane", "hanane@gmail.com", "0645127896", 30, 1);
        System.out.println(ad1);
        Livre liv1 = new Livre(1, "thefour", au1);
        System.out.println(liv1);
    }
}