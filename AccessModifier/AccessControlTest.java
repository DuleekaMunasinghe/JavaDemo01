package AccessModifier;

public class AccessControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessControlDemo obj1= new AccessControlDemo();
		
		obj1.a=10;
		obj1.b=20;
		obj1.setC(30); // because 'C' is private, using a method only c can be accessed
		System.out.println("VAlue of a :"+ obj1.a);
		System.out.println("VAlue of b :"+obj1.b);
		System.out.println("VAlue of c :"+obj1.getc());// because 'C' is private, using a method only c can be accessed
	}

}
