import java.util.Scanner;
class Removeduplicates {
    public int removeduplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
                if(nums[i]!=nums[i-1])
                {
                    nums[k]=nums[i];
                    k++;
               }
            }
            System.out.println("Unique elements are: ");
            for(int i=0;i<k;i++)
            {
                System.out.println(nums[i]);
            }
            System.out.println("No.of unique elements: ");
            return k;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
            Removeduplicates rd=new Removeduplicates();
            int result=rd.removeduplicates(nums);
            System.out.println(result);
        }
    }
}