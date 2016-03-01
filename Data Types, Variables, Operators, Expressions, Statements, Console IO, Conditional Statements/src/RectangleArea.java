
import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		int sideA;
		sideA = input.nextInt();
		int sideB ;
		sideB = input.nextInt();
		input.close();
		int rectangleArea = sideA * sideB;
		System.out.println(rectangleArea);
		
	}

}
