// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int num=0;
        while(n!=0){
            int ld=n%10;
            num+=(int)Math.pow(ld,3);
            n/=10;
        }
        return original==num;
    }
}