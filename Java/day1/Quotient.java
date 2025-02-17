//Take 2 numbers as input and give Quotient as output
import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        int a , b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TWO number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a/b;
        System.out.println("Quotient is "+c);
    }
}
