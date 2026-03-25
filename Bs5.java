public class Bs5 {
    static int  lowbound(int[]a,int target){
        int i=0;
        int ans=a.length;
        int j=a.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]>=target){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }


static int upperbound(int[]a,int target){
    int i=0;
    int ans2=a.length;
    int j=a.length-1;
    while(i<=j){
        int mid=(i+j)/2;
        if(a[mid]>target){
            ans2=mid;
            j=mid-1;
        }
        else{
            i=mid+1;
        }
    }
    return ans2;
}





    public static void main(String[] args) {
        int []a={5,7,7,8,8,10};
        int target=8;
        int lb=lowbound(a, target);
       if(lb==a.length&& a[lb]!=target){
        System.out.println("-1");
       }
       else{
        System.out.println(lb);
        System.out.println(upperbound(a, target)-1);
       }
    }


   
}
