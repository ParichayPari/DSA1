import java.io.*;
import java.util.*;
public class DisappearingArray {
    public static void main(String[] args) {
        int numbers[] = { 3, 1, 5, 5 };

        int Largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            } 
        }

        HashSet<Integer> set = new HashSet<Integer>();

        int arr[] = new int[Largest+1];

        for (int i = 1; i < arr.length; i++) {
            set.add(i);
        }

        for (int j = 0; j < numbers.length; j++) {
            set.remove(numbers[j]);
        }

        System.out.println("Missing  no are :");
        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
