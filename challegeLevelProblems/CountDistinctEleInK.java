package challegeLevelProblems;
import java.io.*;
import java.util.*;

public class CountDistinctEleInK {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 4, 2, 3,6,8,9};

        HashMap<Integer, Integer> hm= new HashMap<>();

        for (int i = 0; i <a.length; i++) {
            int elem=a[i];
            if(hm.containsKey(elem)) {
                int f = hm.get(elem);
                int up= f+1;
                hm.put(elem, up);
            } else hm.put(elem, 1);
        }
        for(Integer key: hm.keySet()) {
        if(hm.get(key)== 1) 
        System.out.println(key);
        }
    }
}
