package module05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    private static PalindromeChecker pal;

    @BeforeAll
    static void setup() throws Exception {
        pal = new PalindromeChecker();
    }

    @Test
    void testIsPalindrome() {
        assertFalse(pal.isPalindrome("tree"));
        assertTrue(pal.isPalindrome("saippuakauppias"));
        assertTrue(pal.isPalindrome("saippua Kauppias"));
        assertTrue(pal.isPalindrome(333));
    }

}