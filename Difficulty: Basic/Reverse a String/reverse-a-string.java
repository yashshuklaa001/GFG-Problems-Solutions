// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        char a[] = s.toCharArray();
        int low=0;
        int high=a.length-1;
        while(low<high){
            char temp = a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
        return new String(a);
    }
}