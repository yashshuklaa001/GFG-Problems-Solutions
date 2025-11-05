class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int high=arr.length-1;
        while(k!=0){
            list.add(arr[high]);
            high--;
            k--;
        }
        return list;
    }
}
