import java.io.*;
import java.util.*;
//Given an array containing N integers and an integer K.
// Your task is to find the length of the longest Sub-Array with
// sum of the elements equal to the given value K

public class LongestSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
		for(int i = 0; i<n; i++) array[i] = sc.nextInt();

        long len = LongestSubArraySum(array, k);
        System.out.println(len);

    }

    public static long LongestSubArraySum(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0, maxLen = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
                 
            if (sum == k)
                maxLen = i + 1;
 
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {

                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
                }
            }
              
        return maxLen;  
    }
}
