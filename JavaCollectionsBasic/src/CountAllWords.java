
import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		String line = input.nextLine() ;
		input.close();
		
		String[] array = line.split("\\W") ;
		System.out.println(array.length);

	}

}
