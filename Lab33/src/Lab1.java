
public class Lab1 {

	
	public static int randInt(int min, int max) {
	//if min is 0 ad max is 10 then this will provide us a random between 0-10
	int randomNum = min + ((int)(Math.random() * (max-min) + 1));
	return randomNum;
    
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highestnumber =0;
		int[] listOfRandomNumbers = new int[10];
		for (int counter = 0; counter < listOfRandomNumbers.length ; counter++)
		{
			listOfRandomNumbers[counter] = randInt(0,10);
		}
		int counter = 0;
		while (counter < listOfRandomNumbers[counter])
		{
		System.out.println(listOfRandomNumbers[counter]);
			counter++;
		}
		System.out.println("counter is"+ counter);
		if(counter==1) 
			{
			highestnumber = listOfRandomNumbers[0];
			}
		    else{
		    	highestnumber = HighestNumber(listOfRandomNumbers);
		    }
		    
		System.out.println(highestnumber);
	}
public static int HighestNumber(int[] myArray){
	//get the first number
	int highestNum = myArray[0];
	for (int counter = 0; counter < myArray.length ; counter ++)
	{
		if (highestNum < myArray[counter])
		{
			highestNum = myArray[counter];
		}
	}
	
	return highestNum;

		}
	}


