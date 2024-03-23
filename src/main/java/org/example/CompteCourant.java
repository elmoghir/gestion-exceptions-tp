package org.example;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numeroDeCompte, double solde, String nomDuTitulaire, double decouvertAutorise) {
        super(numeroDeCompte, solde, nomDuTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant > solde + decouvertAutorise) {
            throw new FondsInsuffisantsException("Fonds insuffisants, découvert non autorisé.");
        }
        solde -= montant;
    }
}