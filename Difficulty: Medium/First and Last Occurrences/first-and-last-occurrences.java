// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(findFirst(arr,x));
        list.add(findLast(arr,x));
        return list;
    }
    public int findFirst(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int findLast(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
