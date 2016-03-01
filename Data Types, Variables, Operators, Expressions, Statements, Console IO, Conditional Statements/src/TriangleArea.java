
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int coordX = input.nextInt();
		int coordY = input.nextInt();
		int coordX2 = input.nextInt();
		int coordY2 = input.nextInt();
		int coordX3 = input.nextInt();
		int coordY3 = input.nextInt();
		input.close();
		
		int area = Math.abs((coordX * (coordY2 - coordY3) + coordX2 * (coordY3 - coordY) + coordX3 * (coordY - coordY2))/2);
		System.out.println(area);
		

	}

}
