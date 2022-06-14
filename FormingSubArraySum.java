import java.io.*;
import java.util.*;

public class FormingSubArraySum {
    //this problem uses equi directional two pointer technique.
    public static void main(String[] args) {
//        int n,k;
//        Scanner in = new Scanner(System.in);
//        n= in.nextInt();
//        k= in.nextInt();
        int[] numArray= {2,3,1,3,2,1,1,2,2};
//        for(int i=0;i<numArray.length; i++) numArray[i] = in.nextInt();
        int result= MaxSumSubArray(numArray, 8);
        System.out.println(result);
    }
    public static int MaxSumSubArray(int[] nums, int k) {
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ;i++){
            int sum = nums[i];
            if(sum == k){
                count++;
            }
            for(int j = i+1 ; j < nums.length ; j++){
                sum+= nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        if(nums[nums.length-1] == k){
            count++;
        }
        return count;
    }
}
