import java.util.*;
public class Subarray_Division {
    public static int birthday(int[] s, int d, int m) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < s.length; right++) {
            sum = sum + s[right];

            if (right - left + 1 == m) {
                if (sum == d) {
                    count++;
                }
                sum = sum - s[left];
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
        {
        int n=sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();

        int result = birthday(s, d, m);
        System.out.println(result);
    }
}
}