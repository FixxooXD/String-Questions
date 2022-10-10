import java.util.ArrayList;
import java.util.List;

public class allDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(duplicate(arr));

    }
    static List<Integer> duplicate(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for (int j=0;j<nums.length;j++){
            if (nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] =  arr[end];
        arr[end] = temp;

    }
}
