import java.util.Scanner;

class Stringrev {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++)
        {
          char temp=s[i];
          s[i]=s[s.length-1-i];
          s[s.length-1-i]=temp;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] s = input.toCharArray();

        Stringrev obj = new Stringrev();
        obj.reverseString(s);

        System.out.print("Reversed string: ");
        for(char c : s)
        {
            System.out.print(c);
        }
    }
}