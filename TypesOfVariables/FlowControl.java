package TypesOfVariables;

public class FlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		if (boolean condition)
		{
			//stat inside if will get executed
			
		}
		
	} 	// if condition is false then next statement 
	
	*/
		// Larges among 3 numbers 40 75 15
		
		int a = 40, b = 75, c = 15;
		// compare a with b and a with c
		// if both condition are true a is the lager
		if (a>=b && a>=c)
		{
		System.out.println("Largerst of 3 numbers is :" +a );	
		}
		
		if (b>=a && b>=c)
		{
		System.out.println("Largerst of 3 numbers is :" +b );	
		}
		
		if (c>=a && c>=b)
		{
		System.out.println("Largerst of 3 numbers is :" +c );	
		}
		
		
		
		}
		
}
