
import java.util.Scanner;

public class PointInsideAFigure {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float coordX = input.nextFloat();
		float coordY = input.nextFloat();
		input.close();
		
		if( ((coordX >= 12.5 && coordX <= 22.5) && (coordY >= 6 && coordY  <= 8.5)) 
			|| ((coordX >= 12.5 && coordX <= 17.5) && (coordY >= 6 && coordY <= 13.5)) 
			|| ((coordX >= 20 && coordX <= 22.5) && (coordY >= 6 && coordY <= 13.5)) ){
			
			System.out.println("Inside");
		}
		else
		{
			System.out.println("Outside");
		}
		

	}

}
