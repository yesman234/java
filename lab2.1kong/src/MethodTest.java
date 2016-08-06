
public class MethodTest {
	static void display(Long p, Long q)
	{
		System.out.println("Method with long parameters");
	}
	static void display(int...p)
	{
		System.out.println("Method with int parameter");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
display(5,6);
	}

}
