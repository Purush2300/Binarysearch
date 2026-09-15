public class sep15 {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,11,14,16};
        int target=7;
        int low=0;
        int ans=arr.length;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
