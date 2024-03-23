package org.example;

public class CompteBancaire {
    protected String numeroDeCompte;
    protected double solde;
    protected String nomDuTitulaire;

    public CompteBancaire(String numeroDeCompte, double solde, String nomDuTitulaire) {
        this.numeroDeCompte = numeroDeCompte;
        this.solde = solde;
        this.nomDuTitulaire = nomDuTitulaire;
    }

    public void depot(double montant) {
        solde += montant;
    }

    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le retrait demandé.");
        }
        solde -= montant;
    }

    public void afficherSolde() {
        System.out.println("Le solde du compte est de : " + solde + " EUR");
    }

    public static void transfert(CompteBancaire source, CompteBancaire destination, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (source == null || destination == null) {
            throw new CompteInexistantException("L'un des comptes spécifiés n'existe pas.");
        }
        source.retrait(montant);
        destination.depot(montant);
    }
}

