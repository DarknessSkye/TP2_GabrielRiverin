package formes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormesTest {


    @Test
    void setCouleur() {
        Rectangle r = new Rectangle(3,5);
        r.setCouleur(Couleur.ORANGE);
        assertEquals("orange", r.getCouleur().toString());
        r.setCouleur(null);
        assertEquals("orange", r.getCouleur().toString());
    }

    @Test
    void getCouleur() {
        Rectangle r = new Rectangle(3,5);
        assertEquals("rouge", r.getCouleur().toString());
    }

    @Test
    void getNom() {
        Cercle c = new Cercle(5);
        assertEquals("Cercle", c.getNom());
    }

    @Test
    void testEquals() {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle( 5,5);
        Triangle t = new Triangle(3,3,3);

        assertTrue(r1.equals(r2));
        assertFalse(r1.equals(t));
    }


    @Test
    void compareTo() {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle( 5,5);
        Triangle t = new Triangle(3,3,3);

        assertEquals(-2, r1.compareTo(t));
        assertEquals(0, r1.compareTo(r2));
        r2.setCouleur(Couleur.JAUNE);
        assertEquals(3, r1.compareTo(r2));
    }
}