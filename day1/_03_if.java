import java.util.Scanner;

public class _03_if {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age");
    int a=sc.nextInt();
    if(a>=18){
        System.out.println("you can vote");
    }
 }   
}
