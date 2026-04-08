import java.util.Scanner;

public class _11_ArrayRotationCount {
     public static int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            if(arr[lo]<=arr[hi])return lo;
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[hi]){
                lo=mid+1;
            }else hi=mid;
        }
        return lo;
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
        int count=findKRotation(arr);
        System.out.println("Rotation is "+count);
    }
}
