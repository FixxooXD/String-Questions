import java.util.Arrays;

public class duplicateNumb {
    public static void main(String[] args){
        int[] arr = {1,3,4,2};
        System.out.println(duplicate(arr));

    }
    static int duplicate(int[] nums){
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
        for (int j = 0;j<nums.length;j++){
            if (nums[j] != j+1){
                return nums[j];
            }
        }
return -1;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] =  arr[end];
        arr[end] = temp;

    }
}
