import java.util.ArrayList;
import java.util.Scanner;


public class CombineListOfLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Character> firstList = new ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();
		for (char symbol : input.nextLine().toCharArray()) {
		    firstList.add(symbol);
		}
		for (char symbol : input.nextLine().toCharArray()) {
		    secondList.add(symbol);
		}
		
		input.close();
		
		ArrayList<Character> result = new ArrayList<>();
		result.addAll(firstList);
		
		for(int i = 0 ; i<secondList.size() ; i++){
			if(!firstList.contains(secondList.get(i))){
				result.add(' ') ;
				result.add(secondList.get(i)) ;
			}
		}
		for(char symbol: result)
		{
			System.out.print(symbol);
		}
		
	}

}

