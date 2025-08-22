class Solution {
    int countFreq(int[] arr, int target) {
        int first = findFirst(arr,target);
        int last = findLast(arr,target);
        if(first==-1 && last==-1) return 0;
        return last-first+1;
    }
    public int findFirst(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int findLast(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
