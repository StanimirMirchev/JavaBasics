
import java.util.Scanner;
import java.util.Date;


public class DaysBetweenTwoDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String enteredDateOne = input.nextLine();
		String[] partsOfDateOne = enteredDateOne.split("-");
		
		String enteredDateTwo = input.nextLine();
		String[] partsOfDateTwo = enteredDateTwo.split("-");
		input.close();
		
		int dayFirst = Integer.parseInt(partsOfDateOne[0]);
		int monthFirst = Integer.parseInt(partsOfDateOne[1]);
		int yearFirst = Integer.parseInt(partsOfDateOne[2]);
		
		int dayTwo = Integer.parseInt(partsOfDateTwo[0]);
		int monthTwo = Integer.parseInt(partsOfDateTwo[1]);
		int yearTwo = Integer.parseInt(partsOfDateTwo[2]);
		
		
		
		Date dateOne = new Date (yearFirst,monthFirst,dayFirst);
	    long timeInSeconds = dateOne.getTime();
	    Date dateTwo = new Date (yearTwo,monthTwo,dayTwo);
	    long timeInSec = dateTwo.getTime();
	    
	    int days = (int)((timeInSec - timeInSeconds)/86400000);
	   
	    System.out.println("Time is " + days + " days");

	}

}
