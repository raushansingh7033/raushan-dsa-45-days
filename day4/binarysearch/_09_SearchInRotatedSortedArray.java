import java.util.Scanner;

public class _09_SearchInRotatedSortedArray {
     public static int search(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target)return mid;
            // left part
            if(nums[lo]<=nums[mid]){
               if(nums[lo]<=target && nums[mid]>=target){
                    hi=mid-1;      
               }else {
                    lo=mid+1;
               }
            }
            //right part
            else{
               if(nums[mid]<=target && nums[hi]>=target){
                lo=mid+1;
               }else hi=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target");
        int target=sc.nextInt();
        int ans=search(arr,target);
        System.out.println("Element index is "+ans);
    }
}
