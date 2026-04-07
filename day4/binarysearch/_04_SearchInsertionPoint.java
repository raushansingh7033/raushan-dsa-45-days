package day4.binarysearch;

import java.util.Scanner;

public class _04_SearchInsertionPoint {
     static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=target){
                ans=mid;
                hi=mid-1;
            }else{
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
        System.out.println("enter the elment of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target ");
        int target=sc.nextInt();
        int ans=searchInsert(arr,target);
        System.out.println("Search insert "+ans);
    }
}
