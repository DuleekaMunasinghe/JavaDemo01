public class OpertatorDemo_increment_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 + operator in java has 2 different behaviors
		 It is used for addition numeric values
		 It is used for contamination of strings
		 */
		
		increment_ops();
		
				
	}
	
	public static void contatination() {
		
		
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10"+20);
		
	}
	public static void increment_ops() {
		
		int a=5;
		//pre increment
		System.out.println(++a);
		//post increment
		int b=8;
		System.out.println(b++);
		int c=b;
		System.out.println(c);
	/*
		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10"+20);
		*/
	}
	}
