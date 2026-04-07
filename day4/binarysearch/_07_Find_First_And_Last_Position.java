import java.util.Scanner;

public class _07_Find_First_And_Last_Position {
   static int lowerBound(int[] nums,int target,int n ){
        int lo=0;
        int hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=target){
                ans=mid;
                hi=mid-1;
            }else {
                lo=mid+1;
            }

        }
        return ans;
    }

  static  int upperBound(int[] nums,int target,int n){
        int lo=0;
        int hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>target){
               ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int f=lowerBound(nums,target,n);
        if(f==n || nums[f]!=target){
            return new int[]{-1,-1};
        }
        int c=upperBound(nums, target, n);
        return new int[]{f,c-1};
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
        int[] ans=new int[2];
        ans=searchRange(arr, target);
        System.out.println("First occurence is"+ans[0]);
        System.out.println("last occurence is "+ans[1]);
    }
}
