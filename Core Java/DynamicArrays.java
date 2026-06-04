import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DynamicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> studentNames = new ArrayList<>();

        System.out.println("Enter Student Names (type 'done' to finish):");

        while (true) {
            String s = sc.nextLine();

            if (s.equalsIgnoreCase("done")) {
                break;
            }

            studentNames.add(s);
        }

        System.out.println("\nEntered Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        sc.close();
    }
}