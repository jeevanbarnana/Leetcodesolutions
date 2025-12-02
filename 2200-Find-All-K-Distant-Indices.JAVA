class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int pointer=0;
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=key) continue;
            int min=Math.max(pointer,i-k);
            int max=Math.min(i+k,n-1);
            while(min<=max)
            {
               list.add(min++);
            }
            pointer=max+1;
        }
        return list;
        
    }
}
