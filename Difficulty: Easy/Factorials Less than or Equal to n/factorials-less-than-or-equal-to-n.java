class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        long fact = 1;
        int i = 1;
        
        while (fact <= n) {
            result.add(fact);
            i++;
            fact *= i; // compute next factorial
        }
        
        return result;
    }
}
