import java.io.*;
import java.util.*;
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) array[i] = in.nextInt();
        		//method call: MinAbsDiff
              int ans = minimumAbsDifference(array,n);
              System.out.println(ans);
    }

    static int minimumAbsDifference(int arr[], int n)
    {
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];
 
        // Compute result using recursive function
        return findMinRec(arr, n, 0, sumTotal);
    }

    public static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal)
    {
        if (i == 0)
            return Math.abs((sumTotal - sumCalculated) - sumCalculated);
 
        
        return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i - 1], sumTotal),
            findMinRec(arr, i - 1, sumCalculated, sumTotal));
    }
}