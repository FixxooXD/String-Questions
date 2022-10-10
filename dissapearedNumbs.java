import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dissapearedNumbs {
    public static void main(String[] args) {
        int[] numb = {4,3,2,7,8,2,3,1};
        sort(numb);
        System.out.println(Arrays.toString(numb));

    }
    static List<Integer> sort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if (nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }
        List<Integer> ans =new ArrayList<>();
        for (int j=0;j<nums.length;j++){
            if (nums[j] != j+1){
                 ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
    }
}
