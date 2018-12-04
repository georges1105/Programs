package determination;

public class Pattern1 {

	public static void main(String[] args) {
		int n =6,add;
		for(int i = 1 ; i <= n ; i++)
		{
			add =0;
			for(int j = 1,k=0; k <= n-i ; j=j+n-k,k++)
			{
				add = i+j-1;
				System.out.print(add+" ");
			}
			System.out.println();
		}
		
	}
	public static int sum(int sum,int n)
	{
		if(n==0)
		{
			
			return sum;
		}
		return n + sum(sum,n-1);
	}
}
