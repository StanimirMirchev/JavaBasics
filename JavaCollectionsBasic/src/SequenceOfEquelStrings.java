
import java.util.Scanner;



public class SequenceOfEquelStrings {

	 public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in) ;
			String lines = input.nextLine() ;
			String[] array = lines.split(" ") ;
			
			input.close();
			
			int i = 0 ;
			for( i =0 ; i<array.length - 1 ; i++)
			{
				if(!array[i].equals(array[i+1])){
					System.out.println(array[i]);
				}
				else
				{
					
					System.out.print(array[i] + " ");
				}
			}
			if(array[i - 1].equals(array[i])){
				
			System.out.print(array[i]);
			}
			else
			{
				System.out.println(array[i]);
			}
		

	 }

}


