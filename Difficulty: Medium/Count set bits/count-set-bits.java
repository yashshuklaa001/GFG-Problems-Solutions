class Solution {
    public static int countSetBits(int n) {
        if (n == 0) return 0;

        // Find the largest power of 2 <= n
        int x = largestPowerOf2(n);

        // Count bits till 2^x -1
        int bitsTill2x = x * (1 << (x - 1));

        // Count MSB bits from 2^x to n
        int msbBits = n - (1 << x) + 1;

        // Recurse for remaining numbers
        int remaining = countSetBits(n - (1 << x));

        return bitsTill2x + msbBits + remaining;
    }

    public static int largestPowerOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(countSetBits(n));  // Output: 4
    }
}
