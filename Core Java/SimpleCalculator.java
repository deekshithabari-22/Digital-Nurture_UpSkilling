import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter second number:");
        double num2=sc.nextDouble();

        System.out.println("Select operation: +, -, *, /");
        char operation=sc.next().charAt(0);
        double result=0;

        switch(operation){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        System.out.println("Result: " + result);
    }
}
