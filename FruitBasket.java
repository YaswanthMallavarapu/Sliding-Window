// User function Template for Java

class Solution {
    public static int totalElements(Integer[] arr) {
        int n = arr.length;
        int max = 0;
        // for(int i=0;i<n;i++){
        // HashSet<Integer>set=new HashSet<>();
        // for(int j=i;j<n;j++){
        // set.add(arr[j]);
        // if(set.size()>2)break;
        // max=Math.max(max,j-i+1);
        // }
        // }
        int l = 0, r = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        while (r < n) {
            set.put(arr[r], set.getOrDefault(arr[r], 0) + 1);
            if (set.size() > 2) {
                set.put(arr[l], set.get(arr[l]) - 1);
                if (set.get(arr[l]) == 0)
                    set.remove(arr[l]);
                l++;
            } else {
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        return max;
    }
}