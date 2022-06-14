import java.io.*;
import java.util.*;
//Given an array A[], of length N containing values in the range of negative to positive integers.
// You need to find the length of the largest subarray whose sum of elements is 0.

public class LargestSubarrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0, maxLen=-1;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        //   System.out.println(sum);
            if (sum==0) {
                maxLen = Math.max(maxLen, i+1);
            }
            
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i-map.get(sum));
            } else {
                map.put(sum, i);
            }
            System.out.println(map);
        }
        System.out.println(maxLen);
	}
}
