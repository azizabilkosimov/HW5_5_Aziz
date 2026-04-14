import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter API key: ");
        String apiKey = scanner.nextLine();

        System.out.print("Enter plaintext: ");
        String text = scanner.nextLine();

        String translated = GoogleTranslateService.translate(text, "ru", apiKey);
        System.out.println("Translated (Russian): " + translated);

        System.out.print("Enter Caesar shift: ");
        int shift = scanner.nextInt();

        String encrypted = CaesarCipher.encrypt(translated, shift);
        System.out.println("Encrypted: " + encrypted);

        FrequencyAnalyzer.analyze(encrypted);
    }
}