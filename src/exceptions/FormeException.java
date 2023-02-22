/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
 */

package exceptions;

public class FormeException extends IllegalArgumentException {
    public FormeException(){
        super();
    }

    public FormeException(String message) {
        super(message);
    }
}
