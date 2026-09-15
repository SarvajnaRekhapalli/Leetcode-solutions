import java.util.HashSet;
import java.util.Scanner;;
public class Consecutive_Sequence { 
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        if(nums.length==0)
        return 0;
        for(int num:nums)
        {
          set.add(num);
        }
        int current;
        int longest=1;
        for(int num:set)
        {
        if(!set.contains(num-1))
        {
            current=num;
            int count=1;
        while(set.contains(current+1))
        {
            current++;
            count++;
        }
        longest=Math.max(longest,count);
    }
        }
    return longest;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Consecutive_Sequence solution = new Consecutive_Sequence();
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int longestSequenceLength = solution.longestConsecutive(nums);
            System.out.println("Length of the longest consecutive sequence: " + longestSequenceLength);
        }
    }   
}

