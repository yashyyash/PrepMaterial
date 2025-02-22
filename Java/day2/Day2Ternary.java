public class Day2Ternary {
	public static void main(String[] args) {
		//	Q1. Accept 2 number from user and store highest number in another variable and print it.
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = (a>b)?a:b;
		System.out.println("Enter The Highest number is: "+c);
		
		//	Q2. Accept 3 number from user and print highest number.
		System.out.println("Enter 3 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Highest number is "+a);
		}
		else if(b>c) {
			System.out.println("Highest number is "+b);
		}
		else {
			System.out.println("Higest Number is "+c);
		}
	}

}
