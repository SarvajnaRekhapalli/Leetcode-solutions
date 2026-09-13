import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Find_K_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        int[] result = new int[k];
        for(int i=0;i<k;i++)
        {
           result[i]= list.get(i);
        }
                return result;
    }
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        Find_K_Elements s=new Find_K_Elements();
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] result = s.topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print("[" + result[i] + "] ");
        }
    }
}
}