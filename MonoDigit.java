public class MonoDigit{

    static boolean ismononumber(int num){
        int prev = num % 10;
        num = num/10;
        while(num != 0){
            if(num%10 != prev){
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    static int pos(int num){
        if(num >0){
            return num;
        }
        else return -1*num;
    }

    // static void mono(int[] arr,int sum,int n){
    //     if(n > 1){
    //     mono(arr,sum*10+arr[n-1],n-1);
    //     mono(arr,sum*10+arr[n-1]+arr[n-2],n-2);
    //     // mono(arr,sum*10+(arr[n-1]-arr[n-2]),n-2);
    //     mono(arr,sum*10+pos(arr[n-1]-arr[n-2]),n-2);
    //     }else {
    //         if(ismononumber(sum)){
    //            System.out.print(sum);
    //            System.out.println("mono");
    //         }
    //         else System.out.println(sum);
    //     } 
    // }

    static void mono(int[] arr,int sum,int n){
        
        if(ismononumber(sum)&& n <=0){
            System.out.print(sum);
            // System.out.println("mono");
         } 
         else{
            if(n > 0){
        mono(arr,sum*10+arr[n-1],n-1);
        }
        if(n>1){
        mono(arr,sum*10+arr[n-1]+arr[n-2],n-2);
        mono(arr,sum*10+(arr[n-1]-arr[n-2]),n-2);
        // mono(arr,sum*10+pos(arr[n-1]-arr[n-2]),n-2);
        }
    }
    }


    public static void main(String[] args){
        int[] arr = {2,5,7,6,1};
        // int[] arr = {7,7};
        mono(arr,0,5);
        // System.out.println(ismononumber(7888));
    }
}