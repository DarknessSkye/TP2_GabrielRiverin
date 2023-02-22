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

public class Cercle extends Formes {

    private int rayon;

    public Cercle(int rayon) {
        super("Cercle");
        setCouleur(COULEUR_DEFAUT);
        setRayon(rayon);
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        if (rayonEstValide(rayon)) {
            this.rayon = rayon;
        } else {
            throw new FormeException("Rayon invalide doit etre entre 1 et 30: " + rayon);
        }
    }

    @Override
    public int calculerSurface() {
        return (int) (Math.PI * rayon * rayon);
    }


    public boolean rayonEstValide(int rayon) {
        return rayon >= MIN_VAL && rayon <= MAX_VAL;
    }


    @Override
    public int calculerPerimetre() {
        return (int) (2 * Math.PI * rayon);
    }

    @Override
    public String toString() {

        return super.toString() + " " + rayon;
    }
}
