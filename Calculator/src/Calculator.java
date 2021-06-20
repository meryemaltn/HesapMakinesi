import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1,n2,select;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1=input.nextInt();
		System.out.println("Enter second number: ");
		n2=input.nextInt();
		
		System.out.println("1-Addition\n2-Subtruction\n3-Multiply\n4-Division");
		System.out.print("Select an operation: ");
		select=input.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Addition result: "+(n1+n2));
		break;
		case 2:
			System.out.println("Subtruction result: "+(n1-n2));
		break;
		case 3: 
			System.out.println("Multiply result: "+(n1*n2));
		break;
		case 4: 
			System.out.println("Division result: "+(n1/n2));
		break;
		default: 
		System.out.println("You should enter 1,2,3 or 4!");
}
}
}