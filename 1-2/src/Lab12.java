

import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
	
		Scanner input = ( new Scanner( System.in ) );
		
		double avg = 0;
		double sum = 0;
		double num = 0;
		double min = 9999999;
		double max = -9999999;
		double i = ( 0 );
		
		for( i = ( 0 ); i < ( 5 ); ++i ) {
			System.out.print( "Enter a number: " );
			num = ( input.nextDouble( ) );
			
			//calculate sum
			sum += ( num );
			
			//calculate max
			if( num > max ) {
				max = num;
			}
			
			//calculate min
			if( num < min ) {
				min = num;
			}
			
		}
		
		avg = ( sum / i );
		
		System.out.println( "Cnt:\t" + i );
		System.out.println( "Sum:\t" + sum );
		System.out.println( "Avg:\t" + avg );
		System.out.println( "Min:\t" + min );
		System.out.println( "Max:\t" + max );
		

	}

}