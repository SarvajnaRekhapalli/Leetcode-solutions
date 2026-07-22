import java.util.*;
class MaxAvgSubArray {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        double avg=0;
        int max=Integer.MIN_VALUE;
        for(int r=0;r<nums.length;r++)
        {
            sum=sum+nums[r];
            if(r-left+1==k)
            {
            if(sum>max)
            {
                max=sum;
            }
            sum=sum-nums[left];
            left++;
            }
        }
        return (double)max/k;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums =new int[n] ;
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        MaxAvgSubArray s = new MaxAvgSubArray();
        double result = s.findMaxAverage(nums, k);
        System.out.println(result);
    }

}