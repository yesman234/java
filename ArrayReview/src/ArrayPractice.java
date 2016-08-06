import java.util.ArrayList;
public class ArrayPractice {

	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>();

		int secretNumber = ((int)Math.floor(Math.random()*9));
		int userNumber = (0);
		int i =(0);
		
		for ( i = (0); i<10; ++i){
			userNumber = ((int)Math.floor(Math.random()*9));
			if(userNumber==secretNumber) {
				System.out.println("your a winner");
				break;
			}
		}
		
System.out.println("Took" + (i +1) + "number of tries");
	}}
