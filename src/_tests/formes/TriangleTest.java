package formes;

import exceptions.FormeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void coteEstValide() {
        Triangle t = new Triangle(2, 3, 4);

        assertEquals(true, t.coteEstValide(t.getCoteB()));
        assertThrows(FormeException.class, () -> {
            new Triangle(31, 3, 2);
        });
    }

    @Test
    void getCoteA() {
        Triangle t = new Triangle(3, 4, 5);

        assertEquals(3, t.getCoteA());
    }

    @Test
    void getCoteB() {
        Triangle t = new Triangle(3, 4, 5);

        assertEquals(4, t.getCoteB());
    }

    @Test
    void getCoteC() {
        Triangle t = new Triangle(3, 4, 5);

        assertEquals(5, t.getCoteC());
    }

    @Test
    void estTriangle() {
        Triangle t = new Triangle(3, 2, 3);

        assertTrue(t.estTriangle(3, 2, 3));
    }

    @Test
    void estTriangle_ProvoqueException() {
        Triangle t = new Triangle(9, 2, 3);

        assertThrows(FormeException.class, () -> {
            t.estTriangle(9,2,3);
        });

    }

    @Test
    void estRectangle() {
        Triangle t = new Triangle(3, 4, 5);
        assertTrue(t.estRectangle());
        t = new Triangle(3, 3, 3);
        assertFalse(t.estRectangle());
    }

    @Test
    void getType() {
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(3, 3, 5);
        Triangle t3 = new Triangle(3, 3, 3);
        Triangle t4 = new Triangle(7, 4, 5);

        assertEquals("Rectangle", t1.getType());
        assertEquals("Isocele", t2.getType());
        assertEquals("Equilateral", t3.getType());
        assertEquals("Scalene", t4.getType());
    }

    @Test
    void calculerPerimetre() {
        Triangle t = new Triangle(3, 3, 3);

        assertEquals(9, t.calculerPerimetre());
    }

    @Test
    void calculerSurface() {
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(3, 3, 5);
        Triangle t3 = new Triangle(3, 3, 3);
        Triangle t4 = new Triangle(7, 4, 5);

        assertEquals(6, t1.calculerSurface());
        assertEquals(4, t2.calculerSurface());
        assertEquals(3, t3.calculerSurface());
        assertEquals(9, t4.calculerSurface());
    }

    @Test
    void testToString() {
        Triangle t = new Triangle(3, 3, 3);

        assertEquals("Triangle rouge 9, 3, 3, 3, 3", t.toString());
    }

}