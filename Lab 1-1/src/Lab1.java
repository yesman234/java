import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = ( 0 );
		Scanner input = ( new Scanner( System.in) );
		
		for( int i = 0; i < ( 50 ); ++i){
			
			System.out.print( "Enter a number: " );
			num = ( input.nextInt( ) );
			
			System.out.print( "The number you entered is " );
			
			if( num % 2 == ( 0 ) ) {
				System.out.print( "even" );
			}
			else {
				System.out.print( "odd" );
			}
			
			System.out.print( " and your number is " );
			
			if( num < 0 ) {
				System.out.println( "negative" );
			}
			else {
				System.out.println( "positive" );
			}
	   }
   }



	}


