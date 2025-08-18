class Solution {
    public void reverseArray(int arr[]) {
        int left =0;
        int right=arr.length-1;
        reverse(arr,left,right);
    }
    public void reverse(int arr[],int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}

