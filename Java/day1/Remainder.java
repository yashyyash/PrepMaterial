//Accept 2 number from user and find remainder

import java.util.Scanner;

public class Remainder{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a%b;
        System.out.println("Remainder ="+c);
    }
}