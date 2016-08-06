import java.util.Scanner;

public class Task5 {

	public static void main(String[] args){
		String Employee[][]=new String[1][6];
		Scanner input = (new Scanner(System.in ));
		//input
		for (int i=0; i<Employee.length; i++){
			System.out.println("please enter your employee name");
			Employee[i][0]=input.nextLine();
		
			System.out.println("please enter your employee id");
			Employee[i][1]=input.nextLine();
			
		
			System.out.println("please enter your employee department");
			Employee[i][2]=input.nextLine();
			
		
			System.out.println("please enter your marrital status ");
			Employee[i][3]=input.nextLine();
			
		
			System.out.println("please enter your employee date of marraige");
			Employee[i][4]=input.nextLine();
			
		
			System.out.println("please enter your employee designation");
			Employee[i][5]=input.nextLine();
			
		}
		//output
		for (int i=0; i<Employee.length; i++){
			System.out.println("employeename:"+Employee[i][0]);
			System.out.println("Employeeid:"+Employee[i][1]);
			System.out.println("Employee department:"+Employee[i][2]);
			System.out.println("Employee status:"+Employee[i][3]);
			System.out.println("Employee date of marraige:"+Employee[i][4]);
			System.out.println("Employee designation:"+Employee[i][5]);
		}
		
		
		
		
	}}
