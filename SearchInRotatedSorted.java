import java.util.Scanner;
//recursive approach for the problem:
//Given a rotated sorted array and target, return the
// index of target in array and time complexity should be O(log(n))
public class SearchInRotatedSorted {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];
        for (int i = 0; i <n ; i++) array[i] = in.nextInt();
    int k = in.nextInt();
        int idx = BinarySearch(array, 0, array.length-1, k);

        if(idx != -1) System.out.println("Index:" + idx);
        else System.out.println("key not found.");
    }

    static int BinarySearch(int[] array, int low, int high, int k) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (array[mid] == k)
            return mid;

        if (array[low] <= array[mid]) {

            if (k >= array[low] && k <= array[mid])
                return BinarySearch(array, low, mid - 1, k);

            return BinarySearch(array, mid + 1, high, k);
        }


        if (k >= array[mid] && k <= array[high])
            return BinarySearch(array, mid + 1, high, k);

        return BinarySearch(array, low, mid - 1, k);
    }

}