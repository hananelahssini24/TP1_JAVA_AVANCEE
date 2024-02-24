package Exercice1.presentation;

import Exercice1.metier.Compte;
public class GestionComptesApp {

    public static void main(String[] args) {
	// write your code here
        Compte c1 = new Compte(11111, "Ahmed", 20000);
        Compte c2 = new Compte(22222, "HAJAR", 30000);

        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);

        System.out.println(c1.getNum() +" " +c1.getNomClient()+" "+c1.getSolde());
        c1.setSolde(-3000);
        System.out.println(c1.getSolde());
        System.out.println(c1.toString());

        c1.afficherCompteInfo();


    }


}
