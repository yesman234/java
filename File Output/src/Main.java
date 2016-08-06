import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner cinput = (new Scanner(System.in));
		String fileName= ("");
		
		
		
		
		System.out.println("enter filename");
		fileName= (cinput.nextLine());
		
		File file = (new File(fileName));
		
		try{
			file.createNewFile();
			FileWriter fout = (new FileWriter(file.toString()));
			fout.write("Hello World");
			fout.close();

		}
catch(IOException e) {
	System.err.println(e.getMessage());
}
		
	}

}
