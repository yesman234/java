import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Lab1 {

	public static void main(String[] args) {
		Scanner cinput = (new Scanner(System.in));
		String fileName= ("");
		String firstName=("");
		String lastName=("");
		String zipcode=("");
		String address=("");
		String phone=("");
		String country=("");
		
		
		
		System.out.println("first name");
		fileName= (cinput.nextLine());
		
		System.out.println("enter zip");
		zipcode= (cinput.nextLine());
		
		System.out.println("last name");
		firstName= (cinput.nextLine());
		
		System.out.println("country");
		lastName= (cinput.nextLine());
		
		System.out.println("address");
		address= (cinput.nextLine());
		
		System.out.println("phone");
		phone= (cinput.nextLine());
		
		
		File file = (new File(firstName+".txt"));
	


		try{
			file.createNewFile();
			FileWriter fout = (new FileWriter(file.toString()));
			String message= firstName+lastName+ country +address+phone+zipcode;
			fout.write(message);
			fout.close();

		}
catch(IOException r) {
	System.err.println(r.getMessage());
}
		
	}


	}

