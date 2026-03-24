public class Bs4 {
    public static void main(String[] args) {
        int []a={1,2,4,7};
        int x=6;
        int flooor=-1;
        int ceil=-1;
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]<=x){
                 flooor=a[mid];
                i=mid+1;
               }
               else{
                j=mid-1;
               }
        }
        i=0;
        j=a.length-1;

         while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]>=x){
                 ceil=a[mid];
                j=mid-1;
               }
               else{
                i=mid+1;
               }
        }
        System.out.print(flooor);
    System.out.println(ceil);
    }
}
