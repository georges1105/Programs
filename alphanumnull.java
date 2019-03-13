public class alphanumnull{
    
    public static boolean isalpha(char c)
    {
        if( ( (int)c >= 65 && (int)c <= 90 )||( (int)c <= 122 && (int)c >= 97) )
        return true;
        else return false;
    }

    public static boolean isnum(char c)
    {
        if( (int)c <= 57 && (int)c >= 48 ) 
        return true;
        else return false;
    }

    // public static boolean isnull(char c)
    // {
    //      if((int)c == 36)
    //      return true;
    //      else return false;
    // }


    
    public static void main(String[] args)
    {
        String str;
        str = "z5oh7$o7$";
        char[] s = str.toCharArray();
        int iterator =0;
        for(int i =0 ; i < s.length ; i++)
        {
            if(isalpha(s[i]))
            {
                if(iterator == 0)
                {
                iterator++;
                continue;
                }
                else 
                {
                    int j = i;
                    while(j > iterator)
                    {
                    char temp1 = s[j];
                    s[j] = s[j-1];
                    s[j-1]=temp1;
                    j--;
                    }
                    iterator++;
                }
            }
            else continue;
        }

        for(int i =0 ; i < s.length ; i++)
        {
            if(isnum(s[i]))
            {
                if(iterator == 0)
                {
                iterator++;
                continue;
                }
                else 
                {
                    int j = i;
                    while(j > iterator)
                    {
                    char temp1 = s[j];
                    s[j] = s[j-1];
                    s[j-1]=temp1;
                    j--;
                    }
                    iterator++;
                }
            }
            else continue;
        }

        System.out.println(s);        
    }
}