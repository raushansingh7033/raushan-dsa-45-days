import java.util.Scanner;

public class _03_CheckIfArrayIsSorted {
    static boolean CheckSorted(int[] arr,int n ){
       for(int i=1;i<n;i++){
        if(arr[i-1]>arr[i])return false;
       }
       return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        boolean sorted=CheckSorted(arr,n);
        System.out.println("Array is sorted or not "+sorted);
    }
}
