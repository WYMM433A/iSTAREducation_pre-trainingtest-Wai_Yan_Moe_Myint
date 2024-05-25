import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string here: ");
        String str = sc.nextLine();

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            charFrequency.put(current, charFrequency.getOrDefault(current, 0) + 1);
        }

        System.out.println("Characters and their respective frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + " is found " + entry.getValue() + " time(s) in the given string");
        }

        sc.close();
    }
}
