

public class Parent {
	public Parent()
	{
		System.out.println("drfsefvsdfser");
		
	}

}
class Child extends Parent
{
	public Child()
	{
		System.out.println("ergerfrfe");
	}
	


	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c1 = new Child();
		Child c1 = new Parent();
		// TODO Auto-generated method stub

	}

}
