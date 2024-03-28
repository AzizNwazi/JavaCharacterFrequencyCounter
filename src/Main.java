import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text : ");

        // Reading the input text from the user
        String text = scanner.nextLine();

        // Creating a TreeMap to store the frequency of each character
        Map<Character, Integer> frequency = new TreeMap<Character, Integer>();

        // Iterating over each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // If the character is already present in the frequency map, increment its count
            if (frequency.containsKey(c)) {
                frequency.replace(c, frequency.get(c) + 1);
            } else {
                // If the character is not present, add it to the frequency map with count 1
                frequency.put(c, 1);
            }
        }

        // Displaying the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("Character : " + entry.getKey() + " appeared " + entry.getValue() + " times");
        }
    }
}
