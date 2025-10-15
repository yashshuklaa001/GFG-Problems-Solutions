class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        for(int i : set){
            result.add(i);
        }
        return result;
    }
}