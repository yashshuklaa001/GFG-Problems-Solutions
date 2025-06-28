class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if(low<high){
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        }
        
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int left = low+1;
        int right = high;
        while(left<=right){
            while(left<=right&&arr[left]<=pivot){
                left++;
            }
            while(right>=left&&arr[right]>pivot){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[right];
        arr[right]=temp;
        
        return right;
    }
}