public class Bs8 {
    static void Sorted(int []a,int target){
        int i=0;
        int j=a.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(a[mid]==target){
               System.out.println(mid);
               return;
            }
            if(a[i]==a[mid] && a[j]==a[mid]){
                i=i+1;
                j=j-1;
                continue;
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

System.out.println("true");
return;

        }
System.out.println("false");
    }
    public static void main(String[] args) {
        int []a={2,1,2,2,2,2};
        int target=2;
    Sorted(a,target);
        
    }
}
