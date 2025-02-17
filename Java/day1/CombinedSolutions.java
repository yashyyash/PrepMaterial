import java.util.Scanner;

public class CombinedSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: Accept 2 numbers from user and find remainder
        System.out.println("Enter two integers to find the remainder:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int remainder = num1 % num2;
        System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + remainder);

        // Q2: Accept 2 numbers from the user and find the quotient
        System.out.println("Enter two integers to find the quotient:");
        int quotient = num1 / num2;
        System.out.println("Quotient of " + num1 + " divided by " + num2 + " is: " + quotient);

        // Q3: Accept a number from user and do % 2 and print remainder
        System.out.println("Enter an integer to find the remainder when divided by 2:");
        int num3 = sc.nextInt();
        remainder = num3 % 2;
        System.out.println("Remainder when " + num3 + " is divided by 2 is: " + remainder);

        // Q4: Accept 2 numbers from user in byte data type and do sum of it
        System.out.println("Enter two byte numbers to calculate their sum:");
        byte num4 = sc.nextByte();
        byte num5 = sc.nextByte();
        byte sumByte = (byte) (num4 + num5); // Casting result to byte
        System.out.println("Sum of " + num4 + " and " + num5 + " is: " + sumByte);

        // Q5: Accept 2 characters from user and do sum of their ASCII values
        System.out.println("Enter two characters to calculate the sum of their ASCII values:");
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        int asciiSum = char1 + char2;
        System.out.println("Sum of ASCII values of '" + char1 + "' and '" + char2 + "' is: " + asciiSum);

        // Q6: Accept 2 float values from user and find the product
        System.out.println("Enter two floating-point numbers to calculate their product:");
        float num6 = sc.nextFloat();
        float num7 = sc.nextFloat();
        float product = num6 * num7;
        System.out.println("Product of " + num6 + " and " + num7 + " is: " + product);

        // Q7: Accept 2 strings from user and concatenate them
        System.out.println("Enter the first string:");
        String str1 = sc.next();
        System.out.println("Enter the second string:");
        String str2 = sc.next();
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated result: " + concatenatedString);

        // Q8: Accept a number and print square of the number
        System.out.println("Enter a number:");
        double num8 = sc.nextDouble();
        double square = num8 * num8;
        System.out.println("The square of " + num8 + " is: " + square);

        // Q9: Accept a number and use bitwise '& 1' to determine if the number is even or odd
        System.out.println("Enter a number:");
        int num9 = sc.nextInt();
        int result = num9 & 1;
        System.out.println("The result of " + num9 + " & 1 is: " + result);
        if (result == 0) {
            System.out.println(num9 + " is even.");
        } else {
            System.out.println(num9 + " is odd.");
        }

        // Q10: Accept a number and print the next number using one variable
        System.out.println("Enter a number:");
        int nextNum = sc.nextInt();
        nextNum++;
        System.out.println("The next number is: " + nextNum);

        // Q11: Accept a number and print the previous number
        System.out.println("Enter a number:");
        int prevNum = sc.nextInt();
        prevNum--;
        System.out.println("The previous number is: " + prevNum);

        // Q12: Accept a character and print the next character
        System.out.println("Enter a character:");
        char nextChar = sc.next().charAt(0);
        char newNextChar = (char) (nextChar + 1);
        System.out.println("The next character is: " + newNextChar);

        // Q13: Accept a character and print the previous character
        System.out.println("Enter a character:");
        char prevChar = sc.next().charAt(0);
        char newPrevChar = (char) (prevChar - 1);
        System.out.println("The previous character is: " + newPrevChar);

        // Q14: Accept a name and print it 5 times
        System.out.println("Enter your name:");
        String name = sc.next();
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }

        // Q15: Accept 2 numbers and swap them using a temporary variable
        System.out.println("Enter first number:");
        int num10 = sc.nextInt();
        System.out.println("Enter second number:");
        int num11 = sc.nextInt();
        int temp = num10;
        num10 = num11;
        num11 = temp;
        System.out.println("After swapping: ");
        System.out.println("First number: " + num10);
        System.out.println("Second number: " + num11);

        // Q16: Accept 2 numbers and swap them using arithmetic
        System.out.println("Enter first number:");
        num10 = sc.nextInt();
        System.out.println("Enter second number:");
        num11 = sc.nextInt();
        num10 = num10 + num11;
        num11 = num10 - num11;
        num10 = num10 - num11;
        System.out.println("After swapping: ");
        System.out.println("First number: " + num10);
        System.out.println("Second number: " + num11);

        // Q17: Accept 2 numbers and swap them using XOR
        System.out.println("Enter first number:");
        num10 = sc.nextInt();
        System.out.println("Enter second number:");
        num11 = sc.nextInt();
        num10 = num10 ^ num11;
        num11 = num10 ^ num11;
        num10 = num10 ^ num11;
        System.out.println("After swapping: ");
        System.out.println("First number: " + num10);
        System.out.println("Second number: " + num11);

        // Q18: Accept a character and add 32 to it
        System.out.println("Enter a character:");
        char charAdd = sc.next().charAt(0);
        char newCharAdd = (char) (charAdd + 32);
        System.out.println("The new character is: " + newCharAdd);

        // Q19: Accept a character and subtract 32 from it
        System.out.println("Enter a character:");
        char charSubtract = sc.next().charAt(0);
        char newCharSubtract = (char) (charSubtract - 32);
        System.out.println("The new character is: " + newCharSubtract);

        sc.close();
    }
}
