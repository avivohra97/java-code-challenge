public class PangramChecker {
    public static boolean isPangram(String str) {
        boolean[] alphabetPresent = new boolean[26];
        str = str.toLowerCase(); // Normalize to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true; // Mark the character's presence
            }
        }

        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // Not a pangram if any letter is missing
            }
        }
        return true; // All letters are present, it's a pangram
    }

    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "Hello World";

        System.out.println("\"" + sentence1 + "\" is a pangram: " + isPangram(sentence1));
        System.out.println("\"" + sentence2 + "\" is a pangram: " + isPangram(sentence2));
    }
}