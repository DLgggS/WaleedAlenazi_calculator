import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//simple calculator
		
		int x;
		int y;
		System.out.println("Enter the two number to add");
		
		System.out.print("X : ");
		Scanner x1 = new Scanner(System.in);
		x = x1.nextInt();
		
		System.out.print("Y : ");
		Scanner y1 = new Scanner(System.in);
		y = y1.nextInt();
		
		System.out.print("Result : "+(x+y));
	}

}
