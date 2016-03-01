
import java.util.Scanner ;
public class CountOfBitsOne {

 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 	int number = input.nextInt();
	 	input.close();
        int br = 0;
        for (int i = 0; i < 32; i++) {
        	int bit = number & 1;
        		if (bit == 1) {
                        br++;
                }
        			number >>= 1;
        }
        System.out.println(br);

 }
}