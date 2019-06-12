import java.util.Arrays;

/*Exadatum Question 1 ---Print Rarest occurence */


public class PrintRare{
    public static void main(String[] args){
        String input = "122321344";
        char[] inputArray = input.toCharArray();
        int lengthArray = inputArray.length;
        int[] countArray = new int[10];
        int min =0;
        int[] countArraycpy = new int[10];
        for(int i =1 ; i <= 10 ; i++)
        {
            int count = 0;
            for(int j =0 ; j < lengthArray ; j++)
            {
                if(i == inputArray[j]-'0')
                count++;
            }
            countArray[i-1]=count;
            countArraycpy[i-1] = count;
        }

        // for(int i =0 ; i < 10 ; i++)
        // {
        //     System.out.println(countArray[i]);
        // }
        Arrays.sort(countArraycpy);
        
        


        // for(int i =0 ; i < 10 ; i++)
        // {
        //     System.out.println(countArray[i]);
        // }

        for(int i =0 ; i < 10 ; i++)
        {
            if(countArraycpy[i]==0)
            continue;
            else{
                min = countArraycpy[i];
                break;
            }
        }

        //System.out.println(min);

        for(int i  = 10 ; i  > 0 ; i--)
        {
            if(countArray[i-1]==min){
                System.out.println(i);
                break;
            }
        }


    }
}
