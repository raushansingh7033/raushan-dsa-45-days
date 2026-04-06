import java.util.ArrayList;
import java.util.List;

public class _09_UnionOfTwoSortedArray {
    static List<Integer> unionOfSorted(int[] arr1,int[] arr2,int n,int m){
        List<Integer> union=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<m && j<n) {
            if(arr1[i]>arr2[j]){
                union.add(arr2[j]);
                j++;
            }else{
                union.add(arr1[i]);
                i++;
            }
        }

        while (i<m) {
            union.add(arr1[i]);i++;
        }
        while (j<n) {
            union.add(arr2[j]);j++;
        }
        return union;
    }
    public static void main(String[] args) {
          int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
          int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
          int m=arr1.length,n=arr2.length;
          List<Integer> ans=unionOfSorted(arr1,arr2,n,m);

          for(int ele:ans){
            System.out.print(ele+" ");
          }

    }
}
