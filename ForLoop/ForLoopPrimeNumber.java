package ForLoop;

public class ForLoopPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (initiyaization, condition, iterstion)
		{
			<<ststments>>
		}
		*/
		
		int num;
		boolean isPrime;
		num = 13;
		if(num < 2)
		isPrime=false;
		else
		isPrime = true;
		
		for (int i=2; i<=num/i; i++)
		{
			if ((num % i==0))
			{
				isPrime=false;
				break;
			}	
		}
			if(isPrime)
			{
				System.out.println("Number is prime number ");
			}
			else
				System.out.println("Number is not a prime number ");	
		
	}

}



