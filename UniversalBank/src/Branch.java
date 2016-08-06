
public class Branch {
	int braCode;
	String braAddress;
	String braCountry;
	
	
	public void getBranch(){
		braAddress="Whats your address";
		braCountry="What country location?";
	}
public void displayBranch(){
	System.out.println("Address of Branch:" +  braAddress);
	System.out.println("Country of Branch:" +  braCountry);
	
}
}
