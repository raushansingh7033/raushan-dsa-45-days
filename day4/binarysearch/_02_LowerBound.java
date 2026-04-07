import java.util.Scanner;

public class _02_LowerBound {
     static int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                ans=mid;
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Enter the target");
       int target=sc.nextInt();
       int ans=lowerBound(arr,target);
       System.out.println("Lower Bound is "+ans);
    }
}
