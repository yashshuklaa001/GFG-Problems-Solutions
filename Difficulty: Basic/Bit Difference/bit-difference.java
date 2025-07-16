class Solution {
    public static int countBitsFlip(int a, int b) {
        int xor=a^b;
        int count=0;
        while(xor>0){
            xor=xor&(xor-1);
            count++;
        }
        return count;
    }
}
