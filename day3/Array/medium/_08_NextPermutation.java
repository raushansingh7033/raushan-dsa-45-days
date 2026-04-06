import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _08_NextPermutation {
    static void permute(int idx,int[] nums,List<List<Integer>> permutations){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums)temp.add(num);
            permutations.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<nums.length;i++){
            swap(idx,i,nums);
            permute(idx+1, nums, permutations);
            swap(idx,i,nums);
        }
    }

    static void swap(int idx,int i,int[] nums){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
    static List<Integer> nextPermutation(int[] nums){

        List<List<Integer>> permutations=new ArrayList<>();
        //Arrays.sort(nums);
        
        permute(0,nums,permutations);
        List<Integer> current = new ArrayList<>();
        for (int num : nums)
            current.add(num);

        // Find and return the next permutation
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(current)) {
                if (i == permutations.size() - 1)
                    return permutations.get(0);
                return permutations.get(i + 1);
            }
        }

        return current;

    }
    public static void main(String[] args) {
        
            int[] nums = {2 ,1 ,3};
           List<Integer> ans= nextPermutation(nums);
           for(int ele:ans)System.out.print(ele+" ");
    }
}
