import java.io.*;
import java.util.*;
import java.lang.*;

public class AbsoluteDifferenceSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
             array[i] = in.nextInt();
        }

        int maxSum = AbsoluteDiffSum(array);
       System.out.println(maxSum);

    }
    public static int AbsoluteDiffSum(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int ans[] = new int[nums.length];

        int lt = 0;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = (nums[i] * i - lt) + ((totalSum - lt - nums[i]) - (nums[i]* (nums.length-i - 1)));
            lt += nums[i];
        }
        int max = ans[0];
        for (int i = 0; i <ans.length ; i++) max = Math.max(max, ans[i]);

        return max;
    }
}