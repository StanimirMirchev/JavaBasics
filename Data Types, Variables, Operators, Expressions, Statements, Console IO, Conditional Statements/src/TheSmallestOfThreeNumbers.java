
import java.util.Scanner;


public class TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		
		if(num1 < num2 && num1 < num3)
		{
			System.out.println(num1);
		}
		else if(num2 < num3)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}

	}

}
