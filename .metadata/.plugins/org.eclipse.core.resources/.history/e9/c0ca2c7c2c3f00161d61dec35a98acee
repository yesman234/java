import java.util.Scanner;

public class CalcTime {
	
	public static double calcDay( double year ) {
		
		return( year * 365 );
	}
	
	public static double calcHour( double year ) {
		
		return( year * 365 * 24 );
	}

	public static double calcMin( double year ) {
		
		return( year * 365 * 24 * 60 );
	}
	
	public static double calcSec( double year ) {
		
		return( year * 365 * 24 * 60 * 60 );
	}
	
	public static double calcMS( double year ) {
		
		return( year * 365 * 24 * 60 * 60 * 1000 );
		
	}
	
	public static void main(String[] args) {

		Scanner cinput = ( new Scanner( System.in ) );
		
		double year = ( 0 );
		
		System.out.print( "Enter # of year(s): " );
		year = ( cinput.nextDouble( ) );
		
		System.out.println( year + " converted to day(s) is: " + calcDay( year ) );
		System.out.println( year + " converted to hour(s) is: " + calcHour( year ) );
		System.out.println( year + " converted to min(s) is: " + calcMin( year ) );
		System.out.println( year + " converted to sec(s) is: " + calcSec( year ) );
		System.out.println( year + " converted to MS(s) is: " + calcMS( year ) );
		
	}

}
