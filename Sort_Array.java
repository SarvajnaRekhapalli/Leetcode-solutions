import java.util.*;
public class Sort_Array {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {

                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                int[] temp = new int[right - left + 1];

                int i = left;
                int j = mid + 1;
                int k = 0;

                while (i <= mid && j <= right) {
                    if (nums[i] <= nums[j]) {
                        temp[k++] = nums[i++];
                    } else {
                        temp[k++] = nums[j++];
                    }
                }

                while (i <= mid) {
                    temp[k++] = nums[i++];
                }

                while (j <= right) {
                    temp[k++] = nums[j++];
                }

                for (int x = 0; x < temp.length; x++) {
                    nums[left + x] = temp[x];
                }
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        Sort_Array sorter = new Sort_Array();
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = sorter.sortArray(nums);
        System.out.println(Arrays.toString(sortedArray));
    }
}