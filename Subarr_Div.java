import java.util.*;


class SubarrDiv {
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int left=0;
    int sum=0;
    int count=0;
    for(int r=0;r<s.size();r++)
    {
        sum=sum+s.get(r);
         if(r-left+1==m)
        {
        if(sum==d)
        {
           count++;
        }
           sum=sum-s.get(left);
            left++;
        }
    }
     return count;

    }

}

public class Subarr_Div {
    // hide implicit public constructor
    private Subarr_Div() {}
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(SubarrDiv.birthday(s, d, m));

        sc.close();
    }
}
