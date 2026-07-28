import java.util.*;

class ArraysumPrefix{

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
    public static void main(String[] args)
    {
      List<Integer> ar = Arrays.asList(1,2,3,4);

        System.out.println(simpleArraySum(ar));
    }
}
