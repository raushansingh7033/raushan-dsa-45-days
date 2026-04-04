import java.util.Scanner;

public class _08_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=0;j<row-i;j++ ){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
