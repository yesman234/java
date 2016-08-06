import java.util.*;
public class ATM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner console=new Scanner(System.in);
int ctr=1;
boolean error=false;
String zip="";

do{
	System.out.println("Enter Zip Code:");
	zip=console.nextLine();
	if (ctr==3){
		System.out.println("your account is blocked");
		break;
	}
	else if (zip.length() <4 || zip.length()>4){
		error=true;
		ctr++;}
	else if(zip.equals("4351")){
		System.out.println("Zip Code Is Correct");
		break;
	}
	else{
		System.out.println("Zip code is incorrect");
		error=true;
		ctr++;
	}
}while(error);
	}
}

	