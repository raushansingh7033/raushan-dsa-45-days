import java.util.Scanner;

public class _05_Nested_If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean hasId=sc.nextBoolean();
        if(age>=18){
           if(hasId){
            System.out.println("you can vote");
           }else{
            System.out.println("create voter id card");
           }
        }else{
         System.out.println("you can not vote");
        }
        }
}
