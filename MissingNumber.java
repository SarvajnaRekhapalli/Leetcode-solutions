import java.util.*;
class MissingNumber {
    public int MissingNumber(int[] nums) {
       Arrays.sort(nums);
       if(nums[0]!=0)
       return 0;
       for(int i=0;i<nums.length-1;i++)
       {
        if((nums[i]+1)!=nums[i+1])
        {
            return nums[i]+1;
        } }
        return nums.length;  }  
        public static void main(String args[])
     
        {
        try(Scanner sc=new Scanner(System.in))
        {
            MissingNumber solution=new MissingNumber();
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
            int result = solution.MissingNumber(nums);
            System.out.println("Missing Number: "+result);
        }
       }
}