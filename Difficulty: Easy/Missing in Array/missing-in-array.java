class Solution {
    int missingNum(int arr[]) {
        // int x=0,y=0;
        // int n=arr.length;
        // for(int i=1;i<=n;i++){
        //     x=x^i;
        // }
        // for(int val:arr){
        //     y=y^val;
        // }
        // return x^y;
        int n = arr.length;
        int hash[] = new int[n+2];
        for(int val:arr){
            hash[val]=1;
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
}
