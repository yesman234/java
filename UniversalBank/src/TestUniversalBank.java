import java.util.Scanner;
public class TestUniversalBank {
	Scanner input = ( new Scanner( System.in ) );
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acct = new Account();
acct.getAccount();
acct.displayAccount();
Branch brnch = new Branch();
brnch.getBranch();
brnch.displayBranch();
Customer cst = new Customer();
cst.getCustomer();
cst.displayCustomer();
Employee emp = new Employee();
emp.getEmployee();
emp.displayEmployee();
	}

}
