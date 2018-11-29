package determination;

import java.util.Scanner;

public class IpValidate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ip address to validate:");
		String address= scan.nextLine();
		char[] addr = address.toCharArray();
		boolean validate = false ;
		int num = 0,count=0;
 		for(int i = 0 ; i < addr.length ; i++)
		{
 			if (count < 3 || num < 255 || num > 0)
			{
				if(addr[i]=='.')
				{
					count++;
					num =0;
				}
				else
				{
					num = num*10 + (addr[i]-48);
					System.out.println("__"+addr[i]+"__"+num+"__");
				}
			}
			else
			{
				validate = true;
				System.out.print(i+"B");
			}
 			if(count > 3 || num > 255 || num < 0)
			{
				validate = false;
				System.out.print(i+"A"+num +" "+ count + " ");
				break;
			}
		}
 		
 		if (validate == true)
 			System.out.println("Ip Address is Valid");
 		else 
 			System.out.println("Ip Address is InValid");
		scan.close();
	}

}
