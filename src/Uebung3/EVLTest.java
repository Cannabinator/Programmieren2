package Uebung3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class EVLTest {
    static EVL<Integer> liste1;
    static EVL<String> liste2;
    static EVL<Integer> leer1;

    @BeforeEach
    void init() {
        liste1 = new EVL<>();
        for (int i = 1; i <= 5; i++) {
            liste1.insert(10+i);
        }

        leer1 = new EVL<>();

        liste2 = new EVL<>();
        liste2.insert("eins");
        liste2.insert("zwei");
        liste2.insert("drei");

    }

    @Test
    void testEmpty() {
        testEmpty(leer1);
    }
    static <T> void testEmpty(EVL<T> liste) {
        assertTrue(liste.isEmpty());
        assertEquals(0, liste.size());
        assertThrows(NoSuchElementException.class, ()->{liste.get();});
    }

    @Test
    void testInit() {
        assertFalse(liste1.isEmpty());
        assertEquals(5, liste1.size());
        assertEquals(15, liste1.get());

        System.out.println(liste1.toString());
        assertFalse(liste2.isEmpty());
        assertEquals(3, liste2.size());
        assertEquals("drei", liste2.get());
        System.out.println(liste2.toString());
    }


    @Test
    void testInsertListe1() {
        assertEquals(15, liste1.get());
        liste1.insert(9);
        assertEquals(9, liste1.get());
    }

    @Test
    void testInsertListe2() {
        assertEquals("drei", liste2.get());
        liste2.insert("vier");
        assertEquals("vier", liste2.get());
    }


    @Test
    void testRemoveListe1() {
        liste1.remove();
        assertEquals(14, liste1.get());
        assertEquals(4, liste1.size());
        liste1.insert(16);
        assertEquals(16, liste1.get());
        // removeAll
        while(!liste1.isEmpty())
            liste1.remove();
        assertTrue(liste1.isEmpty());
        assertEquals(0, liste1.size());
        assertThrows(NoSuchElementException.class, ()->{liste1.get();});
    }

    @Test
    void testRemoveListe2() {
        liste2.remove();
        assertEquals("zwei", liste2.get());
        liste2.insert("vier");
        assertEquals("vier", liste2.get());
        // removeAll
        while(!liste2.isEmpty())
            liste2.remove();
        assertTrue(liste2.isEmpty());
        assertEquals(0, liste2.size());
        assertThrows(NoSuchElementException.class, ()->{liste2.get();});
    }

    @Test
    void testContains() {
        assertFalse(leer1.contains(6));
        assertFalse(liste1.contains(6));
        assertTrue(liste1.contains(11));
        assertTrue(liste1.contains(15));

    }

}
