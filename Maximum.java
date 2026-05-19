import java.util.Arrays;
public class Maximum {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int case1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int case2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(case1, case2);
    }
    public static void main(String[] args) {
        Maximum s = new Maximum();
        int[] nums = {1, 2, 3, 4};
        int result = s.maximumProduct(nums);
       System.out.println(result);
    }
}
