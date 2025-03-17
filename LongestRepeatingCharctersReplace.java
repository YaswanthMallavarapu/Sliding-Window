class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int max=0;
        // for(int i=0;i<n;i++){
        //     int count[]=new int[26];
        //     int maxf=0;
        //     for(int j=i;j<n;j++){
        //        count[s.charAt(j)-'A']++;
        //        if(count[s.charAt(j)-'A']>maxf)maxf=count[s.charAt(j)-'A'];
        //        if(((j-i+1)-maxf)<=k)
        //        max=Math.max(max,(j-i+1));
        //     }
        // }
        int count[]=new int[26];
        int maxf=0;
        int l=0,r=0;
        while(r<n){
            count[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,count[s.charAt(r)-'A']);
            if(((r-l+1)-maxf)>k)
            {
                count[s.charAt(l)-'A']--;
                l=l+1;
            }
            if(((r-l+1)-maxf)<=k){
                max=Math.max(max,(r-l+1));
            }
            r++;
        }
        return max;
    }
}