package formes;


import exceptions.FormeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {

    @Test
    void setCouleur_initialiseCouleurRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);

        rectangle.setCouleur(Couleur.ORANGE);
        assertEquals("orange", rectangle.getNom());
        rectangle.setCouleur(Couleur.VERT);
        assertEquals("vert", rectangle.getNom());
    }

    @Test
    void setLargeur_initialiseLargeurRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);

        rectangle.setLargeur(2);
        assertEquals(2, rectangle.getLargeur());
    }

    @Test
    void setHauteur_initialiseHauteurRectangle() {
        Rectangle rectangle = new Rectangle(2, 4);

        rectangle.setHauteur(4);
        assertEquals(4, rectangle.getHauteur());
    }

    @Test
    void estHauteurInvalide_provoqueExecption() {
        Rectangle rectangle = new Rectangle(2, 4);

        assertThrows(IllegalArgumentException.class, () -> {rectangle.setHauteur(-2);});
        assertThrows(IllegalArgumentException.class, () -> {rectangle.setHauteur(31);});
    }

    @Test
    void estLargeurInvalide_provoqueExecption() {
        Rectangle rectangle = new Rectangle(2, 4);

        assertThrows(FormeException.class, () -> {
            rectangle.setLargeur(-2);
        });
        assertThrows(FormeException.class, () -> {rectangle.setLargeur(31);});
    }

    @Test
    void getCouleur_RetourneLaCouleurRectangle() {
        Rectangle r = new Rectangle(2, 4);

        r.setCouleur(Couleur.NOIR);
        assertEquals("noir", r.getNom());
    }

    @Test
    void getLargeur_RetourneLargeurRectangle() {
        Rectangle r = new Rectangle(2, 4);

        assertEquals(2, r.getLargeur());
    }

    @Test
    void getNom_RetourneLeNomDuRectangle() {
        Rectangle r = new Rectangle(2, 4);

        assertEquals("Rectangle", r.getNom());
    }

    @Test
    void getHauteur_RetourneLaHauteurRectangle() {
        Rectangle r = new Rectangle(2, 4);

        assertEquals(4, r.getHauteur());
    }

    @Test
    void calculerSurface() {
        Rectangle r = new Rectangle(2, 4);

        assertEquals(8, r.calculerSurface());
    }

    @Test
    void calculerPerimetre() {
        Rectangle r = new Rectangle(2, 4);

        assertEquals(12, r.calculerPerimetre());
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(2, 4);

        r.setCouleur(Couleur.BLEU);
        assertEquals("Rectangle bleu 4, 2", r.toString());
    }

    @Test
    void testEquals() {
        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(4, 2);

        r1.setCouleur(Couleur.JAUNE);
        r2.setCouleur(Couleur.JAUNE);
        assertTrue(r1.equals(r2));
        r2.setCouleur(Couleur.BLEU);
        assertFalse(r1.equals(r2));
    }
}