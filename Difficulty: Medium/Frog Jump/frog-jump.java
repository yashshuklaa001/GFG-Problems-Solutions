class Solution {
    int minCost(int[] height) {
        int n = height.length;
        if(n==0) return 0;
        if(n==1) return 0;
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(height[1]-height[0]);
        for(int i=2;i<n;i++){
            int takeOne = dp[i-1]+Math.abs(height[i]-height[i-1]);
            int takeTwo = dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(takeOne,takeTwo);
        }
        return dp[n-1];
    }
}