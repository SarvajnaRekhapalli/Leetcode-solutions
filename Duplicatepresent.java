public class Duplicatepresent {
    public boolean containsduplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        for (int k = 0; k < nums.length - 1; k++) {
            for (int i = k + 1; i < nums.length; i++) {
                if (nums[k] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicatepresent s = new Duplicatepresent();
        int[] nums = {1,2,3,1};
        System.out.println(s.containsduplicate(nums));
    }
}
