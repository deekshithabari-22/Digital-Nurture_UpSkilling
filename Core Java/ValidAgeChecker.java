import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ValidAgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the age:");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("InvalidAgeException: The entered age " + age + " is invalid!");
            } else {
                System.out.println("The age " + age + " is valid.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
        
    }
}