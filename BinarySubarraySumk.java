class Solution {
    public static int subArrays(int nums[], int goal) {
        if (goal < 0)
            return 0;
        int n = nums.length;
        int l = 0, r = 0;
        int cnt = 0;
        int sum = 0;
        while (r < n) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            cnt += (r - l + 1);
            r++;
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        // int n=nums.length;
        // int cnt=0;
        // for(int i=0;i<n;i++){
        // int sum=0;
        // for(int j=i;j<n;j++){
        // sum+=nums[j];
        // if(sum==goal)cnt++;
        // }
        // }

        return subArrays(nums, goal) - subArrays(nums, goal - 1);
    }
}