package determination;

public class FibonacciRecur {

	public static void main(String[] args) {
		int n=4;
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
		return fibonacci(n-1) + fibonacci (n-2);
		}
	}

}
