/*
420-202 – TP2 – Traitement de données orienté objet
Groupe : 1 lundi & mercredi
Nom : Riverin
Prénom : Gabriel
DA : 2244454
Lien GIT Hub : https://github.com/DarknessSkye/TP2_GabrielRiverin/commits/main
 */

package formes;

import java.util.ArrayList;
import java.util.Random;

public class VecteurFormes {

    private ArrayList<Forme> vecteurFormes;

    public VecteurFormes() {
        this.vecteurFormes = new ArrayList<Forme>();
    }

    private void addForme(Forme formes, Couleur couleur) {

    }

    public ArrayList<Forme> getVecteur() {
        return vecteurFormes;
    }

    public void melanger() {
        for (int i = (vecteurFormes.size() - 1); i > 0; i--) {
            int nbAleatoire = getNombreAleatoireEntreBorne(0, i);

            if (i != nbAleatoire) {
                swap(nbAleatoire, i);
            }
        }
    }

    private void swap(int a, int b) {
        Forme f1 = vecteurFormes.get(b);
        Forme f2 = vecteurFormes.get(a);

        Forme formeTemporaire = vecteurFormes.get(b);
        f1 = f2;
        f2 = formeTemporaire;
    }

    public static int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max doit être plus grand que min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private void permuter(int a, int b) {

    }

    public void remplir(int nbFormesVoulues) {
        Couleur[] tabCouleur = new Couleur[]{Couleur.ROUGE, Couleur.VERT, Couleur.BLEU, Couleur.JAUNE, Couleur.NOIR, Couleur.ORANGE};

        Forme f;
        int comteur = 0;

        if (nbFormesVoulues > 0) {
            for (int i = 0; i < nbFormesVoulues; i++) {
                for (int j = 0; j < tabCouleur.length; j++) {
                    if (comteur == 0) {

                    } else if (comteur == 1) {
                        f = new Rectangle(3, 3);
                        f.setCouleur(tabCouleur[j]);
                        vecteurFormes.add(f);
                        comteur++;
                    } else {
                        f = new Triangle(3, 3, 3);
                        f.setCouleur(tabCouleur[j]);
                        vecteurFormes.add(f);
                        comteur = 0;
                    }
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Le nombre de forme voulue doit être positif");
        }

    }

    @Override
    public String toString() {
        return "VecteurFormes{" +
                "vecteurFormes=" + vecteurFormes +
                '}';
    }

    public void trier() {

    }

    private boolean validerNbrFormes(int a) {
        return true;
    }
}
