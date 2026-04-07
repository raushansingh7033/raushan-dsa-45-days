import java.util.Scanner;

public class _08_Count_Occurences {
  
   static int lowerBound(int[] arr,int target,int n){
        int lo=0;
        int hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        if(ans==n || arr[ans]!=target)return -1;
        return ans;
    }
   static int upperBound(int[] arr,int target,int n){
        int lo=0;
        int hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
   static int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int l=lowerBound(arr,target,n);
        if(l==-1)return 0;
        int u=upperBound(arr,target,n);
        return u-l;
    }

    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elmenent of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int ans=countFreq(arr,target);
        System.out.println("Frequency count "+ans);
    }

}
