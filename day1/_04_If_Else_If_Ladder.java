import java.util.Scanner;

public class _04_If_Else_If_Ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        if(marks<=100 && marks>=75){
            System.out.println("Grade A");
        }else if(marks>=60 && marks<=75){
            System.out.println("Grade B");
        }else if(marks<=45 && marks>=60){
            System.out.println("Grade c");
        }else if(marks>=0 && marks<=45){
            System.out.println("Grade D");
        }else {
            System.out.println("marks is invalid");
        }
    }
}
