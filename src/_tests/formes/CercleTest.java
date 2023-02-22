package formes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CercleTest {

    @Test
    void getCouleur() {
        Cercle c = new Cercle(10);

        c.setCouleur(Couleur.ORANGE);
        assertEquals("orange", c.getCouleur());
    }

    @Test
    void setCouleur() {
        Cercle c = new Cercle(10);

        c.setCouleur(Couleur.ORANGE);
        assertEquals(Couleur.ORANGE, c.getCouleur());
        c.setCouleur(Couleur.VERT);
        assertEquals(Couleur.VERT, c.getCouleur());
        c.setCouleur(null);
        assertEquals(Couleur.VERT, c.getCouleur());
    }

    @Test
    void getNom() {
        Cercle c = new Cercle(10);

        assertEquals("Cercle", c.getNom());
    }

    @Test
    void estRayonInvalide_provoqueExecption() {
        Cercle c = new Cercle(10);

        assertThrows(IllegalArgumentException.class, () -> {c.setRayon(-2);});
        assertThrows(IllegalArgumentException.class, () -> {c.setRayon(31);});
    }

    @Test
    void getRayon() {
        Cercle c = new Cercle(10);

        assertEquals(10, c.getRayon());
    }

    @Test
    void setRayon() {
        Cercle c = new Cercle(10);

        c.setRayon(5);
        assertEquals(5, c.getRayon());
    }

    @Test
    void calculerSurface() {
        Cercle c = new Cercle(10);

        assertEquals(314, c.calculerSurface());
    }

    @Test
    void testEquals() {
        Cercle c1 = new Cercle(10);
        Cercle c2 = new Cercle(10);

        c1.setCouleur(Couleur.JAUNE);
        c2.setCouleur(Couleur.JAUNE);
        assertTrue(c1.equals(c2));
        c2.setCouleur(Couleur.VERT);
        assertFalse(c1.equals(c2));
    }

    @Test
    void calculerPerimetre() {
        Cercle c = new Cercle(10);

        assertEquals(62, c.calculerPerimetre());
    }

    @Test
    void testToString() {
        Cercle c = new Cercle(10);

        c.setCouleur(Couleur.BLEU);
        assertEquals("Cercle bleu 10", c.toString());
    }
}