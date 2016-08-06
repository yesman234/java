import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Lab1 {

	public static void main(String[] args) {
		Scanner cinput = (new Scanner(System.in));
		String fileName= ("");
		
		
		
		System.out.println("enter zip");
		fileName= (cinput.nextLine());
		
		System.out.println("first name");
		fileName= (cinput.nextLine());
		
		System.out.println("last name");
		fileName= (cinput.nextLine());
		
		System.out.println("country");
		fileName= (cinput.nextLine());
		
		System.out.println("address");
		fileName= (cinput.nextLine());
		
		System.out.println("phone Number");
		fileName= (cinput.nextLine());
		
		
		File file = (new File(fileName));

		try{
			file.createNewFile();
			FileWriter fout = (new FileWriter(file.toString()));
			fout.write("user.input");
			fout.close();

		}
catch(IOException e) {
	System.err.println(e.getMessage());
}
		
	}


	}


