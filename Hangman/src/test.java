import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
	    StringBuffer buffer = new StringBuffer();

	    String secretWord;
	    int secretWordLength;
	    int position;
	    int livesLost = 0;
	    int totalLives = 10;
	    int lettersRemaining;
	    boolean guessInWord;
	    char guess;
	    StringBuffer prevGuessedLetters;
	    

	    //prompt user to enter a word and set as an instance of the secretWord variable
	    System.out.println("Enter a word:");
	    secretWord = myScanner.next();

	    //determine the length of the word entered
	    secretWordLength = secretWord.length();
	    System.out.println(secretWordLength);
	    lettersRemaining = secretWordLength;

	    for (position = 0; position < secretWordLength; position++) {
	        System.out.print("*");
	    }
	    System.out.println();

	    //loop starts
	    while (lettersRemaining > 0 && livesLost < 10) {
	        //prompt user to guess a letter
	        System.out.println("Guess a letter:");
	        guess = myScanner.findWithinHorizon(".", 0).charAt(0);

	        //check if the letter guessed is in the secretWord  
	        guessInWord = (secretWord.indexOf(guess)) != -1;

	        if (guessInWord == false) {
	            livesLost++;
	            System.out.print("        ______   \n"
					    +"	|    |   \n"
					    +"	|    0   \n"
					    +"	|  _-|-_ \n"
					    +"	|    |   \n"
					    +"	|  _- -_ \n"
					    +"	|        \n"
					    +"	|		 \n"
						+"      ===========\n");
	            System.out.print("Sorry, you have lost a life. You still have ");
	            System.out.print(totalLives - livesLost);
	            System.out.println(" life/lives left. Keep trying.");
	        } else {
	            System.out.println("That was a good guess, well done!");

	            for (position = 0; position < secretWordLength; position++) {
	                if (secretWord.charAt(position) == guess) {
	                    System.out.print(guess);
	                    lettersRemaining--;
	                } else {
	                    System.out.print("*");
	                }
	            }
	        }
	        System.out.println();
	        prevGuessedLetters = buffer.append(guess);
	        System.out.print("Previously guessed letters: ");
	        System.out.println(prevGuessedLetters);
	        System.out.print("Letters remaining: ");
	        System.out.println(lettersRemaining);
	    }

	    if (livesLost == totalLives) {
	        System.out.println("Sorry, you lose!");
	    } else {
	        System.out.print("Well done, you win! The word was ");
	        System.out.println(secretWord);
	    }
	}
	
	}

