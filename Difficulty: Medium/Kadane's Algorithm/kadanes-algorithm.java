class Solution {
    int maxSubarraySum(int[] arr) {
        int currMax=arr[0];
        int maxTillNow=arr[0];
        for(int i=1;i<arr.length;i++){
            currMax=Math.max(currMax+arr[i],arr[i]);
            maxTillNow=Math.max(maxTillNow,currMax);
        }
        return maxTillNow;
    }
}
