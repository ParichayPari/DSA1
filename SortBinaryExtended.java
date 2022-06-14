import java.util.Scanner;
//Given an integer array of 0s, 1s and 2s,
// sort the array without using count, hash maps, extra space and time complexity should be O(n)
public class SortBinaryExtended {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {0, 1, 0, 0 , 1, 1, 0, 2, 2, 1};
        int j= -1;
        for (int i = 0; i <array.length; i++) {
            if(array[i] <2) {
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        j=-1;
        for (int i = 0; i <array.length; i++) {
            if(array[i] <1) {
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
