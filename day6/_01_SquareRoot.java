import java.util.Scanner;

public class _01_SquareRoot {
    static int floorSqrt(int n) {
        // code here
        int lo=0;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid*mid<=n){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ans=floorSqrt(n);
        System.out.println("Square root is "+ans);
    }
}
