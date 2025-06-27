class Solution {
    int search(String pat, String txt) {
        int k = pat.length();
        int n = txt.length();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int distinctCount = map.size();
        int i = 0, j = 0;
        while (j < n) {
            char endChar = txt.charAt(j);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    distinctCount--;
                }
            }
            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                if (distinctCount == 0) {
                    count++;
                }
                char startChar = txt.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) == 1) {
                        distinctCount++;
                    }
                }
                i++;
                j++;
            }
        }
        return count;
    }
}
