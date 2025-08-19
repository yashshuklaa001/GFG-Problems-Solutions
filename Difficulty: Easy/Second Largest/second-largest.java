class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2) return -1;
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            }else if(i>second && i!=first){
                second=i;
            }
        }
        return (second==Integer.MIN_VALUE)?-1:second;
    }
}