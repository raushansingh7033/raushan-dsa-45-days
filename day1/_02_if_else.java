import java.util.Scanner;

public class _02_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("you are eligible to give the vote");
        }else{
            System.out.println("you are not eligible");
        }
    }
}
