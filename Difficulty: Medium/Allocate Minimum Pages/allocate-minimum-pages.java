class Solution {
    public int findPages(int[] arr, int k) {
        if(arr.length < k) return -1;
        
        int low = getMax(arr);
        int high = getTotal(arr);
        int ans = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            int noOfStudent = FindStudent(arr, mid);
            
            if(noOfStudent <= k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(i, max);
        }
        return max;
    }
    public int getTotal(int arr[]){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public int FindStudent(int arr[], int maxPages){
        int countStu = 1;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            if(currSum + arr[i] <= maxPages){
                currSum += arr[i];
            }else{
                countStu++;
                currSum = arr[i];
            }
        }
        return countStu;
    }
}
