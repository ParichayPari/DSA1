import java.io.*;
import java.util.*;

public class subarrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        printMaxProd(arr, k);
    }
    public static void printMaxProd(int[] nums, int k)
    {
        int[] result = new int[nums.length - k + 1];
        int j = 0;
        Deque<Integer> deq = new LinkedList<>();

        for(int i = 0; i < k ; i++)
        {
            while(!deq.isEmpty() && nums[i] >= nums[deq.peekLast()])
            {
                deq.removeLast();
            }
            deq.add(i);
        }
        result[j++] = nums[deq.peekFirst()];
        for(int i = k; i < nums.length; i++)
        {
            if(deq.peekFirst() < (i - k + 1))
            {
                deq.removeFirst();
            }
            while(!deq.isEmpty() && nums[i] >= nums[deq.peekLast()])
            {
                deq.removeLast();
            }
            deq.add(i);
            result[j++] = nums[deq.peekFirst()];
        }
        int product =1;
        for (int i = 0; i <result.length ; i++) {
           product = (product * result[i]);
        }
        System.out.println(product);
    }
}