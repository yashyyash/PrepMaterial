import java.util.*;
public class BasicDataTypeCodeSolution {
    public static void main(String[] args) {
        // Declare variables
        int a, b, c;
        byte a1, a2, a3;
        char char1, char2;
        float fa, fb;
        String str1, str2;
        
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Accept 2 numbers and find the remainder
        System.out.println("Accept 2 numbers from user and find remainder\nEnter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Remainder is: " + (a % b));

        // Accept 2 numbers and find the quotient
        System.out.println("Accept 2 numbers from user and find Quotient\nEnter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Quotient is: " + (a / b));

        // Accept a number and find remainder when divided by 2
        System.out.println("Accept a number and find remainder when divided by 2\nEnter a number: ");
        a = sc.nextInt();
        System.out.println("Remainder is: " + (a % 2));

        // Accept 2 byte numbers and find their sum
        System.out.println("Accept 2 numbers from user in byte data type and find addition\nEnter two numbers: ");
        a1 = sc.nextByte();
        a2 = sc.nextByte();
        a3 = (byte) (a1 + a2); // Explicit casting needed to avoid overflow
        System.out.println("Addition of two bytes (after Type Casting) is: " + a3);

        // Accept 2 characters and find their ASCII sum
        System.out.println("Accept 2 characters from user and find their sum\nEnter two characters: ");
        char1 = sc.next().charAt(0); // charAt(0) extracts the first character
        char2 = sc.next().charAt(0);
        c = char1 + char2; // Adding ASCII values of the characters
        System.out.println("Addition of two characters (ASCII values added) is: " + c);

        // Accept 2 float numbers and find their multiplication
        System.out.println("Accept 2 Float numbers from user and find their multiplication\nEnter two float values: ");
        fa = sc.nextFloat();
        fb = sc.nextFloat();
        System.out.println("Multiplication of two float numbers is: " + (fa * fb));

        // Fix for nextLine() issue: Consume leftover newline
        sc.nextLine();

        // Accept and concatenate two strings
        System.out.println("Accept 1st string from user and concatenate it.");
        str1 = sc.nextLine();
        System.out.println("Accept 2nd string from user and concatenate it.");
        str2 = sc.nextLine();
        System.out.println("Concatenated String: " + str1.concat(str2));

        // Accept a number and find its square
        System.out.println("Accept a number from user and find its square: ");
        a = sc.nextInt();
        System.out.println("Square of the number is: " + (a * a));

        // Accept a number and perform bitwise AND operation with 1
        System.out.println("Accept a number from user and find &1 (bitwise AND with 1): ");
        a = sc.nextInt();
        a = a & 1; // This will return 1 if the number is odd, 0 if even
        System.out.println("Result of bitwise AND with 1: " + a);

        // Convert uppercase character to lowercase by adding 32 (ASCII manipulation)
        System.out.println("Enter an uppercase character to convert to lowercase: ");
        char ye = sc.next().charAt(0);
        char re = (char) (ye + 32);
        System.out.println("Character '" + ye + "' after adding 32 is: '" + re + "'");

        // Convert lowercase character to uppercase by subtracting 32
        System.out.println("Enter a lowercase character to convert to uppercase: ");
        char ye1 = sc.next().charAt(0);
        char re1 = (char) (ye1 - 32);
        System.out.println("Character '" + ye1 + "' after subtracting 32 is: '" + re1 + "'");

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
