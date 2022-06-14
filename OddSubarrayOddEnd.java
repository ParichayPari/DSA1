import java.io.*;
import java.util.*;

public class OddSubarrayOddEnd {
    public static int checkArray(int []nums, int n)
    {
        return ((nums[0] % 2) > 0 && (nums[n - 1] % 2) > 0 && (n % 2) > 0) ? 1 : 0;
    }
       
    // Driver code
    public static void main(String[] args)
    {
        int []array = { 9,0,3,1,5};
        int n = array.length;
        int ans = checkArray(array, n);
        System.out.println(ans);
    }
    
}
