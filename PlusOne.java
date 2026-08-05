import java.util.*;
class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PlusOne s=new PlusOne();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] result = s.plusOne(arr);
        for (int i = 0; i < result.length; i++) {
    System.out.print(result[i] + " ");
}
    }
}