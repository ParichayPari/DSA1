import java.io.*;
import java.util.*;
public class MaxSubarraySum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = sc.nextInt();// array input taken
        int count=0;

        for (int i=0;i<k;i++) count+= arr[i];// getting k window size sum and setting it to max sum initially
        int max = count;

            for (int i=k;i<n;i++) {
                count = count + arr[i]-arr[i-k];// logic for window shifting
                max = Math.max(max, count);// comparing between current max sum and current sum
            }
        System.out.println(max); // printing the maxsum
    }
}