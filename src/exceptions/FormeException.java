/*
420-202 – TP2 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
Lien GIT Hub : https://github.com/DarknessSkye/TP2_GabrielRiverin/commits/main
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
