import java.util.*;
class MajorityElement {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int count=1;
            if(nums.length==1)
        {
            return nums[i];
        }
        else 
        {
            for(int j=i+1;j<nums.length;j++)
            {
            if(nums[i]==nums[j])
            {
                count++;
            }
        }
        }
        if(count>nums.length/2)
        return nums[i];
        }
    return nums.length;
}
public static void main(String args[])
{
    try(Scanner sc=new Scanner(System.in))
    {
        int n=sc.nextInt();
         int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)        {
            nums[i]=sc.nextInt();
        }
    MajorityElement m=new MajorityElement();
    int result=m.majorityElement(nums);
    System.out.println(result);}
}
}