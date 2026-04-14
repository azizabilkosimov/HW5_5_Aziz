public class FrequencyAnalyzer {

    private static final String LETTERS = "абвгдежзийклмнопрстуфхцчшщъыьэюя";

    public static void analyze(String text) {

        int[] counts = new int[LETTERS.length()];
        int total = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            int index = LETTERS.indexOf(c);
            if (index != -1) {
                counts[index]++;
                total++;
            }
        }

        System.out.println("Frequency Analysis (Russian):");

        for (int i = 0; i < LETTERS.length(); i++) {
            double percent = (total == 0) ? 0 : (counts[i] * 100.0 / total);
            System.out.printf("%c: %.2f%%\n", LETTERS.charAt(i), percent);
        }
    }
}