// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        int pow=0;
        int dec=0;
        while(b.length()>0){
            int ld=b.charAt(b.length()-1)-'0';
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            b=b.substring(0,b.length()-1);
        }
        return dec;
    }
}