import java.util.*;
import java.util.Scanner;
public class PrimeDigitRelationalOperators {
    public static void main(String args[])
    {
    try(Scanner sc=new Scanner(System.in))
    {
        int n=sc.nextInt();
        if(n<10000||n>32000)
        {
            System.out.println(n+" is out of range");
        }
        if(n>=10000&&n<=32000)
        {
        int maxprime=-1;
        int digit=0;
        int temp=n;
        while(temp>0)
        {
             digit=temp%10;
            temp=temp/10;
            if(digit==2||digit==3||digit==5||digit==7)
            {
                if(digit>maxprime)
                {
                    maxprime=digit;
                }
            }
        }
        if(maxprime==-1)
        {
            System.out.println("Valid (" + n + ") : None");
            return;
        }
        int digit1 = 0;
        temp = n;
while(temp > 0)
{
    digit1 = temp % 10;

    if(digit1 > maxprime)
        System.out.print(">");

    else if(digit1 < maxprime)
        System.out.print("<");

    else
        System.out.print("==");

    temp = temp / 10;
     if (temp > 0)
                        System.out.print(",");
}

    }
}
    }
}

