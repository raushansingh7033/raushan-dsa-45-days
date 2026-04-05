import java.util.Scanner;

public class _04_Remove_Duplicates {
    static int remove(int[] arr,int n){

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the arrays element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=remove(arr,n);
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
