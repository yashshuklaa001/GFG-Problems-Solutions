class Solution {
    boolean isPalindrome(String s) {
        char str[] = s.toCharArray();
        return palindrome(str,0,str.length-1);
    }
    boolean palindrome(char a[],int low,int high){
        while(low<high){
            if(a[low]!=a[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}