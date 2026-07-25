import java.util.HashSet;
import java.util.Scanner;

class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        while(right<s.length())
        {
            char ch=s.charAt(right);
            if(!set.contains(ch))
            {
                set.add(ch);
                if(right-left+1>max)
                {
                    max=right-left+1;
                }
                right++;
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Longest_Substring_Without_Repeating_Characters  obj=new Longest_Substring_Without_Repeating_Characters();
        int result=obj.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}