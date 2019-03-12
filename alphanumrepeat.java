
//import java.util.Scanner;

public class alphanumrepeat{
    
   public static void getoutput(String st)
    {
        if(st.contains("(")||st.contains("{"))
        {
        int temp=0,temp1=0;
        String str="",str1="";
        char[] s =st.toCharArray();
            for(int i =0 ; i < s.length ; i++)
            {
            if(s[i]=='(')
                {
                temp=i;
                }
            else if(s[i]==')')
                {
                str = st.substring(temp+1,i);
                }
            else if(s[i]=='{')
               {
              continue;
              }
            else if(s[i]=='}')
                {
             temp1=i;
                for(int j =0 ; j< s[i-1]-48 ;j++)
                    {
                    str1=str1+str;
                    }
                break;
                }
            }
            //System.out.println(str1);
            //System.out.println(st.substring(temp,temp1+1));
            //System.out.println(st);

            getoutput(st.replace(st.substring(temp,temp1+1),str1));
            }
            else
            {
            System.out.println(st);
            }
    }

    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
        String st;
        st = "a(b(c){2}){2}d";
        //st = "(a(b(c){2}){2}d){3}";
        getoutput(st);
    }
}
