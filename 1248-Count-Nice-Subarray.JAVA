class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int func1=getcount(nums,k);
        int func2=getcount(nums,k-1);
        return func1-func2;
        
    }
    static int getcount(int[] nums,int k)
    {
        if(k<0)
        {
            return 0;
        }
        int n=nums.length;
        int r=0;
        int l=0;
        int sum=0;
        int count=0;
        while(r<n)
        {
            sum=sum+nums[r]%2;
            while(sum>k)
            {
                sum=sum-nums[l]%2;
                l++;
            }
            if(sum<=k)
            {
                 count=count+r-l+1;
                
            }
            r++;
        }
        return count;
    }
}
