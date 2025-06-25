class Solution {
    public void printNos(int n) {
        if (n == 0) return;
        printNos(n - 1);      // First go down to 1
        System.out.print(n + " "); // Then print in ascending order
    }
}
