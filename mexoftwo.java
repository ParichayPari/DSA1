import java.io.*;
import java.util.*;

public class mexoftwo {

//    You are given two non-negative integers, A and B. You are required to
//    print the smallest non-negative integer such that it is not equal to both A and B.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);

        int x = Collections.max(set);
        for(int i=0; i<=x+1;i++) {
            if(!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}