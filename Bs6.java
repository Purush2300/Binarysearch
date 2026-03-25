public class Bs6 {
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
        int []a={1,2,3,4,5};
        int target=5;
        int count=0;
  int lb=lowbound(a, target);
  int up=upperbound(a, target);
  System.out.println(up-lb);

    }
}
