public class Bs3 {
    public static void main(String[] args) {
        int []a={1,2,4,7};
        int find=6;
        int ans=a.length;
        int i=0;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]>=find){
                ans=mid;
               j=mid-1;
                System.out.println(ans);
                return;
                
            }
            else{
                i=mid+1;
            }
        }
        System.out.println(-1);
    }
}
