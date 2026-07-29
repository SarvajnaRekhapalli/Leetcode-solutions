class  Pivot_Index{
    public int pivotIndex(int[] nums) {
        int l=0;
          int total=0;
        for(int i=0;i<nums.length;i++)
        {
         total=total+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int right=total-l-nums[i];
            if(l==right)
            {
                return i;
            }
            l=l+nums[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Pivot_Index p=new Pivot_Index();
        int[] nums={1,7,3,6,5,6};
        System.out.println(p.pivotIndex(nums));
    }
}