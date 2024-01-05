import java.util.Scanner;

public class InvertPhrase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a phrase
        System.out.print("Enter a phrase: ");
        String inputPhrase = scanner.nextLine();

        // Invert the input phrase
        String invertedPhrase = invertPhrase(inputPhrase);

        // Display the input and inverted phrases
        System.out.println("Input: " + inputPhrase);
        System.out.println("Output: " + invertedPhrase);

        // Close the scanner
        scanner.close();
    }

    public static String invertPhrase(String phrase) {
        // Split the phrase into words
        String[] words = phrase.split(" ");

        // Invert the order of words
        StringBuilder invertedPhrase = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            invertedPhrase.append(words[i]).append(" ");
        }

        return invertedPhrase.toString().trim();
    }
}
