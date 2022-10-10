import java.util.Arrays;

public class FirstMissing {
    public static void main(String[] args) {

        int[] arr = {1,2,0};
        missing(arr);
        System.out.println(missing(arr));
    }
    static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i]>0 && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } 
            else {
                i++;
            }
            }
       for (int j=0;j<arr.length;j++){
           if (arr[j] != j+1){
               return j+1;
           }
       }
return -1;
    }
    static void Specialswap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] =  end;
        end = temp;

    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] =  arr[end];
        arr[end] = temp;

    }
}
