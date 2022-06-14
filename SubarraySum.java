import java.io.*;
import java.util.*;
//find the subarray whose sum is greater or equal to K
public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long target = sc.nextLong();
        int[] array = new int[n];
		for(int i = 0; i<n; i++) array[i] = sc.nextInt();
        System.out.print(minSubarrayLen(array,target));
	}
	public static int minSubarrayLen(int[] array, long target) {
		int len = Integer.MAX_VALUE;
		long sum = 0;
		int j =0;
		for (int i = 0; i <array.length ; i++)
			{
				sum += array[i];
				while(sum>= target) {
					len = Math.min(len, i-j+1);
					sum -=array[j++];
				}
			}
		return (len == Integer.MAX_VALUE)? 0:len;
 	}
}
