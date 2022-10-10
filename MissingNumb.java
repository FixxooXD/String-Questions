import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumb {
    public static void main(String[] args) {
     int[] arr ={9,6,4,2,3,5,7,0,1};
        System.out.println(missing(arr));
        System.out.println(Arrays.toString(arr));

    }


       static  int missing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index=0;index<nums.length;index++){
            if (nums[index] != index){
                return index;
            }
        }
return nums.length;

//                if (i == nums.length-1){
//                    if (correct == i+1){
//                        return i;
//                    }
//                }
//                if (correct==nums.length){
//                    i++;
//                }


    }
    static void swap ( int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }


    }