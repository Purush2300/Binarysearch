public class Bs2 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9,10};
        int ans=a.length;
        int x=5;
        int i=0;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]>=x){
              ans=mid;
                j=mid-1;
            }
              else{
                i=mid+1;
              }         
        }
        System.out.println(ans);
    }
}
