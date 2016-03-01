
import java.util.Scanner;


public class DecToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberToConvert = input.nextInt();
		input.close();
		String hex = Integer.toHexString(numberToConvert);
		System.out.println(hex);
		
	}

}
