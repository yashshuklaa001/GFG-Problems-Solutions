class Solution {
    // Function to return LCM and GCD of two numbers
    public static int[] lcmAndGcd(int A, int B) {
        int gcd = findGCD(A, B);
        int lcm = (A * B) / gcd;
        return new int[]{lcm, gcd};
    }

    // Euclidean Algorithm to find GCD
    private static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
