package module05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void concatenate() {
        StringManipulator s = new StringManipulator();
        assertEquals("KiviKauppa", s.concatenate("Kivi", "Kauppa"));
    }

    @Test
    void findLength() {
        StringManipulator s = new StringManipulator();
        assertEquals(3, s.findLength("bye"));
        System.out.println("Test findlength passed");
    }

    @Test
    void convertToUppercase() {
        StringManipulator s = new StringManipulator();
        assertEquals("MOUSE", s.convertToUppercase("mouSe"));
    }

    @Test
    void convertToLowerCase() {
        StringManipulator s = new StringManipulator();
        assertEquals("house", s.convertToLowerCase("HoUSe"));
        System.out.println("Pass");
    }

    @Test
    void containsSubString() {
        StringManipulator s = new StringManipulator();
        assertEquals(false, s.containsSubString("Quitar", "stone"));
        assertEquals(true, s.containsSubString("racecar", "car"));

    }

    @BeforeAll
    static void main() {
        StringManipulator s = new StringManipulator();
    }
}