import java.util.Scanner;

public class _01_Largest_Element {

    static int findLargest(int[] arr,int n){
          int max=Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
          }
          return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=findLargest(arr,n);
        System.out.println(large);
    }
}
