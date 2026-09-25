public class Max_Subarray {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
         int maxsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(sum>=0)
            {
                sum=sum+nums[i];
            }
            else
            {
                sum=nums[i];
            }
            if(sum>maxsum)
            {
            maxsum=sum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Max_Subarray s = new Max_Subarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = s.maxSubArray(nums);
       System.out.println(result);
    }
}