import java.util.*;
public class ATM {
private String zip;
public void validateZipCode()
{
	Scanner console= new Scanner(System.in);
	int ctr=1;
	boolean error=false;
	do{
		System.out.println("Enter ZIp Code");
		zip=console.nextLine();
		if (ctr==3) {
			System.out.println("Your account is blocked");
			break;
			
		}
		else if (zip.length() <4|| zip.length()>4){
			error=true;
			ctr++;
		}
		else if (zip.equals("4351")) {
			System.out.println("Zip Code is Correct");
			break;
		}
		else {System.out.println("Zip code is incorrect");
		error = true;
		ctr++;
		}}
	while(error);
}
public static void main(String[] args)
{
	ATM atm= new ATM();
	atm.validateZipCode();
		}
	}


