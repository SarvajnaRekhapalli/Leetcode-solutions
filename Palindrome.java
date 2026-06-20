import java.util.*;
class Palindrome {
    public boolean isPalindrome(int x) {
    int temp=x;
      int rev=0;
      while(x!=0)
      {
      int rem=x%10;
      rev=(rev*10)+rem;
      x=x/10;
      }
      if(rev==temp)
      return true;
      else
      return false;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n=sc.nextInt();
            Palindrome p=new Palindrome();
            System.out.println(p.isPalindrome(n));
        }
    }
}