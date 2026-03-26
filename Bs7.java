public class Bs7 {
    static int Sorted(int []a,int target){
        int i=0;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]==target){
               return mid;
            }

            if(a[i]<=a[mid]){
                if(a[i]<=target && target<=a[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }

            else{
                if(a[j]<=target && target<=a[mid]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }



        }
       return i;
    }
    public static void main(String[] args) {
        int[]a={4,5,6,7,0,1,2};
        int target=0;
       int k=Sorted(a,target);
       System.out.println(k);
        
    }
}
