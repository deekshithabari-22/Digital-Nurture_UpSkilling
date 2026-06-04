import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> entries = new HashMap<>();

        while (true) {
            System.out.println("Enter 1 to make an entry, or 2 to stop.");

            int choice = sc.nextInt();
            if (choice == 2)
                break;

            System.out.println("Enter the integer id:");
            int key = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.println("Enter the string value:");
            String value = sc.nextLine();

            entries.put(key, value);
        }

        System.out.println("Enter the id to retrieve corresponding value:");
        int id = sc.nextInt();

        System.out.println(entries.getOrDefault(id, "Invalid Id"));

        sc.close();
    }
}