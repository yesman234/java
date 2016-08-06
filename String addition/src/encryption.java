import java.util.Scanner;
import java.util.ArrayList;

public class encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> usedElements=(new ArrayList<Integer>());
		ArrayList<String> encryptedWords=(new ArrayList<String>());
		@SuppressWarnings("resource")
		Scanner input = ( new Scanner( System.in ) );
		String word = ("");
		String encryptedWord=("");
		
		
		
		System.out.print("enter a word to scramble");
		
		word = input.nextLine();
		String[] allWords = null;
		allWords=word.split("");
		
		for (int i =(0); i<allWords.length; ++i){
		usedElements.clear();
		encryptedWord=("");
		
		int randNum =(0);
		
		for(int x =(0); x<allWords[i].length();++x){
			
			randNum =(int)Math.floor(Math.random()*allWords[i].length ());

		while(usedElements.contains(randNum)){
			randNum =(int)Math.floor(Math.random()*allWords[i].length ());
		}
		encryptedWord+=allWords[i].charAt(randNum);
		usedElements.add(randNum);
			}
			
		encryptedWords.add(encryptedWord);
		}
		encryptedWord =("");
		
			
			for(int i = (0); i<(encryptedWords.size()); ++i){
				encryptedWord+= encryptedWords.get(i);
				encryptedWord+="";
		
		}
		System.out.println("Encrypted Sentence:" +encryptedWord);
		
	
	}
	
	
	}
	



