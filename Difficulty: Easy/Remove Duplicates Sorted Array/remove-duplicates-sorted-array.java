class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            if(!set.contains(i)){
                list.add(i);
                set.add(i);
            }
        }
        return list;
    }
}
