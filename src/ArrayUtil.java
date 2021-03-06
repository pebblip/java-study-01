import java.util.Arrays;

class ArrayUtil {
    public static boolean isEqual(int nums[]){

        boolean answer = false;

        for (int i=0; i < nums.length -1; i++) {
            answer =  (nums[i] == nums[i+1]) ? true : false;
            if (!answer) break;
        }
        return answer;

    }

    public static int min(int nums[]){
        int min_num = nums[0];

        for (int i=1; i < nums.length; i++) {
            min_num = (min_num < nums[i]) ? min_num : nums[i];
        }

        return min_num; 
    }
    
    public static int[] and(int array1[], int array2[]){

        int result_array[] = new int[4];

        for(int i=0; i < array1.length; i++){
            result_array[i] = array1[i] * array2[i];
        }
        return result_array;
    }
}