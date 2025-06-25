class Solution{
static ArrayList<Integer> leaders(int arr[]) {
    ArrayList<Integer> result = new ArrayList<>();
    int maxFromRight = arr[arr.length - 1];
    result.add(maxFromRight);

    for(int i = arr.length - 2; i >= 0; i--) {
        if(arr[i] >= maxFromRight) {
            maxFromRight = arr[i];
            result.add(maxFromRight);
        }
    }

    Collections.reverse(result);
    return result;
}
}