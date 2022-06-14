import java.io.*;
import java.lang.*;
import java.util.*;
 class checksubarry {
     public static void main(String[] args) {
         int a1[] = {11, 1, 13, 21, 3, 7};
         int a2[] = {11, 3, 4, 1};
         int n= a1.length;
         int m = a2.length;
         checkIfSubset(a1, a2, n, m);
     }
     static void checkIfSubset(int[] a1, int[] a2, int n, int m) {
         HashSet<Integer> hs = new HashSet<>();
                 for (int i = 0; i < a1.length; i++) {
            hs.add(a1[i]);
        }
        System.out.println(hs);
        boolean res = true;
        for (int i = 0; i < a2.length; i++) {
            if(!hs.contains(a2[i])) {
                res = false;
                break;
            }
        }
       if(!res) System.out.println("not subarray");
       else System.out.println("subarray");
     }
 }