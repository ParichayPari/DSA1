import java.util.Scanner;
//1. Sort a binary array in single traversal.
public class binaryArraySorting {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int[] array = {0, 1, 0, 0 , 1, 1, 0, 1, 1, 1};
        int j= -1;
        for (int i = 0; i <array.length; i++) {
            if(array[i] <1) {
                j++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        for (int i = 0; i <array.length ; i++) System.out.print(array[i] + " ");
        System.out.println();
    }
}
