import java.io.*;
import java.lang.*;
import java.util.*;

class removeduplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        defining array size.
        int n = in.nextInt();
        int[] array = new int[n];
//        inserted elements into array.
        for (int i = 0; i <array.length; i++) array[i] = in.nextInt();
//        removing the duplicates.
//        defining a HashSet.
        HashSet<Integer> set = new HashSet<>();
//        adding elements to LinkedHashSet.
        for (int i = 0; i <array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
       }
}