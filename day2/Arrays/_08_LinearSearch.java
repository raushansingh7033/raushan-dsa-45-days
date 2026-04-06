import java.util.Scanner;

public class _08_LinearSearch {
    static boolean searchElmenet(int[] arr,int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("insert element for array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("element to search");
        int key=sc.nextInt();
        boolean search=searchElmenet(arr,n,key);
        if(search){
            System.out.println("Key is found ");
        }else{
            System.out.println("Key is not found");
        }
    }
}
