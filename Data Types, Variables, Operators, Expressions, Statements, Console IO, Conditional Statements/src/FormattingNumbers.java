import java.text.DecimalFormat;
import java.util.Scanner ;

public class FormattingNumbers {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in) ;
			int a = input.nextInt() ; 
			double b = input.nextDouble() ;
			double c = input.nextDouble() ;
			input.close();
  
			String hex = Integer.toHexString(a) ;
			System.out.print("|");
			System.out.print(hex);
			System.out.print("       ");
			System.out.print("|");
			System.out.print(Integer.toBinaryString(a));
			System.out.print("|");
			System.out.print("     ");
			DecimalFormat f = new DecimalFormat("##.00") ;
			System.out.print(f.format(b));
			System.out.print("|");
			DecimalFormat s = new DecimalFormat("##.000") ;
			System.out.print(s.format(c));
			System.out.print("     ");
			System.out.print("|");
 }

}
	
