/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
 */

package formes;

public enum Couleur {
    BLEU, JAUNE, NOIR, ORANGE, ROUGE, VERT;

    public String getNom() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getNom();
    }
}
