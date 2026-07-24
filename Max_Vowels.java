import java.util.*;
public class Max_Vowels {
    public int maxVowels(String s, int k) {
        char[] ch=s.toCharArray();
        int left=0;
        int max=0;
        int count=0;
        int start=0;
        for(int r=0;r<s.length();r++)
        {
           if(ch[r]=='a'||ch[r]=='e'||ch[r]=='i'||ch[r]=='o'||ch[r]=='u')
           {
            count++;
           }
           if(r-left+1==k)
           {
            if(count>max)
            {
            max=count;
            start=left;
            }
            if(ch[left]=='a'||ch[left]=='e'||ch[left]=='i'||ch[left]=='o'||ch[left]=='u')
            {
            count--;
            }
            left++;
           }
        }
             for(int i=start;i<start+k;i++)
            {
               System.out.print(ch[i]);
            }
            System.out.println();
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        Max_Vowels m = new Max_Vowels();
        int result = m.maxVowels(s, k);
        System.out.println(result);
    }
}