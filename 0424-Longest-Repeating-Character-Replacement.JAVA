class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int r=0;
        int l=0;
        int maxfreq=0;
        int maxlength=0;
        int[] hash=new int[26];
        while(r<n)
        {
            char ch=s.charAt(r);
            hash[ch-'A']++;
            maxfreq=Math.max(maxfreq,hash[ch-'A']);
            if(((r-l+1)-maxfreq)>k)
            {
                char CH=s.charAt(l);
                hash[CH-'A']--;
                
                l++;
            }
            if(((r-l+1)-maxfreq)<=k)
            {
                maxlength=Math.max(maxlength,r-l+1);

            }
            r++;
            
        }
        return maxlength;
        
    }
}
