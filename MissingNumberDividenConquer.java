import java.util.Scanner;

public class MissingNumberDividenConquer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) array[i] = in.nextInt();

        int ans = FindMissingNumber(array);
        System.out.println(ans);

    }

    public static int FindMissingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
 
        int diff = (nums[nums.length - 1] - nums[0]) / nums.length;
 
        while (left <= right)
        {
            int mid = right - (right - left) / 2;
 
            if (mid + 1 < nums.length && nums[mid + 1] - nums[mid] != diff) {
                return nums[mid + 1] - diff;
            }
 
            if (mid - 1 >= 0 && nums[mid] - nums[mid - 1] != diff) {
                return nums[mid - 1] + diff;
            }
             if (nums[mid] - nums[0] != (mid - 0) * diff) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
