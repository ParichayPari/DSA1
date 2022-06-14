import java.io.*;
import java.util.*;


public class moveZerosToLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) array[i] = in.nextInt();

    int[] ans = moveZeros(array);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }

    public static int[] moveZeros(int[] nums) {
        int l=0; 
        int r = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[r] == 0){
                r++;
            }else{
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                
                l++;
                r++;
            }
        }
        return nums;
    }
}
