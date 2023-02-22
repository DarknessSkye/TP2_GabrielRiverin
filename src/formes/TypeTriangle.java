/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
 */

package formes;

public enum TypeTriangle {
    EQUILATERAL("Equilateral"), ISOCELE("Isocele"), RECTANGLE("Rectangle"), SCALENE("Scalene");

    private String type;

    TypeTriangle(String type) {
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return getType();
    }
}
