package determination;

import determination.stack;

public class ArrayUnion {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {2,3};
		Stack stk = new Stack();
		for(int i =0 ; i < a.length ; i++)
		{
			for(int j =0 ; j < b.length ; j++)
			{
				if(a[i]==b[j])
				{
					stk.insert(a[i]);
				}
			}
		}
		
		stk.printStack(stk);
	}

}
