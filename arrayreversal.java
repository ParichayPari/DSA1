import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayreversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) array[i] = in.nextInt();
//        reversing the array.
        int[] revarray = new int[n];
        int j= n;
        for (int i = 0; i <array.length ; i++) {
           revarray[j-1] = array[i];
           j--;
        }
        for (int i = 0; i <revarray.length ; i++) {
            System.out.print(revarray[i] + " ");
        };
    }
}

