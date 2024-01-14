package ersteAufgabe;

/*public class TwoKeyDecryption7 {
    public static void main(String[] args) {
        String encryptedMessage = "Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!";

        String decryptedMessage = decryptTwoKeys(encryptedMessage);

        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
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
}
*/