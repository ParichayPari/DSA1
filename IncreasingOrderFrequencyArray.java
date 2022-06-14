import java.util.*;

public class IncreasingOrderFrequencyArray {
    // function definition of the increasing oreder frequency.
    public static int[] frequencySort(int[] nums) {
        Integer[] arr = new Integer[nums.length];       // defining the empty array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer) nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
       return Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
    }
    public static void main(String[] args) {
       int[] array = {2,3,1,3,2,1,1,2,2,2,3,4,6,4,5,8,9,9};
//calling the function to find the increasing order frequency of the element
        int[] arr = frequencySort(array);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
