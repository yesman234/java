
public class Customer {
int custId;
String cusName;
String cusAddress;
String cusPhone;
String cusEmail;



public void getCustomer(){
	cusName="Enter name";
	cusAddress="enter address";
	cusPhone="enter a phone number";
	cusEmail="enter you email";
}
public void displayCustomer(){
	System.out.println("Name:"+ cusName);
	System.out.println("Address:" + cusAddress);
	System.out.println("phone num:" + cusPhone);
	System.out.println("Email" + cusEmail);
}
}
