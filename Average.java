import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		//Calculating The sum and The Average
		System.out.println("Enter the five number");
		Double d1, d2, d3, d4, d5, Average, Sum;
		Scanner Keyboard = new Scanner(System.in);
		d1 = Keyboard.nextDouble();
		d2 = Keyboard.nextDouble();
		d3 = Keyboard.nextDouble();
		d4 = Keyboard.nextDouble();
		d5 = Keyboard.nextDouble();
		Sum = d1+d2+d3+d4+d5;//displays Sum
		Average = (d1+d2+d3+d4+d5)/5;//Displays The Average
		System.out.println(" The Sum is " + Average );
		System.out.println(" The Average is " + Average );
	}
}
