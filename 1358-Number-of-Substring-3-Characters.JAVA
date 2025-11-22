class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[] arr={-1,-1,-1};
        int count=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']=i;
            if(arr[0]!=-1&&arr[1]!=-1&&arr[2]!=-1)
            {
                count=count+(1+Math.min(arr[0],Math.min(arr[1],arr[2])));
            }
        }
        return count;  
    }
}
