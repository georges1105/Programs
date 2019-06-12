package determination;

public class ArrayMerge {

	public static void main(String[] args) {
		
		int i=0,j=0;
		int[] a = {2,4,6,7};
		int[] b = {3,5,8,9,10};
		
		while(i<a.length || j<b.length)
			{
			if(i<a.length && a[i]<b[j])
				{
					System.out.println(a[i]);
					i++;
				}	
			else
				{
					System.out.println(b[j]);
					j++;
				}
			}

	}

}

