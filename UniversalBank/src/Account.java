
public class Account {
int acctNo;
String acctType;
String acctStatus;
double acctBalance;

public void getAccount(){
	acctType = "saving";
	acctStatus ="valid";
	acctBalance = 10000000.00;
			
	
}

public void displayAccount(){
	System.out.println("Account No:"+ acctNo);
	System.out.println("Account Type:" + acctType);
	System.out.println("Account status:" + acctStatus);
	System.out.println("Account balance" + acctBalance);
}
}
