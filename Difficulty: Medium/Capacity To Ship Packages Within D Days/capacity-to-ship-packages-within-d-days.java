// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
         int low=getMax(arr);
         int high=getTotal(arr);
         int ans=0;
         while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,d)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
         }
         return ans;
    }
    public static int getMax(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
    public static int getTotal(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static boolean possible(int weights[],int day,int days){
        int requiredDays = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > day) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
            return requiredDays <= days;
        }
        
    }
