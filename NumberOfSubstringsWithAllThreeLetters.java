class Solution {

    public int numberOfSubstrings(String s) {
        int n = s.length();
        int subs = 0;
        // for(int i=0;i<n;i++){
        // int count[]=new int[3];
        // for(int j=i;j<n;j++){
        // count[s.charAt(j)-'a']++;
        // if(count[0]>0&&count[1]>0&&count[2]>0)subs++;
        // }
        // }
        int count[] = new int[3];
        Arrays.fill(count, -1);
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a'] = i;
            if (count[0] != -1 && count[1] != -1 && count[2] != -1) {
                subs += Math.min(count[0], Math.min(count[1], count[2])) + 1;
            }
        }
        return subs;
    }
}