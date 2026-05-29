public class OperatorPrecedence {
    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);

        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);

        int result3 = 20 / 5 + 3 * 4;
        System.out.println("20 / 5 + 3 * 4 = " + result3);

        int result4 = 8 + 2 * 3 - 4 / 2;
        System.out.println("8 + 2 * 3 - 4 / 2 = " + result4);

        int result5 = 5 + 6 / 2 * 3;
        System.out.println("5 + 6 / 2 * 3 = " + result5);
    }
}

/*

Explanation of Order of Operations

Java follows operator precedence rules, similar to mathematics.

Highest Precedence

1. () → Parentheses
2. *, /, % → Multiplication, Division, Modulus
3. +, - → Addition, Subtraction

*/