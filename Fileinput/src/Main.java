import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		Scanner cinput= (new Scanner(System.in));
		String fileName = ("");
		String fileLine=("");
		
		try{
			System.out.println("Enter FileName to read from:");
			fileName= (cinput.nextLine());
			
			File file =(new File(fileName));
			
			System.out.println( fileName );
			
			if(!file.exists()){
				throw new IOException("File does not exist");
				
			}
		FileReader fr = (new FileReader(file.toString()));
		BufferedReader br=(new BufferedReader(fr));
		
		while((fileLine= (br.readLine()))!=null){
			//System.out.println(fileLine);
			if(fileLine.contains("asdcsdcasdcsasdc")){
				System.out.println("String Found");
			}
		}
		br.close();
		}
		catch(IOException e) {
			System.err.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
		
		

	}}


