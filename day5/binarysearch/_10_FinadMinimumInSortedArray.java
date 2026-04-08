import java.util.Scanner;

public class _10_FinadMinimumInSortedArray {
    public static int findMin(int[] nums) {
         int n=nums.length;
         int lo=0;
         int hi=n-1;
         int mini=Integer.MAX_VALUE;
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=nums[lo]){
               mini= Math.min(mini,nums[lo]);
               lo=mid+1;
            }
            else {
                mini=Math.min(mini,nums[mid]);
                hi=mid-1;
            }
         }
         return mini;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=findMin(arr);
        System.out.println("minimum in rotated sorted array "+min);


    }
}
