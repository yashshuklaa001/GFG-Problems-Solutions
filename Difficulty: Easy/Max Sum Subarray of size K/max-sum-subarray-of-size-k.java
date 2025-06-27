// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(k==arr.length){
            return sum;
        }
        int max=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            max=Math.max(sum,max);
            
        }
        return max;
    }
}