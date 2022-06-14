import java.io.*;
import java.util.*;
// Sort and merge two arrays into single array in sorted order.
public class SortedAndMerged {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        m= in.nextInt();
        n = in.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
    
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }
    
        mergedSorted(a, b, m, n);
        }
        public static void mergedSorted(int[] a, int[] b, int m, int n) {
            Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();
            for(int i = 0; i < m; i++)
            {
                mp.put(a[i],true);
            }
            for(int i = 0;i < n;i++)
            {
                mp.put(b[i], true);
            }
            for (Map.Entry<Integer,Boolean> me : mp.entrySet())
            {
                System.out.print(me.getKey() + " ");
            }
        }
    }