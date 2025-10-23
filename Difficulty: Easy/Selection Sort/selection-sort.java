class Solution {
    void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
}