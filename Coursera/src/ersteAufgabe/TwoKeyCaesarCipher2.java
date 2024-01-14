package ersteAufgabe;

public class TwoKeyCaesarCipher2 {
   /* public static void main(String[] args) {
        String originalPhrase = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        int key1 = 21;
        int key2 = 8;

        String encryptedPhrase = encryptTwoKeys(originalPhrase, key1, key2);

        System.out.println("Original Phrase: " + originalPhrase);
        System.out.println("Encrypted Phrase: " + encryptedPhrase);
    }

    private static String encryptTwoKeys(String input, int key1, int key2) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char encryptedChar;

            if (Character.isLetter(originalChar)) {
                int shift = i % 2 == 0 ? key1 : key2;
                encryptedChar = encryptChar(originalChar, shift);
            } else {
                encryptedChar = originalChar;
            }

            encryptedText.append(encryptedChar);
        }

        return encryptedText.toString();
    }

    private static char encryptChar(char c, int shift) {
        char base = Character.isUpperCase(c) ? 'A' : 'a';
        return (char) ((c - base + shift) % 26 + base);
    }*/
}
