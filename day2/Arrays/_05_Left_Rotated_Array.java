import java.util.Scanner;

public class _05_Left_Rotated_Array {
    static void rotateArray(int[] arr,int n){
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotateArray(arr,n);
        System.out.println("After rotating by one place ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
