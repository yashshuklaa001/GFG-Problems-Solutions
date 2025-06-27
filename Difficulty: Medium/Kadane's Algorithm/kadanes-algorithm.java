class Solution {
    int maxSubarraySum(int[] arr) {
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            sum=Math.max(sum,arr[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}
