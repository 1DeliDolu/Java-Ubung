/*package ersteAufgabe;

public class TwoKeyCaesarCipher3 {
    private final String shiftedAlphabet1;
    private final String shiftedAlphabet2;

    public TwoKeyCaesarCipher3(int key1, int key2) {
        this.shiftedAlphabet1 = createShiftedAlphabet(key1);
        this.shiftedAlphabet2 = createShiftedAlphabet(key2);
    }

    private String createShiftedAlphabet(int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder shiftedAlphabet = new StringBuilder();

        for (int i = 0; i < alphabet.length(); i++) {
            char originalChar = alphabet.charAt(i);
            char shiftedChar = (char) (((originalChar - 'A' + key) % 26 + 26) % 26 + 'A');
            shiftedAlphabet.append(shiftedChar);
        }

        return shiftedAlphabet.toString();
    }

    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char originalChar = text.charAt(i);
            char shiftedChar;

            if (Character.isLetter(originalChar)) {
               // int shift = i % 2 == 0 ? shiftedAlphabet1 : shiftedAlphabet2;
                //shiftedChar = getShiftedChar(originalChar, shift);
            } else {
                shiftedChar = originalChar;
            }
           // encryptedText.append(shiftedChar);
        }

        return encryptedText.toString();
    }

    private char getShiftedChar(char originalChar, String shiftedAlphabet) {
        if (originalChar >= 'A' && originalChar <= 'Z') {
            int idx = originalChar - 'A';
            return shiftedAlphabet.charAt(idx);
        } else {
            return originalChar;
        }
    }

    public static void main(String[] args) {
        TwoKeyCaesarCipher3 cipher = new TwoKeyCaesarCipher3(21, 8);
        String originalPhrase = "Can you imagine life WITHOUT the internet AND computers in your pocket?";
        String encryptedPhrase = cipher.encrypt(originalPhrase);
        System.out.println("Original Phrase: " + originalPhrase);
        System.out.println("Encrypted Phrase: " + encryptedPhrase);
    }
}*/
