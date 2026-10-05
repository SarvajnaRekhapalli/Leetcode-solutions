import java.util.Scanner;
class Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==1)
            {
                count++;
            if(count>max)
            {
                max=count;
            }
            }
            else
            {
            count=0;
            }
           }
        return max;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        Consecutive_Ones obj=new Consecutive_Ones();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}
}