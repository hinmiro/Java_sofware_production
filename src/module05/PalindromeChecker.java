package module05;

public class PalindromeChecker {

    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase();
        String newString = newS.replace(" ", "");
        System.out.println(newString);
        if (newString.equals(new StringBuilder(newString).reverse().toString()))
            return true;
        return false;
    }

    public boolean isPalindrome(int s) {

        String newS = String.valueOf(s).toLowerCase().replace(" ", "");
        if (newS.equals(new StringBuilder(newS).reverse().toString()))
            return true;
        return false;
    }




    public static void main(String[] args) {
        PalindromeChecker pal = new PalindromeChecker();
        pal.isPalindrome("saippua Kauppias");
    }
}
