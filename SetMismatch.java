import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        mismatch(nums);
        System.out.println(Arrays.toString( mismatch(nums)));
    }
    static int[] mismatch(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1; //as index 0=1, ind 1=2.....

            if(nums[i] != nums[correctIndex]){
               swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j=0;j<nums.length;j++){
            if (nums[j] != j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] =  arr[end];
        arr[end] = temp;

    }
}