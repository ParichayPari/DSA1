import java.util.HashSet;
import java.util.Scanner;
//Problem statement: Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in A[] whose sum is exactly x. 

public class FindPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int target = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <n ; i++) {
            num[i] =in.nextInt();
        }
        findPair(num, target);
    }
    static void findPair(int[] num,int target) {
        HashSet<Integer> set = new HashSet<>();// now it is empty.
        for (int i = 0; i <num.length ; i++) {
            int copair = target - num[i];
            if (set.contains(copair)) {
                System.out.println((target - num[i]) + " " + num[i]);
            }
            set.add(num[i]);
        }
    }
}