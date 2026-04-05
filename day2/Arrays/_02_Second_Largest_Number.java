import java.util.Scanner;

public class _02_Second_Largest_Number {
    static int findSecondLarget(int[] arr,int n){
            int large=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>large && arr[i]>secondLargest){
                    secondLargest=large;
                    large=arr[i];
                }
                else if(arr[i]<large && arr[i]>secondLargest){
                    secondLargest=arr[i];
                }
            
            }
            return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element in array");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int secondLargest=findSecondLarget(arr,n);
        System.out.println("Second largest number"+secondLargest);
    }
}
