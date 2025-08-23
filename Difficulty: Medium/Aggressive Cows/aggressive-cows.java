class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[stalls.length-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlace(stalls,mid,k)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public boolean canPlace(int arr[],int dist,int cows){
        int countCow=1;
        int coord=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-coord>=dist){
                countCow++;
                coord=arr[i];
            }
        }
        return countCow>=cows;
    }
}