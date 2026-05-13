class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[]=new int[n];
        answer[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            answer[i]=answer[i-1]*nums[i-1];
        }
        int rp=1;
        for(int i=n-1;i>=0;i--)
        {
            answer[i]=answer[i]*rp;
            rp=rp*nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayProduct s = new ArrayProduct();
        int[] nums = {1,2,3,4};
        int[] result = s.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

