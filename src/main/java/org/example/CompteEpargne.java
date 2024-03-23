package org.example;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroDeCompte, double solde, String nomDuTitulaire, double tauxInteret) {
        super(numeroDeCompte, solde, nomDuTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInterets() {
        solde += solde * tauxInteret;
    }
}
