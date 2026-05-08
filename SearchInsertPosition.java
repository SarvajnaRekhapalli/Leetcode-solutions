import java.util.Scanner;
class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
               return i;
            }
            else if(nums[i]>target)
            {
                return i;
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
            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            SearchInsertPosition sip=new SearchInsertPosition();
            int result=sip.searchInsertPosition(nums,target);
            System.out.println(result);
        }
    }
}