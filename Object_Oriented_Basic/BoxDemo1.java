package Object_Oriented_Basic;

class BoxDemo1 {

	public static void main(String[] args) {
		// syntax
		// classname objname = new class name();
		// declaring object is a two step process
		// declare a variable of class type here b1 of Box2
		// assigning values to object b1, which is instance of class Box2
		 //b1; // declare reference to an object
		// to create an object
		// using new operator we allocate memory to the object
		//double volume = 0;
		// Assigning values to object b1, which is instance of class Box2
		
		Box1 b1 = new Box1(); // allocate memory to b1

		// Box2 b1 = new Box2();
		// object -- instance of a class
		
		b1.width = 10; // dot operator is used to access instance variable of an object
		b1.height = 20;
		b1.depth = 15;

		// dot operator I can access instance variable and method
		// obj.instancevariable
		// obj.method

		// volume of object b1
		b1.volume(); // calling the method display volume of object b1

		// every object will have own copy of instance variable

		// b2; // to create an object

		Box1 b2 = new Box1();

		b2.width = 25; // dot operator is used to access instance variable of an object
		b2.height = 5;
		b2.depth = 16;

		// volume of object b2
		/*
		 * volume=b2.width*b2.height*b2.depth;
		 * System.out.println("Volume of box b2 is "+volume);
		 */

		// each time we create an object(instance of a class)
		b2.volume(); // display volume of display b2
		System.out.println("test 1");
		System.out.println("Volume is b1 " + b1.volume());
		System.out.println("Volume is b2 " + b2.volume());
	}

}
