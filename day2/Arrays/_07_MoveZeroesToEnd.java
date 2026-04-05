import java.util.Scanner;

public class _07_MoveZeroesToEnd {
    static void trailZeroes(int[] arr,int n ){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array element ");
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        } 
        trailZeroes(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
