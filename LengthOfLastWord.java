import java.util.*;
public class LengthOfLastWord
{
    public int LengthOfLastWord(String s)
    {
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            while(i>=0&&ch[i]==' ')
            {
                i--;
            }
            int count=0;
            while(i>=0&&ch[i]!=' ')
            {
                count++;
                i--;
            }
            return count;
        }
        return 0;
    }
    public static void main(String args[    ])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            String s=sc.nextLine();
            LengthOfLastWord obj=new LengthOfLastWord();
            int result=obj.LengthOfLastWord(s);
            System.out.println(result);
        }
    }
}