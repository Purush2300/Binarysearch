public class Bs1 {
    public static void main(String[] args) {
        int []a={1,5,6,3,1,6,8};
        int target=8;
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(target>a[mid]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        System.out.println(-1);
    }
}
