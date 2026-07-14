import java.util.*;
public class RightRotateOpt
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
           System.out.println("Enter the size of the array:");
           int n=sc.nextInt();
           int arr[]=new int[n];
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
          System.out.println("Enter the number of positions to rotate:");
          int k=sc.nextInt();
          k=k%n;
          int start=0;
          int end=n-1;
          while(start<end)
          {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
          }
         start=0;
         end=k-1;
          while(start<end)
          {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
          }
          start=k;
        end=n-1;
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    }
