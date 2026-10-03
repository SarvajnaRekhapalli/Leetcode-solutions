import java.util.*;
class Binary_Search {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
        
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
        int target=sc.nextInt();
        Binary_Search obj=new Binary_Search();
        System.out.println(obj.search(nums, target));
    }
}

}