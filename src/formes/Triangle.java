/*
420-202 – TP2 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
Lien GIT Hub : https://github.com/DarknessSkye/TP2_GabrielRiverin/commits/main
 */

package formes;

import exceptions.FormeException;

import java.util.Arrays;

/**
 * Triangle - TP1
 *
 * @author Riverin Gabriel
 * @version V1.1
 */
public class Triangle extends Forme {
    /**
     * Côté A du triangle
     */
    private int coteA;
    /**
     * Côté B du triangle
     */
    private int coteB;
    /**
     * Côté C du triangle
     */
    private int coteC;

    /**
     * Constructeur du triangle
     * @param coteA
     * @param coteB
     * @param coteC
     */
    public Triangle(int coteA, int coteB, int coteC) {
        super("Triangle");
        setCouleur(COULEUR_DEFAUT);
        if (coteEstValide(coteA) && coteEstValide(coteB) && coteEstValide(coteC)) {
            this.coteA = coteA;
            this.coteB = coteB;
            this.coteC = coteC;
        } else {
            throw new FormeException("Coté invalide doit etre entre 1 et 30");
        }
    }

    /**
     * Vérifie si un côté est valide
     * @param cote
     * @return
     */
    public boolean coteEstValide(int cote) {
        return cote >= MIN_VAL && cote <= MAX_VAL;
    }

    /**
     * Retourne le côté A du triangle
     * @return
     */
    public int getCoteA() {
        return coteA;
    }

    /**
     * Retourne le côté B du triangle
     * @return
     */
    public int getCoteB() {
        return coteB;
    }

    /**
     * Retourne le côté C du triangle
     * @return
     */
    public int getCoteC() {
        return coteC;
    }

    /**
     * Vérifie si la somme de deux côtés d'un triangle est plus grand que le plus grand côté
     * @param coteA
     * @param coteB
     * @param coteC
     * @return
     */
    public boolean estTriangle(int coteA, int coteB, int coteC) {
        if (coteA > coteB + coteB || coteB > coteA + coteC || coteC > coteA + coteB) {
            throw new FormeException("La plus grande longueur doit être est inférieure à la somme des longueurs des deux autres côtés.");
        } else {
            return true;
        }
    }

    /**
     * Vérifie si un triangle est rectangle
     * @return
     */
    public boolean estRectangle() {
        int[] tab = new int[]{coteA, coteB, coteC};
        if (getCotesTries(tab)[2] == (int) Math.sqrt(Math.pow(getCotesTries(tab)[0], 2) + Math.pow(getCotesTries(tab)[1], 2))) {
            return true;
        }
        return false;
    }

    /**
     * Trie les côtés du plus petit au plus grand
     * @param tab
     * @return
     */
    private int[] getCotesTries(int[] tab) {
        Arrays.sort(tab);
        return tab;
    }

    /**
     * Retourne le type du triangle Rectangle, Isocèle, Équilatéral ou Scalene
     * @return
     */
    public String getType() {
        if (estRectangle()) {
            return TypeTriangle.RECTANGLE.getType();
        } else if (getNbrCoteEgaux(coteA) == 2 || getNbrCoteEgaux(coteB) == 2) {
            return TypeTriangle.ISOCELE.getType();
        } else if (getNbrCoteEgaux(coteA) == 3) {
            return TypeTriangle.EQUILATERAL.getType();
        }
        return TypeTriangle.SCALENE.getType();
    }

    /**
     * Calcule le périmètre du triangle
     * @return
     */
    @Override
    public int calculerPerimetre() {
        return coteA + coteB + coteC;
    }

    /**
     * Calcule la surface du triangle
     * @return
     */
    @Override
    public int calculerSurface() {
        double p = calculerPerimetre() / 2.0;
        double aire = (Math.sqrt(p * (p - coteA) * (p - coteB) * (p - coteC)));
        return (int) aire;

    }

    /**
     * Retourne le nombre de côtés égaux
     * @param cote
     * @return
     */
    private int getNbrCoteEgaux(int cote) {
        int nbCoteEgaux = 0;
        int[] tab = new int[]{coteA, coteB, coteC};

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == cote) {
                nbCoteEgaux += 1;
            }
        }
        return nbCoteEgaux;
    }

    /**
     * S'occupe de l'écriture des informations que chaque forme possède et celle propre au triangle
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + ", " + coteA + ", " + coteB + ", " + coteC;
    }

}
