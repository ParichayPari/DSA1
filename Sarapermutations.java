import java.io.*;
import java.util.*;
//problem statement: Print N space separated integers either 1 or 0.
// Print 1 if there exist a permutation K for the ith number else print 0.
// Note:
public class Sarapermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i] = in.nextInt();
        }

        boolean result = checkPermutations(array, array.length);
        System.out.println(result);
    }
    static boolean checkPermutations(int[] arr, int len) {
        Set<Integer> hash = new HashSet<Integer>();

        int maxEle = 0;

        for (int i = 0; i < len; i++) {

            // Insert all elements in the set
            hash.add(arr[i]);

            // Calculating the max element
            maxEle = Math.max(maxEle, arr[i]);
        }

        if (maxEle != len)
            return false;

        // Check if set size is equal to n
        if (hash.size() == len)
            return true;

        return false;
    }
}
