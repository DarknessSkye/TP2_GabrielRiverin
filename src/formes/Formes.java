/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
 */

package formes;

/**
 * Formes - TP1
 *
 * @author Riverin Gabriel
 * @version V1.1
 */

public abstract class Formes implements Comparable<Formes> {

    /**
     * Nom de la forme
     */
    private String nom;

    /**
     * Couleur de la forme
     */
    private Couleur couleur;

    /**
     * Couleur defaut de la forme
     */
    public static final Couleur COULEUR_DEFAUT = Couleur.ROUGE;

    /**
     * Valeur minimale pour un côté ou un rayon
     */
    public static final int MIN_VAL = 1;

    /**
     * Valeur maximale pour un côté ou un rayon
     */
    public static final int MAX_VAL = 30;

    /**
     * Constructeur de forme
     * @param nom
     */
    public Formes(String nom) {
        this.nom = nom;
    }

    /**
     * Sert à calculer la surface lorsqu'elle est implementer
     * @return
     */
    public abstract int calculerSurface();

    /**
     * Sert à calculer le périmètre lorsqu'elle est implementer
     * @return
     */
    public abstract int calculerPerimetre();

    /**
     * Attribue une couleur à la forme
     * @param couleur
     */
    public void setCouleur(Couleur couleur) {
        if (couleur == null) {
            couleur = this.couleur;
        }
        this.couleur = couleur;
    }

    /**
     * Retourne la couleur de la forme
     * @return
     */
    public Couleur getCouleur() {
        return couleur;
    }

    /**
     * Retourne le nom de la forme
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Compare deux formes par la surface, la couleur et le nom
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formes formes = (Formes) o;
        return calculerSurface() == formes.calculerSurface() && couleur == formes.couleur && nom == formes.nom;
    }

    /**
     * S'occupe de l'écriture des informations que chaque forme possède
     * @return
     */
    @Override
    public String toString() {
        return nom + " " + couleur + " " + calculerPerimetre() + ", " + calculerSurface();
    }

    /**
     * Trie les formes par leur nom et par leur couleur
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Formes o) {
        if (this.nom.equals(o.nom)) {
            return this.couleur.compareTo(o.couleur);
        }
        return this.nom.compareTo(o.nom);
    }
}
