package module05;

public class StringManipulator {

    public String concatenate(String first, String second) {
        return first + second;
    }

    public int findLength(String word) {
        return word.length();
    }

    public String convertToUppercase(String word) {
        return word.toUpperCase();
    }

    public String convertToLowerCase(String word) {
        return word.toLowerCase();
    }

    public boolean containsSubString(String word, String subString) {
        return word.contains(subString);
    }

    public static void main(String[] args) {
        StringManipulator machine = new StringManipulator();
        System.out.println(machine.concatenate("Kivi", "Naama"));
        System.out.println(machine.findLength("Saippuakauppias"));
        System.out.println(machine.convertToUppercase("hiirimattO"));
        System.out.println(machine.convertToLowerCase("BANAAni"));
        System.out.println(machine.containsSubString("innostunutsonni", "sonni"));
    }
}
