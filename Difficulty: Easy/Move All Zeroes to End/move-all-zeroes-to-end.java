class Solution {
    void pushZerosToEnd(int[] arr) {
        int j=0;
        for(int i:arr){
            if(i!=0){
                arr[j]=i;
                j++;
            }
        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
    }
}