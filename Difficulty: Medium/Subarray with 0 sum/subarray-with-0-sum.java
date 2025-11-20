class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        for(int i:arr){
            sum=sum+i;
            if(sum==0){
                return true;
            }
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}