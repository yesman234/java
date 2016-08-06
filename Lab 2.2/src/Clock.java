

public class Clock {

public static void main(String[] args){

    int h = 0;
    int m = 0;
    int s = 0;

    for(s = 1; s != -1; s++){
    	try {
    		Thread.sleep(1000);
    	} catch (InterruptedException ie) {
    		
    	}
    	
        if(s >= 60){
            m++;
            s = 0;
            if(m >= 60){
                h++;
                m = 0;
                if(h >= 24){
                h = 0;
                }
            }
        }
        
        if( h < 10 ) {
        	System.out.print( "0" + h );
        }
        else {
        	System.out.print( h );
        }
        
        System.out.print( ":" );
        
        if( m < 10 ) {
        	System.out.print( "0" + m );
        }
        else {
        	System.out.print( m );
        }
        
        System.out.print( ":" );
        
        if( s < 10 ) {
        	System.out.println( "0" + s );
        }
        else {
        	System.out.println( s );
        }
          
    }

}


}