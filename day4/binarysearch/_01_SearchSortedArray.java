import java.util.Scanner;

public class _01_SearchSortedArray {

    static boolean binarySearch(int[] arr,int n,int key){
        int lo=0;
        int hi=n-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==key){
                return true;
            }else if(arr[mid]>key){
                 hi=mid-1;
            }else{
                lo=mid+1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elment in the array"); 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search key");
        int key=sc.nextInt();
        boolean ans=binarySearch(arr,n,key);
        if(ans){
            System.out.println("Key is found ");
        }else{
            System.out.println("Key is not found");
        }
        }
}
