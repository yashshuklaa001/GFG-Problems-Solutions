class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
}