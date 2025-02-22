public class Day1extras {
	// Q1. Accept a number from user and print next number using one variable
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();
		++a;
		System.out.println("the NextNumber is "+a);

	//	Q2. Accept a number from user and print previous number
		System.out.println("Enter next Number: ");
		a = sc.nextInt();
		--a;
		System.out.println("the Previous Number is "+a);
		
	//Q3. Accept a character from user and print next character
		System.out.println("Enter next char: ");
		char a1 = sc.next().charAt(0);
		++a1;
		System.out.println("the Next char is "+a1);
		
	//Q4. Accept a character from user and print previous character
		System.out.println("Enter next char: ");
		a1 = sc.next().charAt(0);
		--a1;
		System.out.println("the Next char is "+a1);
		
		sc.nextLine();
	//Q5. Accept a name from user and print it 5 time
		String str ;
		System.out.println("Enter any name");
		str = sc.nextLine();
		for(int i=0;i<5;i++) {
			System.out.println(str);
		}
	
	//Q6. Accept 2 number from user and swap it.  Minimum 3 answer
		System.out.println("Enter Two Numbers: ");	
		int a2;
		a = sc.nextInt();
		a2 = sc.nextInt();
		
		System.out.println("Swaping using Addition");
		a = a + a2;
		a2 = a - a2;
		a = a - a2;
		System.out.println("Swaping after Addition Number1 is "+a+" Number 2"+a2);
		
		System.out.println("Enter Two Numbers: ");	
		a = sc.nextInt();
		a2 = sc.nextInt();
		System.out.println("Swaping using EXOR");
		a = a ^ a2;
		a2 = a ^ a2;
		a = a ^ a2;
		System.out.println("Swaping after EXOR Number1 is "+a+" Number 2"+a2);
		
		System.out.println("Enter Two Numbers: ");	
		a = sc.nextInt();
		a2 = sc.nextInt();
		System.out.println("Swaping using Multiplication");
		a = a * a2;
		a2 = a / a2;
		a = a / a2;
		System.out.println("Swaping after Addition Number1 is "+a+" Number 2"+a2);
	
	

	}
}
