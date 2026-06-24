import java.util.*;
class FirstUniqueChar {
    public int FirstUniqueChar(String s) {
        char[] ch=s.toCharArray();
        int temp=0;
        for(int i=0;i<s.length();i++)
        {
            int count=1;
            for(int j=0;j<s.length();j++)
            {
                if(j==i) continue;
                if((ch[i]==ch[j]))
                count++;
            }
             temp=i;
        if(count==1)
        return temp;
        }
        return -1;  
        }
        public static void main(String args[])
        {
            try(Scanner sc=new Scanner(System.in))
            {
                String s=sc.nextLine();
                char[] ch=s.toCharArray();
                FirstUniqueChar obj=new FirstUniqueChar();
                int result=obj.FirstUniqueChar(s);
                if(result==-1)
                System.out.println("No unique character found");
                else
                System.out.println("First unique character index is: "+result);

            }
        }   
           }