import java.util.Scanner;

public class LargestSubarraysum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int ans = findMaxSubarraySum(a);
        System.out.println(ans);
    }
    public static int findMaxSubarraySum(int[] array) {
        int maxSoFar=Integer.MIN_VALUE, maxEndingHere= 0;

        for (int i = 0; i < array.length; i++) {
           maxEndingHere = maxEndingHere+ array[i];
           if(maxSoFar< maxEndingHere) maxSoFar = maxEndingHere;
           if(maxEndingHere < 0) maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
