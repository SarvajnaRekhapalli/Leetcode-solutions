import java.util.*;
class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(char ch:magazine.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray())
        {
            if(freq[ch-'a']==0)
            return false;
        freq[ch-'a']--;
    }
        return true;
}

public static void main(String args[])
{
    try(Scanner sc=new Scanner(System.in))
    {
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        RansomNote obj=new RansomNote();
        boolean result=obj.canConstruct(s1, s2);
        System.out.println(result);
    }
}
}