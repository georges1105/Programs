package determination;

public class PrintBinary {

	public static void main(String[] args) {
		int n = 4;
		printbinary(n,"");
	}
	public static void printbinary(int n,String s)
	{
		//System.out.println("printbinary("+n+","+s+")");
		if(n == 0)
		{
			System.out.println(s);
		}
		else
		{
		printbinary(n-1,s+"0");
		printbinary(n-1,s+"1");
		}
	}

}
