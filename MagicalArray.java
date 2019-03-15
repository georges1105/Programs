import java.util.Arrays;

public class MagicalArray{

    public static int no_of_divisors(int n)
    {
        int i=1,count=0;
        while(i<=n)
        {
            if(n%i==0)
            count++;
            i++;
        }
        return count;
    }

    public static int increase_value(int n)
    {
        int count=0;
        while(true)
        {
            if(no_of_divisors(n)==3){
                return count;
            }
            else{
                n=n+1;
                count++;
            }
        }
    }

    public static int decrease_value(int n)
    {
        int count=0;
        while(true)
        {
            if(no_of_divisors(n)==3||n ==0){
                if(n==0)
                return 999;
                else
                return count;
            }
            else{
                n=n-1;
                count++;
            }
        }
    }

    public static void main(String[] args){

        int[] input = {1,4,10,8,15};
        int n=5;
        int sum=0,k = 3;
        int[] low_count_array = new int[n];
        
        for(int i =0 ; i < n ; i++)
        {
            int a = increase_value(input[i]);
            int b = decrease_value(input[i]);
            low_count_array[i]=a < b ? a : b;
        }

        for(int i =0 ; i < n ; i++)//testing
        {
            System.out.println(low_count_array[i]);
        }

        Arrays.sort(low_count_array);
        
        for(int i =0 ; i < n ; i++)//testing
        {
            System.out.println(low_count_array[i]);
        }

        for(int i = 0 ; i < k ; i++)
        {
            sum = sum + low_count_array[i];
        }
        
        System.out.println(sum+(n-k));
    }
}