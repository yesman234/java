public class lowestvalueLab {

	
	public static int randInt(int min, int max) {
	//if min is 0 ad max is 10 then this will provide us a random between 0-10
	int randomNum = min + ((int)(Math.random() * (max-min) + 1));
	return randomNum;
    
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowestnumber =0;
		int[] listOfRandomNumbers = new int[10];
		for (int counter = 0; counter < listOfRandomNumbers.length ; counter++)
		{
			listOfRandomNumbers[counter] = randInt(0,10);
			System.out.println(listOfRandomNumbers[counter]);	
		}
		int counter = 10;
		//while (counter < listOfRandomNumbers[counter])
	//	{
		//System.out.println(listOfRandomNumbers[counter]);
			//counter++;
		//}
		System.out.println("counter is"+ counter);
		lowestnumber = lowestNumber(listOfRandomNumbers);
		System.out.println(lowestnumber);
			
	}
		
		
		//if(counter==1) 
			//{
			//lowestnumber = listOfRandomNumbers[0];
		//	}
		  //  else{
		    //	lowestnumber = lowestNumber(listOfRandomNumbers);
		   // }
		    
		//System.out.println(lowestnumber);
	//}


public static int lowestNumber(int[] myArray){
	//get the first number
	int lowestNum = myArray[0];
	//System.out.println(listOfRandomNumbers.length);	
	
	for (int counter = 0; counter < myArray.length ; counter ++)
	{
		//System.out.println(listOfRandomNumbers[counter]);	
		if (lowestNum > myArray[counter])
		{
			lowestNum = myArray[counter];
		}
	}
//	System.out.println(lowestNum);
	
	return  lowestNum;
	}
}
