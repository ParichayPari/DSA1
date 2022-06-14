import java.util.HashMap;
import java.util.Scanner;
// this code is for the frequency checking of integer array having elements with multiple occurance.
public class CharFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) array[i] =in.nextInt();
        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int i = 0; i <array.length; i++) {
            int a=array[i];
            if(hm.containsKey(a)) {
                int f = hm.get(a);
                int up= f+1;
                hm.put(a, up);
            } else hm.put(a, 1);
        }
        System.out.println(hm);
        int mfc = hm.get(array[0]);
        for(Integer key: hm.keySet()) {
            if(hm.get(key)>hm.get(mfc)) mfc = key;
        }
        System.out.println(mfc);
    }
}
