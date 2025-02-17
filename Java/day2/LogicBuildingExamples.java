import java.util.Scanner;

public class LogicBuildingExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Find the Largest of Three Numbers
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }

        System.out.println("\n");

        // 2. Leap Year Check
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        System.out.println("\n");

        // 3. Quadrant Check for a Point (x, y)
        System.out.println("Enter coordinates x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Point is in the 1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in the 2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in the 3rd Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Point is in the 4th Quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Point is at the origin");
        } else if (x == 0) {
            System.out.println("Point is on the Y-axis");
        } else {
            System.out.println("Point is on the X-axis");
        }

        System.out.println("\n");

        // 4. Vowel or Consonant
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);  // Convert to lowercase for easier comparison
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("\n");

        // 5. Accept Age and Print Category
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        System.out.println("\n");

        // 6. Even or Odd without %
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if ((number & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("\n");

        // 7. Triangle Type Based on Angles
        System.out.println("Enter three angles:");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("Acute Triangle");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Obtuse Triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }

        System.out.println("\n");

        // 8. Find Roots of a Quadratic Equation
        System.out.println("Enter coefficients a, b, c for a quadratic equation:");
        double coeffA = sc.nextDouble();
        double coeffB = sc.nextDouble();
        double coeffC = sc.nextDouble();
        double D = coeffB * coeffB - 4 * coeffA * coeffC;
        if (D > 0) {
            double root1 = (-coeffB + Math.sqrt(D)) / (2 * coeffA);
            double root2 = (-coeffB - Math.sqrt(D)) / (2 * coeffA);
            System.out.println("Two distinct roots: " + root1 + " and " + root2);
        } else if (D == 0) {
            double root = -coeffB / (2 * coeffA);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots (complex roots)");
        }

        System.out.println("\n");

        // 9. Check for Palindrome Number
        System.out.println("Enter a number to check for palindrome:");
        int original = sc.nextInt();
        int num = original;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        System.out.println("\n");

        // 10. Determine if a Number is Prime
        System.out.println("Enter a number to check for prime:");
        number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}

// Step-by-Step Dry Run:

// number = 2.

// isPrime = true (initialized at the start).

// Condition Check: if (number <= 1)

// 2 <= 1 is false, so skip this block.
// Enter the else block:

// Loop range: for (int i = 2; i <= Math.sqrt(2); i++)
// Math.sqrt(2) ≈ 1.41, so i <= 1.41 is false on the first iteration.
// The loop does not execute even once because i = 2 is greater than 1.41.
// No divisors found. isPrime remains true.

// Output: "Prime Number"

// Case 2: Input = 15
// Step-by-Step Dry Run:

// number = 15.

// isPrime = true (initialized at the start).

// Condition Check: if (number <= 1)

// 15 <= 1 is false, so skip this block.
// Enter the else block:

// Loop range: for (int i = 2; i <= Math.sqrt(15); i++)

// Math.sqrt(15) ≈ 3.87, so the loop will iterate for i = 2, 3.
// First Iteration (i = 2):

// 15 % 2 = 1 (not divisible).
// Continue to the next iteration.
// Second Iteration (i = 3):

// 15 % 3 = 0 (divisible).
// Set isPrime = false and break the loop.
// Output: "Not a Prime Number"

// Summary:
// For 2, the loop never runs because Math.sqrt(2) < 2. The number remains prime.
// For 15, the number is divisible by 3, so it’s correctly identified as not prime.