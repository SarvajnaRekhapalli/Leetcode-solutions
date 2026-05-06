import java.util.*;
class Twosum {
    public int[] twoSum(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if((nums[i]+nums[j])==target)
            {
                 return new int[]{i,j};
            }
        }
    }
        return new int[]{};
        }
    public static void main(String[] args) { 
        try(Scanner sc=new Scanner(System.in))
        {
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();
        Twosum ts=new Twosum();
        int result[]=ts.twoSum(nums, target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
}