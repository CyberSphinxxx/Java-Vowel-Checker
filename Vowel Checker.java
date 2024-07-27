import java.util.Scanner;
import java.util.Set;

public class VowelChecker {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input letter here: ");
            char letter = input.next().charAt(0);

            if (VOWELS.contains(letter)) {
                System.out.println(letter + " is a vowel letter");
            }
            
            else {
                System.out.println(letter + " is a consonant letter");
            }
        }
    }
}
