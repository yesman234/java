
public class Employee {
	int empId;
	String empName;
	String empAddress;
	int phoneNum;
	String empEmail;
	
	public void getEmployee(){
		empName ="enter name";
		empAddress="enterAddress";
		empEmail="enter Email";
	}
	public void displayEmployee(){
		System.out.println("Employee ID:"+ empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Address:" + empAddress);
		System.out.println("Employee Phone:" + phoneNum);
		System.out.println("Employee Email:" + empEmail);
	}

}
