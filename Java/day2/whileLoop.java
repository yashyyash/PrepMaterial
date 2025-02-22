public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        String str;
        //	 Q1. Accept a number from user and print your name that many time
        System.out.println("Enter your name");
        str = sc.nextLine();
        while(i<5) {
            System.out.println(str);
            i++;
        }
        
        //	 Q2. Accept a number and print previous 5 number 
       // Q2. Accept a number and print the previous 5 numbers
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        int count = 0; // Counter to ensure only 5 numbers are printed
        while (count < 5) {
            --a; // Decrement `a` first to get the previous number
            System.out.println(a);
            count++; // Increment count to track the loop iterations
        }
   
        
        //	 Q3. . Accept a number and print that many previous number 
       // Q3. Accept a number and print that many previous numbers using while loop
        System.out.println("Enter a Number: ");
        a = sc.nextInt();
   
        count = a; // Number of previous numbers to print
        while (count > 0) {
            --a; // Decrement first to get the previous number
            System.out.println(a);
            count--; // Reduce the count
        }
   
    }
   }