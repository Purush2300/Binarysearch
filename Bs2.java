public class Bs2 {
    public static void main(String[] args) {
        int []a={3,5,8,15,19};
        int ans=a.length;
        int x=16;
        int low=0;
        int j=a.length-1;
        while (low<=j) {
            int mid=(low+j)/2;
          
            if(a[mid]>=x){
              ans=mid;
                j=mid-1;
            }
              else{
                low=mid+1;
              }         
        }
        System.out.println(ans);
       
    }
}
