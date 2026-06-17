import java.util.Scanner;
class Stock {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            else
            {
                int profit=prices[i]-minprice;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
        
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
        {
        Solution solution = new Solution();
        int n=sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
    }
}