package ersteAufgabe;

/*public class DecryptTwoKeyFile8 {
    public static void main(String[] args) {
        // Encrypted text from the file
        String encryptedText = "Uybi Gfqgykii Jgziegv Uigeixdiex Smiizzin\n\n... [rest of the encrypted text] ...";

        // Decrypt the text and display the first five words
        String decryptedText = decryptTwoKeys(encryptedText);
        String[] words = decryptedText.split("\\s+");

        // Display the first five decrypted words
        for (int i = 0; i < Math.min(5, words.length); i++) {
            System.out.print(words[i] + " ");
        }
    }

    private static String decryptTwoKeys(String input) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char decryptedChar;

            if (Character.isLetter(originalChar)) {
                int shift = i % 2 == 0 ? 2 : 19; // keys for even and odd indices
                decryptedChar = decryptChar(originalChar, shift);
            } else {
                decryptedChar = originalChar;
            }

            decryptedText.append(decryptedChar);
        }

        return decryptedText.toString();
    }

    private static char decryptChar(char c, int shift) {
        char base = Character.isUpperCase(c) ? 'A' : 'a';
        return (char) ((c - base - shift + 26) % 26 + base);
    }
}*/
