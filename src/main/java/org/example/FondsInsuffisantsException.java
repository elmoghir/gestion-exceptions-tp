package org.example;

class FondsInsuffisantsException extends Exception {
    public FondsInsuffisantsException(String message) {
        super(message);
    }
}

class CompteInexistantException extends Exception {
    public CompteInexistantException(String message) {
        super(message);
    }
}

