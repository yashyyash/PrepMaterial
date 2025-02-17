import java.util.Scanner;

public class CombinedSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Q1: Accept a character and add 32 to it, then print the result
        System.out.print("Q1: Enter a character: ");
        char character1 = scanner.next().charAt(0);
        char newCharacter1 = (char) (character1 + 32);
        System.out.println("The new character (after adding 32) is: " + newCharacter1);

        // Q2: Accept a character and subtract 32 from it, then print the result
        System.out.print("Q2: Enter a character: ");
        char character2 = scanner.next().charAt(0);
        char newCharacter2 = (char) (character2 - 32);
        System.out.println("The new character (after subtracting 32) is: " + newCharacter2);

        // Q3: Accept a number and check if it is divisible by 12
        System.out.print("Q3: Enter a number to check if divisible by 12: ");
        int number1 = scanner.nextInt();
        if (number1 % 12 == 0) {
            System.out.println(number1 + " is divisible by 12.");
        } else {
            System.out.println(number1 + " is not divisible by 12.");
        }

        // Q4: Accept another number and check if it is divisible by 12
        System.out.print("Q4: Enter another number to check if divisible by 12: ");
        int number2 = scanner.nextInt();
        if (number2 % 12 == 0) {
            System.out.println(number2 + " is divisible by 12.");
        } else {
            System.out.println(number2 + " is not divisible by 12.");
        }

        // Q5: Accept salary and calculate net salary after 10% TDS deduction
        System.out.print("Q5: Enter your salary: ");
        double salary = scanner.nextDouble();
        double tds = salary * 0.10;
        double netSalary = salary - tds;
        System.out.println("Net salary after deducting 10% TDS is: " + netSalary);

        // Q6: Check if the entered number is a 3-digit number
        System.out.print("Q6: Enter a number to check if it's a 3-digit number: ");
        int number3 = scanner.nextInt();
        if (number3 >= 100 && number3 <= 999) {
            System.out.println(number3 + " is a 3-digit number.");
        } else {
            System.out.println(number3 + " is not a 3-digit number.");
        }

        // Q7: Check if the entered character is a vowel
        System.out.print("Q7: Enter a character to check if it's a vowel: ");
        char character3 = scanner.next().charAt(0);
        if (character3 == 'a' || character3 == 'e' || character3 == 'i' || character3 == 'o' || character3 == 'u' ||
            character3 == 'A' || character3 == 'E' || character3 == 'I' || character3 == 'O' || character3 == 'U') {
            System.out.println(character3 + " is a vowel.");
        } else {
            System.out.println(character3 + " is not a vowel.");
        }

        // Q8: Accept marks and print grade based on the marks
        System.out.print("Q8: Enter your marks: ");
        int marks = scanner.nextInt();
        if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 55) {
            System.out.println("Grade B");
        } else if (marks >= 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        // Q9: Calculate electricity bill for 5 homes based on units consumed
        int[] unitsConsumed = {179, 432, 230, 865};  // Predefined units for 4 homes (add one more for a total of 5)
        for (int i = 0; i < unitsConsumed.length; i++) {
            int units = unitsConsumed[i];
            double bill = 0;
            if (units <= 200) {
                bill = units * 0.050;
            } else if (units <= 400) {
                bill = 100 + (units - 200) * 0.65;
            } else if (units <= 600) {
                bill = 230 + (units - 400) * 0.80;
            } else {
                bill = 390 + (units - 600) * 1.00;
            }
            System.out.println("Q9: Bill for Home " + (i + 1) + " (Units: " + units + "): " + bill);
        }

        // Q10: Check if the entered number is odd or even
        System.out.print("Q10: Enter a number to check if it's odd or even: ");
        int number4 = scanner.nextInt();
        if (number4 % 2 == 0) {
            System.out.println(number4 + " is an even number.");
        } else {
            System.out.println(number4 + " is an odd number.");
        }

        scanner.close();
    }
}
