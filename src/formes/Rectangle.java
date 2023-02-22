/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
 */
package formes;

import exceptions.FormeException;

/**
 * Rectangle - TP1
 *
 * @author Riverin Gabriel
 * @version V1.1
 */

public class Rectangle extends Formes {

    /**
     * Largeur du rectangle
     */
    private int largeur;
    /**
     * Hauteur du rectangle
     */
    private int hauteur;


    /**
     * Constructeur du rectangle
     *
     * @param largeur du rectangle
     * @param hauteur du rectangle
     */
    public Rectangle(int largeur, int hauteur) {
        super("Rectangle");
        setCouleur(COULEUR_DEFAUT);
        setHauteur(hauteur);
        setLargeur(largeur);
    }

    /**
     * Modifie la largeur du rectangle
     *
     * @param largeur du rectangle
     */
    public void setLargeur(int largeur) {
        if (largeurEstValide(largeur)) {
            this.largeur = largeur;
        } else {
            throw new FormeException("largeur invalide doit etre entre 1 et 30: " + largeur);
        }
    }

    /**
     * Modifie la hauteur du rectangle
     *
     * @param hauteur du rectangle
     */
    public void setHauteur(int hauteur) {
        if (hauteurEstValide(hauteur)) {
            this.hauteur = hauteur;
        } else {
            throw new FormeException("hauteur invalide doit etre entre 1 et 30: " + hauteur);
        }
    }

    /**
     * Retourne la largeur du rectangle
     *
     * @return la largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Retourne la hauteur du rectangle
     *
     * @return la hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * calcule la surface du rectangle
     *
     * @return la surface
     */
    @Override
    public int calculerSurface() {
        return (hauteur * largeur);
    }

    /**
     * Vérifie si la largeur est valide
     *
     * @param largeur du rectangle
     * @return vrai si la largeur est entre 1 et 30 sinon faux
     */
    public boolean largeurEstValide(int largeur) {
        return largeur >= MIN_VAL && largeur <= MAX_VAL;
    }

    /**
     * Vérifie si la hauteur est valide
     *
     * @param hauteur du rectangle
     * @return vrai si la hauteur est entre 1 et 30 sinon faux
     */
    public boolean hauteurEstValide(int hauteur) {
        return hauteur >= MIN_VAL && hauteur <= MAX_VAL;
    }

    /**
     * Calcule le périmètre du rectangle
     *
     * @return le périmètre
     */
    @Override
    public int calculerPerimetre() {
        return ((2 * hauteur) + (2 * largeur));
    }

    /**
     * S'occupe de l'écriture du rectangle
     *
     * @return la string du rectangle
     */
    @Override
    public String toString() {

        return super.toString() + " " + hauteur + ", " + largeur;
    }


}
