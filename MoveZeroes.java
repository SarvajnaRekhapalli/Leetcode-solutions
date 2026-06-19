import java.util.*;
class MoveZeroes {
    public void moveZeroes(int[] nums) {
       for(int i=0;i<=nums.length-1;i++)
       {
        for(int j=0;j<nums.length-1;j++)
        {
            if(nums[j]==0&&nums[j+1]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
       }
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
            MoveZeroes m=new MoveZeroes();
            m.moveZeroes(nums);
            for(int i=0;i<nums.length;i++)
            {
                System.out.println(nums[i]);
            }
        }
    }
}
