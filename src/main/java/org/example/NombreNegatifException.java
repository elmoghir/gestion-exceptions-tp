package org.example;

// La classe d'exception personnalisée qui étend Exception
class NombreNegatifException extends Exception {
    // Attribut pour stocker la valeur négative qui a causé l'exception
    private int valeurErronee;

    // Constructeur de l'exception prenant en compte la valeur erronée
    public NombreNegatifException(int valeur) {
        super("Valeur négative non autorisée : " + valeur);
        this.valeurErronee = valeur;
    }

    // Méthode pour obtenir la valeur erronée
    public int getValeurErronee() {
        return valeurErronee;
    }
}