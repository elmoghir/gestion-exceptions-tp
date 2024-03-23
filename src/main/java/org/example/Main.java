package org.example;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exercice 1
        try {
            EntierNaturel entier = new EntierNaturel(5);
            entier.setVal(3);
            entier.decrementer();
            System.out.println(entier.getVal());
            entier.setVal(-1); // Cela va générer une exception
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        // Exercice 2
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        // Exemple d'ajout de comptes
        comptes.add(new CompteCourant("12345", 1000.0, "John Doe", 500.0));
        comptes.add(new CompteEpargne("67890", 2000.0, "Jane Doe", 0.05));

        // Exemple d'opération de transfert
        try {
            CompteBancaire.transfert(comptes.get(0), comptes.get(1), 500);
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.err.println(e.getMessage());
        }
    }
}