import java.io.*;
import java.util.*;

public class FindOddoccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) array[i] = in.nextInt();

        int ans = findoddNumber(array);
        System.out.println(ans);

    }

    public static int findoddNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length)
        {
            int curr = nums[i];
 
            int count = 0;
            while (i < nums.length && nums[i] == curr)
            {
                count++;
                i++;
            }
            if (count % 2 == 1) {
                return curr;
            }
        }
         return -1;
    }
}
