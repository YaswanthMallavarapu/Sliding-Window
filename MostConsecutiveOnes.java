class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        // Approach 1(O(N^2))
        // for(int i=0;i<n;i++){
        // // int zeroes=0;
        // // for(int j=i;j<n;j++){
        // // if(nums[j]==0)zeroes++;
        // // if(zeroes<=k)max=Math.max(max,j-i+1);
        // // else{
        // // break;
        // // }
        // // }

        // }
        int i = 0, j = 0, zeroes = 0;
        // Approach 2(O(2*N))
        // while(j<n){
        // if(nums[j]==0)zeroes++;
        // while(zeroes>k){
        // if(nums[i]==0)zeroes--;
        // i++;
        // }
        // max=Math.max(max,j-i+1);
        // j++;
        // }
        // Approach 3(O(N))
        while (j < n) {
            if (nums[j] == 0)
                zeroes++;
            if (zeroes > k) {
                if (nums[i] == 0)
                    zeroes--;
                i++;
            }
            if (zeroes <= k)
                max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}