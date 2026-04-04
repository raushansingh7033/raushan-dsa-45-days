public class _08_Loop {
    public static void main(String[] args) {
        // for loop
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // while loop
        int i=1;
        while (i<10) {
            System.out.println(i);
            i++;
        }

        // do while
    
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
}
