import java.util.*;
class Singlenum {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
              int count=0;
            for(int j=0;j<nums.length;j++)
            {
             if(i!=j&&nums[i]==nums[j])
            count++;
        }
        if(count==0)
        {
        return nums[i];
    }
        }
     return nums.length;  
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        Singlenum s=new Singlenum();
        int result=s.singleNumber(nums);
        System.out.println(result);

        }
}
}
