

public class A {public long display(){
	long n= 57;
	return n;
	
}
}
class B extends A{
public long display(){
	char ch= 'a';
	long n=37;
	return ch;
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	A a = new B();
	System.out.println(a.display());

}

}
