import java.util.*;
class ContainsDuplicateHashset{
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        if(set.contains(nums[i]))
        {
            return true;
        }
        else
        {
            set.add(nums[i]);
        }
       }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ContainsDuplicateHashset s=new ContainsDuplicateHashset();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(s.containsDuplicate(arr));
    }
}