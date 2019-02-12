package determination;

import java.util.Scanner;

public class NextGreatest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] strarr= s.toCharArray();
		int count =0;
		int t=999;
		int[] num = new int[20];
		for(int i =0 ; i < strarr.length ; i ++)
		{
		if(strarr[i]==',')
		{
			count++;
		}else if(strarr[i]=='{'||strarr[i]=='}')
			continue;
		else
		num[count]= num[count]*10 + (strarr[i]-'0');
		}
//		for(int j =0 ; j <= count ; j ++)
//		System.out.println(num[j]);
		
		for(int i = 0 ; i <= count ; i++)
		{
			for(int j = 0 ; j <= count ; j++)
			{
				if(j == i)
					continue;
				if(num[j]>num[i]&&t>num[j])
				{
					t=num[j];
				}
			}
			if(t==999)
				System.out.print(num[i]+"->"+" ,");
			else
			System.out.print(num[i]+"->"+t+",");
			
			t=999;
		}
		
		scan.close();
	}

}

//2,6,7,9,3,4,8