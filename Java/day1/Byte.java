// java TypeCating

import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte a, b, c;
        a = sc.nextByte();
        b = sc.nextByte();
        // Explicitly cast to byte because adding two bytes results in an int
        c = (byte) (a + b);
        // Print the sum  
        System.out.println(c);  
    }
}
