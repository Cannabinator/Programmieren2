package uebung2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class PaarTest {
    Object grapeFirst;
    Object grapeSecond;

    Object appleFirst;
    Object appleSecond;

    Paar grapes = new Paar<>(grapeFirst, grapeSecond);
    Paar apples = new Paar<>(appleFirst, appleSecond);
    Paar plumsAreApples = new Paar<>(appleFirst, appleSecond);
    @Test
    void getFirst() {
       assertEquals(grapes.getFirst(), grapeFirst);
       assertEquals(apples.getFirst(), appleFirst);
    }

    @Test
    void getSecond() {
        assertEquals(grapes.getSecond(), grapeSecond);
        assertEquals(apples.getSecond(), appleSecond);
    }

    @Test
    void setFirst() {
        grapes.setFirst(grapeSecond);
        assertEquals(grapes.getFirst(), grapeSecond);
        grapes.setFirst(grapeFirst);
    }

    @Test
    void setSecond() {
        grapes.setSecond(appleFirst);
        assertEquals(grapes.getSecond(),appleFirst);
        grapes.setSecond(grapeSecond);
    }

    @Test
    void testEquals() {
       assertFalse(apples.equals(grapes));
    }
}