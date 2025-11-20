class Solution {
    int maxSubarraySum(int[] arr) {
        int curr = arr[0];
        int best = arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            best=Math.max(best,curr);
        }
        return best;
    }
}
