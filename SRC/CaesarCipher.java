public class CaesarCipher {

    private static final String LOWER = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
    private static final String UPPER = LOWER.toUpperCase();

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {

            int index;

            if ((index = LOWER.indexOf(c)) != -1) {
                result.append(LOWER.charAt((index + shift) % LOWER.length()));
            } else if ((index = UPPER.indexOf(c)) != -1) {
                result.append(UPPER.charAt((index + shift) % UPPER.length()));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}